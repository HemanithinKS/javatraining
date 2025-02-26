package com.celcom.day3;

class A {
	A() {
		super();// Object is the parent class of super classa
		System.out.println("A");
	}

	A(int a) {
		System.out.println("A 1");
	}
}

class B extends A {
	B() {
		this(4);

		System.out.println("B");
	}

	B(int a) {
		super();

		System.out.println("B 1");
	}
}

public class SuperClassConstructor {

	public static void main(String[] args) {
		B b = new B();
	}

}
