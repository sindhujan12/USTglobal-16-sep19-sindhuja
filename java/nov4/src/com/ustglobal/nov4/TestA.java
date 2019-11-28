package com.ustglobal.nov4;

import java.util.ArrayList;
import java.util.List;

public class TestA {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();
	al.add(34.8);
	al.add(37.7);
	al.add(56.4);
	al.add(77.3);
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	
	al.add(2,22.22);
	System.out.println("after add in 2nd index "+al);
	al.remove(0);
	System.out.println("after removing 0th index "+al);
	al.remove(null);
	System.out.println("after removing null "+al);
	Double val = al.get(4);
	System.out.println("object at 4th index "+al);
	al.set(3, 11.11);
	System.out.println("after replacing 2nd index "+al);
	al.clear();
	System.out.println("after clearing method "+al);
	al.contains(54.6);
	
	List<Double> ab = new ArrayList<Double>();
	ab.add(12.2);
	ab.add(13.2);
	ab.add(14.2);
	ab.add(15.2);
	
	al.addAll(ab);
	System.out.println("after add all "+al);
	
	boolean contain = al.containsAll(ab);
	System.out.println("contains all of all "+contain);
	
	boolean res = al.removeAll(ab);
	System.out.println("remove all of all "+res);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
