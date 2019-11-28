package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class SelectJPQLQuery {
	public static void main(String[] args) {
		
	
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	 entityManager = entityManagerFactory.createEntityManager();
    String jpql= "select pname from Product";
    Query query = entityManager.createQuery(jpql);
    List<String>list= new ArrayList<String>();
   list = query.getResultList();
    for(String i : list) {
    	//System.out.println(i.getPid());
    	System.out.println(i);
    	//System.out.println(i.getPquantity());
    }
    
}
}

