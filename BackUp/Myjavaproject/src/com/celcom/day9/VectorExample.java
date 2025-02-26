
package com.celcom.day9;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();

//		System.out.println(vec.size());// 0
//		System.out.println(vec.capacity());// 3

		vec.add(10);
		vec.add(20);
		vec.add(30);
//		System.out.println(vec.size());// 3
//		System.out.println(vec.capacity());// 3

		vec.add(40);
//		System.out.println(vec.size());// 4
//		System.out.println(vec.capacity());// 5
		System.out.println();
		// way-1
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i)+ " ");
		}
		System.out.println();
		// way-2
		for (Integer integer : vec) {
			System.out.print(integer+ " ");
		}
		System.out.println();
		Enumeration<Integer> e = vec.elements();
		while (e.hasMoreElements())
			System.out.print(e.nextElement()+ " ");

	}
}
