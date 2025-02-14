package com.celcom.day9;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
//		list.add("Java");
		list.add(10);
		System.out.println(list);

		System.out.println(list.get(0));
		list.add(1, 15);
		System.out.println(list);

		list.set(1, 150);
		System.out.println(list);
		

	}
}
