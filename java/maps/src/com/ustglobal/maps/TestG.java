package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		 Employee s1 = new  Employee(2,"divya", 87.9);
		 Employee s2 = new  Employee(12,"bhavya", 67.9);
		 Employee s3 = new  Employee(9,"sia", 97.9);
		 Employee s4 = new  Employee(8,"diya", 88.9);
		 Employee s5 = new  Employee(6,"ria", 87.9);
		 Employee s6 = new  Employee(3,"jia", 55.9);
		 Employee s7 = new  Employee(7,"pia", 84.9);
		 Employee s8 = new  Employee(4,"arya", 65.9);
		 Employee s9 = new  Employee(1,"sanju", 99.9);
		 
		 ArrayList<Employee> al = new ArrayList<>();
		 al.add(s1);
		 al.add(s2);
		 al.add(s3);
		 
		 ArrayList< Employee> al1 = new ArrayList<>();
		 al1.add(s4);
		 al1.add(s5);
		 al1.add(s6);
		 
		 ArrayList< Employee> al2 = new ArrayList<>();
		 al2.add(s7);
		 al2.add(s8);
		 al2.add(s9);
		 
		 HashMap<String,ArrayList< Employee>> hm = new HashMap<>();
		 hm.put("first", al);
		 hm.put("second", al1);
		 hm.put("third", al2);
		 
		 ArrayList< Employee> first = hm.get("second");
		 
		 Iterator< Employee> it = first.iterator();
		 while(it.hasNext()) {
			 Employee s = it.next();
			 System.out.println("id is "+s.id1);
			 System.out.println("name is "+s.name1);
			 System.out.println("salary is "+s.salary1);
			 System.out.println("===============================================");
		 }
	}

}
