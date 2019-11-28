package com.ustglobal.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("ballari", 583104);
		lh.put("bangalore", 560068);
		lh.put("mumbai", 6543456);
		//lh.put("null", 6543456); NullPointerException
		
		for(Map.Entry<String, Integer> m: lh.entrySet()) {
			Integer value = m.getValue();
			String key = m.getKey();
			System.out.println("key "+key);
			System.out.println("value "+value);
		}
		
		
		
		
	}

}
