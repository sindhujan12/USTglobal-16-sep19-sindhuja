package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp2.products.dto.Products;

public class InsertDemo {
	public static void main(String[] args) {
		Products product = new Products();
		product.setId(1);
		product.setName("pen");
		product.setCost(10);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
		
		
		
	}


}
