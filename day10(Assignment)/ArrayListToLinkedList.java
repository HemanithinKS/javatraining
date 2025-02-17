package com.celcom.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);

		// ArrayList To Linked List

		// way 1
		List<Integer> linklist = new LinkedList<Integer>(list);
		System.out.println(linklist);

		// way 2
		List<Integer> linklistadd = new LinkedList<Integer>();
		linklistadd.addAll(list);
		System.out.println(linklistadd);

		// LinkedList To arrayList

		// way 1
		List arrayList = new ArrayList<>(linklist);
		System.out.println(arrayList);

		// way-2
		List arrayList2 = new ArrayList<>();
		arrayList.add(linklistadd);
		System.out.println(arrayList2);

	}
}
