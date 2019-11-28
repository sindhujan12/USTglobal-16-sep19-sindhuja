package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Marker();
		System.out.println(p.cost);
		p.write();
		Marker m = (Marker) p; //downcast
		System.out.println(m.size);
		m.color();
		m.write();
	}

}
