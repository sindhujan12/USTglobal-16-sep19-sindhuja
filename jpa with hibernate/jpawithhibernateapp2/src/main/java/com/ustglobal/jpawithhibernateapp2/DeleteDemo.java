package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp2.products.dto.Products;

public class DeleteDemo {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			 entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Products product = entityManager.find(Products.class,1);
			entityManager.remove(product);
			System.out.println("Record deleted");
			entityTransaction.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}
		


}
