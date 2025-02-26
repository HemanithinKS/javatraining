
package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//LinkedListIterate
public class Assignment6 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList();

		list.add(10);
		list.add(30);
		list.add(20);
		list.add(10);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("No of Elements: ");
//		int size=sc.nextInt();
//		System.out.println("Enter the Elements:");
//		int a = 0;
//		for (int i = 0; i < size; i++) {
//			list.add(sc.nextInt());
//		}

		// way-1
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// way-2
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Way-3
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+ " ");
		}

	}
}
