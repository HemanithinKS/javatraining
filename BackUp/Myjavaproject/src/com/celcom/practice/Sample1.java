package com.celcom.practice;

public class Sample1 {

	{
		System.out.print("Instance");
	}

	static {
		System.out.print("Static");
	}

	public Sample1() {
		System.out.println("Constructor");
	}

//	 @Override
//	public String toString() {
//		// System.out.print("toString()");
//		return "toString()";
//	}
//
//	public int hashCode() {
//		// System.out.print("toString()");
//		return 22;
//	}

	public static void main(String[] args) {
		int j = 5;
		for (int i = 0; i < 0; i++, j--)
			;
		System.out.println(j);

		Sample1 obj = new Sample1();
		System.out.println(obj);
		Sample1 obj1 = new Sample1();
		System.out.println(obj1);

	}

}
