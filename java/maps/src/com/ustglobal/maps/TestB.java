package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("nikki",2345678);
		hm.put("mikki",45678345);
		hm.put("likki",34567845);
		
		HashMap hm1 = new HashMap();
		hm1.put("cikki",8745678);
		hm1.put("rikki",5678987);
		hm1.put("hikki",678789);
		
		boolean haskey = hm.containsKey("likki");
		System.out.println("has key "+haskey);
		
		boolean hasvalue = hm.containsValue(23456789);
		System.out.println("has value "+hasvalue);
		
		hm.putAll(hm1);
		System.out.println("after put all  "+hm);
		
		System.out.println(hm.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
