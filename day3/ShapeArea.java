package com.celcom.day3;
import java.util.Scanner;

class Shape {
    int radius;
    int length;
    int breadth;
    int height;
    int base;

    double area;
    
    
    Shape(int radius) {
        this.radius = radius;
    }   
    
    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        height=length;
        base=breadth;
    }
   
    void calculateArea() {
      
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }
    
    
    void calculateArea() {
         super.area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    
   
    void calculateArea() {
        super.area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle( int base, int height) {
        super( base , height);
    }
    
    
    void calculateArea() {
        super.area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class ShapeArea {
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
                shape = new Triangle( base, height);
                
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        shape.calculateArea();
        
        

        
        sc.close();
    }
}
