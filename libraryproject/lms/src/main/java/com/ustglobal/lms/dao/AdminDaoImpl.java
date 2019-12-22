package com.ustglobal.lms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.AdminBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;
@Repository
public class AdminDaoImpl implements AdminDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public AdminBean login(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from AdminBean where id=:id and password=:password";
		TypedQuery<AdminBean> query=manager.createQuery(jpql, AdminBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		AdminBean bean=query.getSingleResult();
		if(bean!=null) {
			return bean;
		}else {
			return null;
		}
	}

	

	@Override
	public boolean registerLibrarian(LibrarianBean bean) {
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
		}	}

	

	@Override
	public boolean deleteLibrarian(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			LibrarianBean bean=manager.find(LibrarianBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	@Override
	public boolean registerStudent(StudentBean bean) {
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
	public boolean deleteStudent(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			StudentBean bean=manager.find(StudentBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

}
