package com.celcom.day10;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSameElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the first array: ");
		int n = sc.nextInt();
		int[] array1 = new int[n];

		// Input elements for first array
		System.out.println("Elements for the first array:");
		for (int i = 0; i < n; i++) {
			array1[i] = sc.nextInt();
		}
		Arrays.sort(array1);

		// Get size of second array
		System.out.print("Enter the size of the second array: ");
		int n2 = sc.nextInt();
		int[] array2 = new int[n2];

		// Input elements for second array
		System.out.println("Elements for the second array:");
		for (int i = 0; i < n2; i++) {
			array2[i] = sc.nextInt();
		}
		Arrays.sort(array2);
		System.out.println(array2);
		boolean flag = false;

		if (n == n2) {
			for (int i = 0; i < array2.length; i++) {
				if (array1[i] == array2[i]) {
					continue;
				} else {
					flag = true;
					break;

				}
			}
		} else {

			System.out.println("Two arrays contains different elements size");

		}

		if (flag) {
			System.out.println("Two arrays contains different elements");
		} else {
			System.out.println("Two arrays contains same elements");
		}

		sc.close();

	}

}
