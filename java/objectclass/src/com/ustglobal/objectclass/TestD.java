package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s1 = new Student(10,"priya",88.88);
		int code = s1.hashCode();
		System.out.println(code);
		
		String s = s1.toString();
		System.out.println(s);
	}

}
