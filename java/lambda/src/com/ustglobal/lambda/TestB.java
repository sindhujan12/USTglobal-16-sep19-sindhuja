package com.ustglobal.lambda;

public class TestB {
public static void main(String[] args) {
	MultiplyInterface multi = (a,b)->a*b;
	int product = multi.mul(22,88);
	System.out.println("product is "+product);
}
}
