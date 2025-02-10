package com.celcom.day5;

interface VehiclePlan {
	 
	
	void noOfEngine();// public abstract
	void brandName();
	void noOfWheels();
}

interface VehiclePlan2 {
	 
	
	void noOfEngine();// public abstract
	void brandName();
	void noOfWheels();
} 

abstract class Vehicle1 implements VehiclePlan{
	
	 int a =1;
	Vehicle1(int a)
	{
		System.out.println(a);
	}
	public void noOfEngine() {
	System.out.println("I have one Engine");
	}
	
	
public abstract void noOfWheels();
	public abstract void brandName();
//	
}

 class Car1 implements VehiclePlan,VehiclePlan2 {
	
	public void noOfEngine() {
		
	}
	
	public  void noOfWheels() {
		System.out.println("I have four Wheels");
	}
	
	public void brandName() {
		System.out.println("My brand name is benz");
	}
	
	
}
  

 public class InterfaceExample {
	public static void main(String[] args) {
				
		Car1 vec=new Car1();
		
		AbstractClassExample obj = new AbstractClassExample();
		
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
	}
	
}
;