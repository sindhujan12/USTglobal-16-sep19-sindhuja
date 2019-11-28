package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		Predicate<Student> p = s ->{
			if(s.perc>= 35) {
				return true;
				
			}else {
				return false;
			}
		};
		
		Student s = new Student(1,"anju",37.9);
		boolean res = p.test(s);
		System.out.println("result "+res);
		
	}

}
