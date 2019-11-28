package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		PenDrive p = new PenDrive();
		Usb.connect(p);
		
		Mouse m = new Mouse();
		Usb.connect(m);
	}

}
