package com.celcom.day5;

abstract class Vehicle{
	
	
	Vehicle(int a)
	{
		System.out.println(a);
	}
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
	
	
	abstract void noOfWheels();
	
	abstract void brandName();
	
}
 class Car extends Vehicle {
	
	 Car(){
	  super(5);
	 }
	
	 void noOfWheels() {
		System.out.println("I have four Wheels");
	}
	
	void brandName() {
		System.out.println("My brand name is benz");
	}
	
	
}
 
 abstract class Bike extends Car {
		
//	 Bike(){
//	  super(5);
//	 }g
	
//	 void noOfWheels() {
//		System.out.println("I have four Wheels");
//	}
	
	void brandName() {
		System.out.println("My brand name is benz");
	}
	
	
}





 public class AbstractClassExample {
	public static void main(String[] args) {
		Vehicle vec=new Car();
		
		AbstractClassExample obj = new AbstractClassExample();
		
		
		
		
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
	}
	
}
;