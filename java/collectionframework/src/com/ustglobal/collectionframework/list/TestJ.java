package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1,"abc",67.89);
		Student s2 = new Student(1,"abcd",87.89);
		Student s3 = new Student(1,"abcde",47.89);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0;i<al.size();i++) {
			Student s = al.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.per);
		}
		System.out.println("======using for each========");
		for(Student s : al) {
			System.out.println(s);
		}
		
		
	}

}
