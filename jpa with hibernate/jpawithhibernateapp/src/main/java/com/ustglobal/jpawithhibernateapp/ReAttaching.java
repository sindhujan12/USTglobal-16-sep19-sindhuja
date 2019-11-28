package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReAttaching {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		
		try {	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class,1);
			System.out.println(entityManager.contains(product));
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			Product product1 = entityManager.merge(product);
			product1.setPname("mobile");
			System.out.println("Record Updated");
			entityTransaction.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}

	}


