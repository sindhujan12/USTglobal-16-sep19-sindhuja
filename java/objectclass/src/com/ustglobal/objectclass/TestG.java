package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Emp e1 = new Emp(1,"Roopa",10000);
		Emp e2 = new Emp(2,"Roop",10000);
		Emp e3 = new Emp(1,"Roopa",10000);
		Emp e4 = e3;
		
		
		
		boolean e = e1.equals(e2);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e);
		
	}
}
