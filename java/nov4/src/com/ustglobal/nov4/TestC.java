package com.ustglobal.nov4;

import java.util.Collections;
import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(11);
		l.add(14);
		l.add(12);
		l.add(15);
		l.add(13);


		System.out.println("before sort"+l);

		Collections.sort(l);
		System.out.println("after sort"+l);
		
		Collections.reverse(l);
		System.out.println("after reverse "+l);
		
		Collections.shuffle(l);
		System.out.println("after shuffle "+l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
