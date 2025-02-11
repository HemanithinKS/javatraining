package com.celcom.day5;

import java.util.Scanner;

interface Area {
	void calculateArea();
}

interface Perimeter {
	void calculatePerimeter();
}

abstract class Shape implements Area, Perimeter {
	int radius;
	int length;
	int breadth;
	int height;
	int base;

	double area, perimeter;

	Shape(int radius) {
		this.radius = radius;
	}

	Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		height = length;
		base = breadth;
	}

	public void calculateArea() {

	}

	public abstract void calculatePerimeter();

}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		super.area = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + area);
	}

	public void calculatePerimeter() {
		super.perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter : " + perimeter);
	}
}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	public void calculateArea() {
		super.area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

	public void calculatePerimeter() {
		super.perimeter = 2 * (length + breadth);
		System.out.println("Perimeter : " + perimeter);
	}
}

class Triangle extends Shape {
	Triangle(int base, int height) {
		super(base, height);
	}

	public void calculateArea() {
		super.area = 0.5 * base * height;
		System.out.println("Area of Triangle: " + area);
	}

	public void calculatePerimeter() {
		super.perimeter = length + breadth;
		System.out.println("Perimeter : " + perimeter);
	}
}

public class ImplementsShapeExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the area of \n1.Circle\n2.Rectangle \n3.Triangle");
		int choice = sc.nextInt();

		Shape shape = null;

		switch (choice) {
		case 1:
			System.out.println("Enter radius of the circle: ");
			int radius = sc.nextInt();
			shape = new Circle(radius);
			break;
		case 2:
			System.out.println("Enter length and breadth of the rectangle: ");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			shape = new Rectangle(length, breadth);
			break;
		case 3:
			System.out.println("Enter base and height of the triangle: ");
			int base = sc.nextInt();
			int height = sc.nextInt();
			shape = new Triangle(base, height);

			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		shape.calculateArea();

		sc.close();
	}
}
