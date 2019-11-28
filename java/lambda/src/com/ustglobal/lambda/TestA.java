package com.ustglobal.lambda;

public class TestA implements AddInterface {
	public static void main(String[] args) {
		TestA a = new TestA();
		int sum = a.add(10, 20);
		System.out.println("sum is "+sum);
	}

	@Override
	public int add(int a, int b) {
		return a+b;
		
	}

}
