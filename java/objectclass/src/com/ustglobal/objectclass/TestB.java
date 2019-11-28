package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		 int ph = p.hashCode();
		 System.out.println("hash code of p is "+ph);
		 
		 Pen q = new Pen();
		 int qh = q.hashCode();
		 System.out.println("hash code of q is "+qh);
		 
		 Pen r = new Pen();
		 int rh = r.hashCode();
		 System.out.println("hash code of r is "+rh);
	}

}
