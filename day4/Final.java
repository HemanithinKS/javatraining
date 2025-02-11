package com.celcom.day4;

class ClassAlpha {
	{
		System.out.println("Alpha");
	}

	public String toString() {
		return "TO STRING";
	}

	static {
		System.out.println("Static method");
	}
	static {
		System.out.println("Static method1.5");
	}

	ClassAlpha() {
		System.out.println("Constructor");
	}
}

class ClassBeta extends ClassAlpha {
	{
		System.out.println("Beta");
	}
	static {
		System.out.println("Static2 method");
	}

	ClassBeta() {
		System.out.println(" bConstructor");
	}
}

class ClassGamma extends ClassBeta {
	{
		System.out.println("Gamma");
	}
	static {
		System.out.println("Static method3");
	}
}

public class Final {
	public static void main(String[] args) {
		System.out.println("Main class Method");
		ClassGamma gamma = new ClassGamma();
		System.out.println(gamma);
	}
}