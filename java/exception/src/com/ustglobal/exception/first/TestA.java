package com.ustglobal.exception.first;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		int[] a = {10,22,34,};
		System.out.println(a[1]);
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("index is not present");
		}
		System.out.println("main ended");
	}

}
