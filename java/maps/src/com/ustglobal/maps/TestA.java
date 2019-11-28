package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("nikki",2345678);
		hm.put("mikki",45678345);
		hm.put("likki",34567845);
		hm.put("null",6784567);
		hm.put("null",56784597);
		
		
		System.out.println("data "+hm);
		hm.put("mikki",989899);
		System.out.println("after modification "+hm);
		
		hm.put("dimple",989899 );
		System.out.println("after dimple "+hm);
		System.out.println("=========================================");
		
		Object phno = hm.get("mikki");
		System.out.println("value "+phno);
		System.out.println("=========================================");
		
		
		Object phno1 = hm.get("rikki");
		System.out.println("value "+phno1);
		System.out.println("=========================================");
		
		Object value = hm.remove("likki");
		System.out.println("value "+value);
		System.out.println("after remove  "+hm);
		System.out.println("=========================================");
	}

}
