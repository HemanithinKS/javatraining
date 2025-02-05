package com.celcom.day1;
import java.util.Scanner;
public class Input {
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Employee ID, Name and salary");
   int eid = sc.nextInt();
   String ename = sc.next();
   double esalary = sc.nextDouble();
   System.out.println("Employee ID:" + eid);
   System.out.println("Employee Name:" + ename);
   System.out.println("Employee Salary:" + esalary);
   sc.close();
  }
}