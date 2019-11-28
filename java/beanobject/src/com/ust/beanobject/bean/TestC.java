package com.ust.beanobject.bean;

import java.util.Scanner;

public class TestC {
public static void main(String[] args) {
	System.out.println("scanner class");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter age");
	int age = sc.nextInt();
	System.out.println("age is "+age);
	System.out.println("enter gender");
	String gender = sc.next();
	sc.nextLine();
	System.out.println("gender is "+gender);
	System.out.println("enter job");
	String job = sc.next();
	System.out.println("job is "+job);
}
}
