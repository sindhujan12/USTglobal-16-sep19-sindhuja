package com.ustglobal.exception.first;

public class TestD {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] a = {10,22,34,};
		int b = 10;
		try {
			System.out.println(a[3]);
			System.out.println(b/0);
		}catch(ArithmeticException ae) {
			System.out.println("num divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index is not present");
		}
		System.out.println("main ended");
	}
	}


