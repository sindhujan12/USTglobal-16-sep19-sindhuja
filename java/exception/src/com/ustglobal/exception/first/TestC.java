package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("main started");
		int a = 10;
		int b = 0;
		try {
			b= 10/0;
			System.out.println(b);
			System.out.println("hi");
			System.out.println("hello");
		}catch (ArithmeticException ae) {
			System.out.println("num is didvided by zero");
		}
		
		System.out.println("main ended");
	}

}
