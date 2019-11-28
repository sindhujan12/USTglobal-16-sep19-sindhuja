package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

import com.ustglobal.java8features.Student;

public class TestA {
	public static void main(String[] args) {
		Predicate<Person> p = s ->{
			if(s.weight>= 50) {
				return true;
				
			}else {
				return false;
			}
		};
		
		Person s = new Person(22,55.6);
		boolean res = p.test(s);
		System.out.println("result "+res);
		
	}
	}


