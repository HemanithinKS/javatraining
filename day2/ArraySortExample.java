package com.celcom.day2;

import java.util.Arrays;

public class ArraySortExample {
	public static void main(String[] args) {
		int arr[] = { 2, 6, 7, 8, 9, 5 };

		Arrays.sort(arr);

		// Ascending order
		System.out.println("Ascending order:");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}

		System.out.println("\nMinimum Value : " + arr[0]);
		System.out.println("Second Minimum Value : " + arr[1]);

		System.out.println("Maximum Value : " + arr[arr.length - 1]);
		System.out.println("Second Maximum Value : " + arr[arr.length - 2]);

		// Descending Order
		System.out.println("Descending order:");
		for (int index = arr.length - 1; index >= 0; index--) {
			System.out.print(arr[index] + " ");
		}

	}
}
