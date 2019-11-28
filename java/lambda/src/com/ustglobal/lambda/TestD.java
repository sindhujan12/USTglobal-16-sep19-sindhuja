package com.ustglobal.lambda;

public class TestD {
public static void main(String[] args) {
	SquareInterface si = x->x*x;
	int sq = si.square(5);
	System.out.println("square of the given number is "+sq);
}
}
