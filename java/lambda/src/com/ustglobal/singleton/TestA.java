package com.ustglobal.singleton;

public class TestA {
public static void main(String[] args) {
	
	MySingleton ms = MySingleton.getDbConnection();
	ms.s = "hello";
	System.out.println("hashcode of ms "+ms.hashCode());
	MySingleton mx = MySingleton.getDbConnection();
	mx.s = "hi";
	System.out.println("hashcode of mx "+mx.hashCode());
	
	System.out.println(ms.s);
	System.out.println(mx.s);
		
	
	
}
}
