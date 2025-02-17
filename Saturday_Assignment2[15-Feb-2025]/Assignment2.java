package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//ArraySort
public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Elements: ");
		int size=sc.nextInt();
		System.out.println("Enter the Elements:");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		
		
		System.out.println(list);
		
		// Way-1
		Collections.sort(list);
		
		//Way-2 lambda
		
		list.sort( (a, b) -> { return -1 * a.compareTo(b); } );
        list.sort((s1, s2) -> s1.compareTo(s2));  
        
     
		
		System.out.println("ArrayList is Sorted");
		
		System.out.println(list);
	}
}