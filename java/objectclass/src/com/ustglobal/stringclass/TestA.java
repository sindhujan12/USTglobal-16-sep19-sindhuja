package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "riya";
		String s2 = "priya";
		String s3 = new String ("riya");
		String s4 = new String ("riya");
		String s5 = "riya";
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);
		boolean b = s1.equalsIgnoreCase("riya");
		System.out.println(b);
		System.out.println("==========================================");
		
		StringBuffer sb1 = new StringBuffer("Roopa");
		sb1.append("Chandu");
		System.out.println(sb1);
		
		
	}

}
