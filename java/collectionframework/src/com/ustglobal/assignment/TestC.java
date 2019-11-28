package com.ustglobal.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<Student1> ();
		Student1 s1 = new Student1 (101,"Sindhu","IRTT","ECE",9786950);
		Student1 s2 = new Student1 (101,"Bindhu","TPGIT","MECH",9585636);
		Student1 s3 = new Student1 (101,"Indhu","MIT","CSE",97861274);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0; i<al.size();i++) {
			Student1 s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("College is "+s.clg);
			System.out.println("Department is "+s.dept);
			System.out.println("Mobileno is "+s.mobileno);
		}
		System.out.println("============for each=========");
		for(Student1 s : al) {
			System.out.println(s);
		}
		System.out.println("============Using iterator===============");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println("================Using list iterator forward============");
		ListIterator lt = al.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		System.out.println("=============Using list iterator Backward==========");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
	}

}
