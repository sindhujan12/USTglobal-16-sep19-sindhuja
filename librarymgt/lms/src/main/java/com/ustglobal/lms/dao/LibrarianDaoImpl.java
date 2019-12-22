package com.ustglobal.lms.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.BookIssueBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;
@Repository
public class LibrarianDaoImpl implements LibrarianDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public LibrarianBean login(String email, String password) {
	EntityManager manager=factory.createEntityManager();
	String jpql="from LibrarianBean where email=:email and password=:password";
	try {
		TypedQuery<LibrarianBean> query=manager.createQuery(jpql, LibrarianBean.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		LibrarianBean bean=query.getSingleResult();
		return bean;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	
	@Override
	public boolean addBook(BookBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean updateBook(BookBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			BookBean bookBean=manager.find(BookBean.class, bean.getBid());
			bookBean.setAuthor(bean.getAuthor());
			bookBean.setBid(bean.getBid());
			bookBean.setName(bean.getName());
			bookBean.setPublication(bean.getPublication());
			bookBean.setStatus(null);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean removeBook(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		BookBean bean=manager.find(BookBean.class, id);
		transaction.begin();
		try {
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<BookIssueBean> requestedIssue() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from BookIssueBean where status=:status";
		TypedQuery<BookIssueBean> query=manager.createQuery(jpql, BookIssueBean.class);
		query.setParameter("status", "issue");
		List<BookIssueBean> bookBeans=query.getResultList();
		return bookBeans;
	}

	@Override
	public List<BookIssueBean> requestedReturn() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from BookIssueBean where status=:status";
		TypedQuery<BookIssueBean> query=manager.createQuery(jpql, BookIssueBean.class);
		query.setParameter("status", "return");
		List<BookIssueBean> bookBeans=query.getResultList();
		return bookBeans;
	}
	@Override
	public boolean acceptBook(int sid,int bid) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String accept="accept";
		String jpql="update BookIssueBean set issueDate=:issueDate, status=:status where bid=:bid and sid=:sid";
		try {
			Query query=manager.createQuery(jpql);
			query.setParameter("sid", sid);
			query.setParameter("bid", bid);
			query.setParameter("status", accept);
			java.sql.Date sqlDate=new java.sql.Date(new Date().getTime());
			query.setParameter("issueDate",sqlDate);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	@Override
	public boolean acceptReturn(int sid, int bid) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String jpql="update BookIssueBean set returnDate=:returnDate, status=:status where bid=:bid and sid=:sid";
		try {
			TypedQuery<BookIssueBean> query=manager.createQuery(jpql, BookIssueBean.class);
			query.setParameter("bid", bid);
			query.setParameter("status", "available");
			java.sql.Date sqlDate=new java.sql.Date(new Date().getTime());
			query.setParameter("returnDate",sqlDate);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	
}
