package com.celcom.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 4, 20, 3, 10, 5, 15, 18 };
//	int arr[] = new int[8];
//	for (int i = 0; i < arr.length; i++) {
//		arr[i]=sc.nextInt();
//		
//	}
//  int sum =sc.nextInt();		
//	
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int sum = 33;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> inlist = new ArrayList<Integer>();
			temp = 0;
			for (int j = i; j < arr.length; j++) {
				if (temp < sum) {
					temp += arr[j];
					inlist.add(arr[j]);
				} else {
					break;
				}
			}
			if (temp == sum) {
				list.add(inlist);
			}
		}
		if (list.isEmpty()) {
			System.out.println("No suspicious Activity");
		} else {
			System.out.println("Suspicious Activity Found");
			System.out.println(list);
		}
	}
}
