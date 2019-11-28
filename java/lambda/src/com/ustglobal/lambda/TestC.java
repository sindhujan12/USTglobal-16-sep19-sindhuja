package com.ustglobal.lambda;

public class TestC {
	public static void main(String[] args) {
		MessageInterface msg = (message)->{
			System.out.println("hello");
			return message;
		
		
	};
	String m = msg.greet("sindhu");
	System.out.println(m);
	}
}
