package com.celcom.assignment1;

class Rectangle {

	int width, length;

	Rectangle(int width, int length) {
		this.length = length;
		this.width = width;
	}

	int getArea() {
		return length * width;
	}

	int getPerimeter() {
		return 2 * (length + width);
	}

}

public class AssignmentRectangle {

	public static void main(String args[]) {
		Rectangle obj = new Rectangle(10, 12);

		System.out.println("Area = " + obj.getArea());
		System.out.println("Area = " + obj.getPerimeter());
	}

}
