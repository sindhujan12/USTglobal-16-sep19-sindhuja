package com.ustglobal.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Teacher> al = new ArrayList<Teacher> ();
		Teacher e1 = new Teacher ("Maths","Ankitha",45000);
		Teacher e2 = new Teacher ("Science","Nikitha",56000);
		Teacher e3 = new Teacher ("ComputerScience","Sabitha",40000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(int i = 0; i<al.size();i++) {
			Teacher t = al.get(i);
			System.out.println("Id is "+t.sub);
			System.out.println("Name is "+t.name);
			System.out.println("Salary is "+t.salary);
		}
		System.out.println("============for each=========");
		for(Teacher t : al) {
			System.out.println(t );
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
