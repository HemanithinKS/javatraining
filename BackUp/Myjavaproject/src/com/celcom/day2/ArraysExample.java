package com.celcom.day2;

public class ArraysExample {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int sum2 = 0;

		System.out.println("Array Length" + arr.length);

		System.out.println("Arrays Elements :");

		/*
		 * for(int index= 0; index< arr.length; index++) {
		 * System.out.println(arr[index]);
		 * 
		 * sum = sum + arr[index]; }
		 */

		for (int value : arr) {
			System.out.println(value);
			sum2 += value;

		}

		System.out.println("Sum of Array= " + sum2);
	}

}
