package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
	lh.put("ballari", 583104);
	lh.put("bangalore", 560068);
	lh.put("mumbai", 6543456);
	
	System.out.println(lh);
	Set<String> s = lh.keySet();
	for(String key : s) {
		System.out.println("key "+key);
	}
	System.out.println("========================================");
	Collection<Integer> c = lh.values();
	for(Integer value : c) {
		System.out.println("value "+value);
	}
	System.out.println("===========================================");
}
}
