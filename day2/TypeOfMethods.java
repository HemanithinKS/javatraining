package com.celcom.day2;

public class TypeOfMethods {

	int a = 2;

	void m1() {
		System.out.println("Instance Method");
	}

	static void m2() {
		System.out.println("Static Method");

	}

	static public void main(String[] args) {
		TypeOfMethods obj = new TypeOfMethods();
		obj.m1();

		TypeOfMethods.m2();
	}
}
