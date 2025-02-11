package com.celcom.day2;

public class TypeOfVariable {
	int b = 20; // instance or object variable;
	static int c = 30; // static or class Variable

	public static void main(String args[]) {
		int a = 10;// local variable
		System.out.println(a);

		TypeOfVariable obj = new TypeOfVariable();
		System.out.println(obj.b);

		System.out.println(TypeOfVariable.c);
	}

}
