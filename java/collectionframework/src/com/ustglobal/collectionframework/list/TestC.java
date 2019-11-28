package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("riya");
		al.add(true);
		
		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("object 1 "+o1);
		
		Object o2 = it.next();
		System.out.println("object 2 "+o2);
		
		Object o3 = it.next();
		System.out.println("object 3 "+o3);
		
		Object o4 = it.next();
		System.out.println("object 4 "+o4);
		
		boolean b = it.hasNext();
		System.out.println("has next "+b);
		
//		Object o5 = it.next();
//		System.out.println("object 5 "+o5);
//		NoSuchElementException
		System.out.println("=========Using Loops=========");
	for(int i=0;i<al.size();i++) {
		Object o = al.get(i);
		System.out.println(o);
	}
	ArrayList al1 = new ArrayList();
	al1.add(121);
	al1.add(221.5);
	al1.add("priya");
	al1.add(true);
	
	System.out.println("=========Using Iterators=======");
	Iterator it1 = al1.iterator();
	while(it1.hasNext()) {
		Object o = it1.next();
		System.out.println(o);
	}
	
	
	
}
}
