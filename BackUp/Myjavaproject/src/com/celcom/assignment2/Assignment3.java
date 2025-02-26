package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//ArrayListCopy
public class Assignment3  {
	public static void main(String[] args)  {

		List<Integer> list = new ArrayList<Integer>();
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
//		for (int i = 0; i < size; i++) {
//			list.add(sc.nextInt());
//		}
	
		System.out.println("Orginal "+list);


		// way -1
		System.out.println(list);
		List<Integer> listcopy = new ArrayList<Integer>(list);
		System.out.println("Duplicate "+listcopy);
		
		// way 2
		List<Integer> listcopy2 = new ArrayList<Integer>();
		listcopy2.addAll(list);
		System.out.println("Duplicate "+listcopy2);
		
		// way-3
		List<Integer> listcopy3 = new ArrayList<Integer>(Collections.nCopies(list.size(), 0));
		Collections.copy(listcopy3, list);
		System.out.println("Duplicate "+listcopy3);
		
		// way-4
        List<Integer> clonedList = (List<Integer>) ((ArrayList<Integer>) list).clone();
        System.out.println("Cloned list :"+clonedList);

	}
}