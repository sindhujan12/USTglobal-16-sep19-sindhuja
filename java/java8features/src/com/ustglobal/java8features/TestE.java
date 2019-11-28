package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestE {
public static void main(String[] args) {
	
	Supplier<Student> s = () -> new Student(2,"ashu",98.9);
	
	Student s1 = s.get();
	System.out.println("id is "+s1.id);
	System.out.println("name is "+s1.name);
	System.out.println("percentage is "+s1.perc);
	
	Supplier<Integer> i = () -> 20;
	int val = i.get();
	System.out.println("value is "+val);
	
	Supplier<String> sp = () -> "Dream";
	String v = sp.get();
	System.out.println("value is "+v);
	
	
}
}
