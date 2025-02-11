package com.celcom.day4;

public class ConstructorOverloadingExample {
	ConstructorOverloadingExample(int a, int b) {
		this("ac", "bd");
		System.out.println("Integer concat: " + a + b);

	}

	ConstructorOverloadingExample(double a, double b) {
		System.out.println("Double concat: " + a + b);
	}

	ConstructorOverloadingExample(String a, String b) {
		this(10.4, 11.2);
		System.out.println("Stsring concat: " + a + b);
	}

	public static void main(String[] args) {
		new ConstructorOverloadingExample(10, 11);
//		new ConstructorOverloadingExample(10, 11);
//		new ConstructorOverloadingExample("ac", "bd");

	}
}