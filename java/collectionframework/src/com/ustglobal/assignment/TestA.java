package com.ustglobal.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee> ();
		Employee e1 = new Employee (101,"Ankitha",45000);
		Employee e2 = new Employee (101,"Nikitha",56000);
		Employee e3 = new Employee (101,"Sabitha",40000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(int i = 0; i<al.size();i++) {
			Employee e = al.get(i);
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
		}
		System.out.println("============for each=========");
		for(Employee e : al) {
			System.out.println(e);
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
