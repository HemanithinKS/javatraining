package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//LinkedListCopy 
public class Assignment10 {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(13);
		list.add(-12);
		list.add(12);
		list.add(8);
		list.add(8);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("No of Elements: ");
//		int size=sc.nextInt();
//		System.out.println("Enter the Elements:");
//		int a = 0;
//		for (int i = 0; i < size; i++) {
//			list.add(sc.nextInt());
//		}

		// way -1
		System.out.println(list);
		List<Integer> listcopy = new LinkedList<Integer>(list);
		System.out.println(listcopy);

	}
}