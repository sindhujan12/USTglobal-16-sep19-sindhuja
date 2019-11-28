package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
	
    int[] n = {1,2,3,4,5};
    receive(n);
   int[] values = getArray();
   for(int val : values) {
		System.out.println(val);
   }
		String[] value = get();
		   for(String va : value) {
				System.out.println(va);
	}
}
	static void receive(int[] numbers) {
		for(int n : numbers) {
			System.out.println(n);
		}
	}
	static int[] getArray() {
		int[] values = {22,33,44,55};
		return values;
	}
	static void receive(String[] abc) {
		for(String a : abc) {
			System.out.println(a);
		}
	}
	static String[] get() {
		String[] value = {"aaa","bbb","ccc"};
		return value;
	}
}
