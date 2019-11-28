package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c1 = new Car(50000000, "BMW", "black");
		Car c2 = new Car(80000000, "Audi", "black");
		Car c3 = new Car(30000000, "Swift", "white");
		
		int car1 = c1.hashCode();
		System.out.println(car1);
		
		String s1 = c1.toString();
		System.out.println(s1);
		
		int car2 = c2.hashCode();
		System.out.println(car2);
		
		String s2 = c2.toString();
		System.out.println(s2);
		
		int car3 = c3.hashCode();
		System.out.println(car3);
		
		String s3 = c3.toString();
		System.out.println(s3);
	}

}
