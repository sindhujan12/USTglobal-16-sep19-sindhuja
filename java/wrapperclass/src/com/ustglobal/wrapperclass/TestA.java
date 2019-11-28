package com.ustglobal.wrapperclass;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;  // boxing or auto boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;    //unboxing or auto un boxing
		System.out.println("y is "+y);
	}

}
