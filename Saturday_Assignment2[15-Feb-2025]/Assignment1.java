package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// ArraySearch
public class Assignment1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter the Elements and Enter -1 to exit ");
//		int a = 0;
//		while (a != -1) {
//			a = sc.nextInt();
//			list.add(a);
//		}

		System.out.println("No of Elements: ");
		int size = sc.nextInt();
		System.out.println("Enter the Elements:");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter the Element to Find : ");
		int find = sc.nextInt();

		// Way -1
		if (list.contains(find)) {
			System.out.println("Element " + find + " is present in " + " Index : " + list.indexOf(find));

		} else {
			System.out.println("Element " + find + " is not present in arraylist");
		}

		// Way -2
		if (list.indexOf(find) != -1) {
			System.out.println("Element " + find + " is present in " + " Index : " + list.indexOf(find));

		} else {
			System.out.println("Element " + find + " is not present in arraylist");
		}

		// Way-3
		Iterator<Integer> it = list.iterator();
		boolean flag = false;
		for (Integer integer : list) {
			if (integer == find) {
				System.out.println("Element " + find + " is present in " + " Index : " + list.indexOf(find));
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Element " + find + " is not present in arraylist");

		}

	}
}