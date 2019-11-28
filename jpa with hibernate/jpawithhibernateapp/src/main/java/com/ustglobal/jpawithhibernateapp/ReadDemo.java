package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product productDetail = entityManager.find(Product.class,1);
		System.out.println("Id: "+productDetail.getPid());
		System.out.println("Name: "+productDetail.getPname());
		System.out.println("Quantity: "+productDetail.getPquantity());
		entityManager.close();
		
	}

}
