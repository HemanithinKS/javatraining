package com.celcom.assignment1;

class Shape {
	double getArea() {
		return 0;
	}
}

class RectangleShape extends Shape {
	int width, height;

	RectangleShape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}
}

public class AssignmentShape {
	public static void main(String[] args) {
		RectangleShape r = new RectangleShape(5, 10);
		System.out.println(r.getArea());
	}
}