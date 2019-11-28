package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp2.products.dto.Products;


public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Products productDetail = entityManager.find(Products.class,1);
		System.out.println("Id: "+productDetail.getId());
		System.out.println("Name: "+productDetail.getName());
		System.out.println("Quantity: "+productDetail.getCost());
		entityManager.close();
		
	}

}
