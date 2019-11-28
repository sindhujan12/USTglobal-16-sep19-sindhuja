package com.ust.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
Emp s1 = new Emp();
        s1.setId(12);
		s1.setName("sindhu");
		s1.setDept(123);
		s1.setDesignation("developer");
		s1.setSalary(80000);
		Db d = new Db();
		d.rec(s1);
	}

}
