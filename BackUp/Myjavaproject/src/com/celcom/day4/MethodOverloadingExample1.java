package com.celcom.day4;

public class MethodOverloadingExample1 {

	void myMethod(int a) {
		int fact = 1;
		for (int i = 0; i < 5; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial" + fact);
	}

	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("Addition: " + sum);
	}

	void myMethod(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		MethodOverloadingExample1 obj = new MethodOverloadingExample1();
		obj.myMethod(5);
		obj.myMethod(10, 9);
		obj.myMethod("Nithin");

	}
}
