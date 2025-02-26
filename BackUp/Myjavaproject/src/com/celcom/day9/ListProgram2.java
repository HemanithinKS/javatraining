package com.celcom.day9;

import java.util.ArrayList;
import java.util.List;

public class ListProgram2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
//		list.add("Java");
		list.add(10);
		System.out.println(list);
		
		list.remove(new Integer(10));
		System.out.println(list);
		list.remove(new Integer(10));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);


		

	}
}
