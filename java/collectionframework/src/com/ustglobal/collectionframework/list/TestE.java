package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//	al.add(12);
		//	al.add(22.5);
		al.add("riya");
		//	al.add(true);
		Object o = al.get(0);
		String name = (String) o;
		name = name.toUpperCase();
		System.out.println(name);

	}
}
