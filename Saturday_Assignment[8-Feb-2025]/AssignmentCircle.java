package com.celcom.day5;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    
    void setRadius(double radius) {
		this.radius = radius;
	}


	double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;

    }
}

public class AssignmentCircle {
    public static void main(String[] args) {
        Circle c = new Circle(14);
        c.setRadius(7.0);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}

