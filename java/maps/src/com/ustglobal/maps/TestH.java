package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(700, "ajay");
		ht.put(100, "vijay");
		ht.put(500, "sujay");
		ht.put(650, "raj");
		ht.put(800, "rajesh");
		ht.put(101, "ram");
		//ht.put(null, "ajay"); null pointer exception
		//ht.put(109, null);null pointer exception
		System.out.println("data "+ht);
	}

}
