package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("riya");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("------------->forward");
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		while(li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
}
}
