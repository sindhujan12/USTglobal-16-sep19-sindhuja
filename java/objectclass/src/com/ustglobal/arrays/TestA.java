package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] n = new int[2];
		n[0] = 10;
		n[1] = 20;
		for (int j = 0; j<n.length;j++) {
			System.out.println(n[j]);
			
		}	
		System.out.println("=============================");
			for (int j : n) {
				System.out.println(j);
			
		}
			System.out.println("=============================");
			byte [] a = {1,2,3};
			for (int j = 0; j<a.length;j++) {
				System.out.println(a[j]);
				
			}	
			System.out.println("=============================");
				for (byte j : a) {
					System.out.println(j);
	}
				String [] b = {"abc","def","ghi"};
				for (int j = 0; j<b.length;j++) {
					System.out.println(b[j]);
					
				}	
				System.out.println("=============================");
					for (String j : b) {
						System.out.println(j);
		}
	}
}
