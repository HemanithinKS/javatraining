package com.celcom.day4;


class Animal1 {
	
	 int a=20;
	 
	 void move()
	{
		System.out.println("Can Not define");
	}
	
	void eat() {
		System.out.println("Can Not Define");
	}
}

class Cat1 extends Animal1{
	
	int b=30;
	
	void move() {
		System.out.println("Cat will move by Walk");
	}
	
	void eat() {
		System.out.println("Cat will eat Rat");
	}
}

public class MethodOverridingExample3 {
	
	public static void main(String[] args) {
		Animal1 animal =new Cat1();
		animal.move();
		
	}

}
