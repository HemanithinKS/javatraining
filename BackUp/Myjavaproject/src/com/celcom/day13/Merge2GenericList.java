package com.celcom.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge2GenericList {
	public static <T> List<T> mergeList(List<T> list1, List<T> list2) {
		List<T> mergedList = new ArrayList<T>();

		for (int i = 0; i < Math.max(list1.size(), list2.size()); i++) {
			if (i < list1.size()) {
				mergedList.add((T) list1.get(i));
			}
			if (i < list2.size()) {
				mergedList.add((T) list2.get(i));
			}

		}

		return mergedList;

	}

	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");

		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");

		System.out.println(mergeList(list1, list2));

		List<Integer> listA = new ArrayList<>();
		List<Integer> listB = new ArrayList<>();

		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);

		listB.add(10);
		listB.add(20);
		listB.add(30);
		listB.add(40);
		listB.add(50);
		
		System.out.println(mergeList(listA, listB));

	}
}
