package com.ustglobal.exception.first;

public class Paytm {
	void book() {
		System.out.println("paytm started");
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("paytm ended");
	}

}
