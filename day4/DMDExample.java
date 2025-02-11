package com.celcom.day4;

import java.lang.Object;

class A {
	int a = 10;

	{
		System.out.println("Hello 1");
//		static {
//			System.out.println("Hello 1");
//		}
	}
}

public class DMDExample {
	public static void main(String[] args) {
		Object o = null;
//		o = new Scanner(System.in);
//		int a = o.nextInt();

		o = new A();

		Object a;
	}

}
