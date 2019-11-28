package com.ustglobal.jpawithhibernateapp.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestManyToOne {
public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(10);
		pb.setBname("apsara");
		Pencil p = new Pencil();
		p.setPid(1);
		p.setPcolor("black");
		p.setPencilBox(pb);
		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setPcolor("grey");
		p1.setPencilBox(pb);
		
		
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		
	try {	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
//		VoterCard vcard=entityManager.find(VoterCard.class, 10);
//		System.out.println(vcard.getPerson().getPid());
		
//		PencilBox pBox = entityManager.find(PencilBox.class, 1);
//		System.out.println(pBox.getPencil().getPid());
	
		//entityManager.persist(p);
		entityManager.persist(p1);
		System.out.println("Record Saved");
		entityTransaction.commit();
		
	} catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();

}

}
