package com.ustglobal.immutable;

public class TestA {
	public static void main(String[] args) {
		MyString ms = new MyString(12,"riya");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		ms.changeContent(20, "roopa");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		
	}

}
