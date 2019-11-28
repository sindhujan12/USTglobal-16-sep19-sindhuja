package com.ustglobal.exception.customunchecked;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		
		Validator v = new Validator();
		try {
			v.verify(12);
		}catch(InvalidAgeException ie) {
			System.out.println("exception handled");
		}
		System.out.println("main ended");
	}

}
