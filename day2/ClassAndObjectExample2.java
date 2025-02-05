package com.celcom.day2;

class Fruits{
	String color;
	int size;
	int price;
	
	//Constructor
	Fruits(String color, int size, int price){
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	//Method
	void display()
	{
		System.out.println("Fruit Color : " + color);
		System.out.println("Fruit Size : " + size);
		System.out.println("Fruit Prize : " + price);
	}
	
	void setPrice(int price) {
		this.price = price;
	}
}

public class ClassAndObjectExample2 {
	public static void main(String args[]) {
	    Fruits apple = new Fruits("Red", 200, 30);
		apple.display();
	}
}
