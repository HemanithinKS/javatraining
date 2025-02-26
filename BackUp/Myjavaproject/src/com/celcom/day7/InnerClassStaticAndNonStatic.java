package com.celcom.day7;

public class InnerClassStaticAndNonStatic {
	
	//1.Non-Static Inner Class
	class InnerClass1 {
		void myMethod() {
			System.out.println("Non -Static Inner Class");
		}
	}
	
	//2.Static Inner class
	static class InnerClass2 {
		void myMethod2() {
			System.out.println("Static Inner Class");
		}
	}
	// 3 local Class
	void method3(){
		class InnerClass3{
			void myMethod3() {
				System.out.println("Local class");
			}
			
		}
		InnerClass3 obj = new InnerClass3();
		obj.myMethod3();
	}
	
	public static void main(String[] args) {
		InnerClassStaticAndNonStatic obj = new InnerClassStaticAndNonStatic();
		obj.method3();
		InnerClass1 inner1 = obj.new InnerClass1();
		inner1.myMethod();
		
		InnerClassStaticAndNonStatic.InnerClass2 inner2 = new InnerClass2();
		inner2.myMethod2();
		
	}
}
