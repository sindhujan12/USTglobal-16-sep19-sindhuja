package com.ust.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("sindhu");
		s.setRollNo(123);
		
		Database db = new Database();
		db.receive(s);
	}

}
