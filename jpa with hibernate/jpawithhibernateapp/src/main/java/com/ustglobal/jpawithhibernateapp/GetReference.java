package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		
	
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	 entityManager = entityManagerFactory.createEntityManager();
	Product productDetail = entityManager.getReference(Product.class,1);
	System.out.println("Id: "+productDetail.getPid());
	System.out.println("Name: "+productDetail.getPname());
	System.out.println("Quantity: "+productDetail.getPquantity());
	entityManager.close();
	
	
	}
}
