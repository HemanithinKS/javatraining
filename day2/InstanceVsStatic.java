package com.celcom.day2;

public class InstanceVsStatic {
  //int a=10; //instance or object variable;
	static int a=10; //static or class Variable
	
	
	public static void main(String args[]) {
	    InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 20;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
			
	}

}
