package com.celcom.day3;

class Student {
	String sname;
	int regiternum;
	String degree;
	float cgpa;

	Student(String name, int roll, String course, float mark) {
		sname = name;
		regiternum = roll;
		degree = course;
		cgpa = mark;

	}

	void display() {

		System.out.println("Name:" + sname);
		System.out.println("Register Number" + regiternum);
		System.out.println("Degree" + degree);
		System.out.println("CGPA" + cgpa);

	}
}

public class StudentMangementSys {

	public static void main(String[] args) {

		Student nithin = new Student("Hemanithin", 192110426, "CSE", 8.7f);
		nithin.display();

	}

}
