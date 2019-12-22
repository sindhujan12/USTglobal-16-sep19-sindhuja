package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookIssueBean;
import com.ustglobal.lms.dto.StudentBean;

@Repository
public class StudentDaoImpl implements StudentDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean returnBook(int sid, int bid) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			String jpql="update BookIssueBean set status=:status where sid=:sid and bid=:bid";
			Query query=manager.createQuery(jpql);
			query.setParameter("status", "return");
			query.setParameter("sid", sid);
			query.setParameter("bid", bid);
			query.executeUpdate();
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	
	@Override
	public BookBean searchById(int bid) {
		EntityManager manager=factory.createEntityManager();
		try {
			BookBean bean=manager.find(BookBean.class, bid);
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<BookIssueBean> myBooks(int sid) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			String jpql="from BookIssueBean where status=:status and sid=:sid";
			TypedQuery<BookIssueBean> query=manager.createQuery(jpql, BookIssueBean.class);
			query.setParameter("status", "accept");
			query.setParameter("sid", sid);
			List<BookIssueBean> list=query.getResultList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public StudentBean login(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from StudentBean where email=:email and password=:password";
		TypedQuery<StudentBean> query=manager.createQuery(jpql, StudentBean.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		StudentBean bean=query.getSingleResult();
		if(bean!=null) {
			return bean;
		}else {
			return null;
		}
	}

	@Override
	public BookBean search(String name) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from BookBean where name=:name";
		TypedQuery<BookBean> query=manager.createQuery(jpql, BookBean.class);
		BookBean bean=query.getSingleResult();
		if(bean!=null) {
			return bean;
		}else {
			return null;
		}
	}

	@Override
	public boolean request(int sid,int bid, String status) {
		 EntityManager manager=factory.createEntityManager();
		 EntityTransaction transaction=manager.getTransaction();
		 transaction.begin();
		 try {
			 
			 BookBean bean=manager.find(BookBean.class, bid);	
			 StudentBean studentBean=manager.find(StudentBean.class, sid);
			 BookIssueBean bookIssueBean=new BookIssueBean();
			 bookIssueBean.setStudent(studentBean);
			 bookIssueBean.setBook(bean);
			 bookIssueBean.setStatus(status);
			 manager.persist(bookIssueBean);
			
			 transaction.commit();
			 return true;
			} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
	}

	@Override
	public List<BookBean> getAll() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from BookBean where status=:status";
		TypedQuery<BookBean> query=manager.createQuery(jpql, BookBean.class);
		query.setParameter("status", "available");
		List<BookBean> books=query.getResultList();
		if(books!=null) {
			return books;
		}else {
			return null;
		}
	}
}
