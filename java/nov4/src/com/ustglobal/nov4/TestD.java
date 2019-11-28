package com.ustglobal.nov4;

import java.util.ArrayList;
import java.util.Collections;

public class TestD {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Priya");
		a.add("Riya");
		a.add("Jiya");
		a.add("Zoya");
		
		System.out.println("before sorting "+a);
		Collections.sort(a);
		System.out.println("after sorting "+a);
	}

}
