package com.celcom.day8;

public class StringMethodsExample2 {

	public static void main(String[] args) {

		String s1 = "Java";

		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i)+ " ");
		}
		System.out.println();
		char ch[] = s1.toCharArray();
		for (char c : ch) {
			System.out.print(c + " ");
		}
		System.out.println();
		String s2 = "Welcome to Java Programing";
		String temp[] = s2.split(" ");
		for (String string : temp) {
			System.out.print(" " + string);
		}
	}
}
