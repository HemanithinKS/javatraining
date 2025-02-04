package com.celcom.day1;
import java.util.Scanner;

public class Calculator {
   public static void main(String args[]) {
	   Scanner sc= new Scanner(System.in);
	   String s;
	
	   do{
		   System.out.println("Enter number 1 and number 2");
		   int num1 = sc.nextInt();
		   int num2 = sc.nextInt();
		   
	       System.out.println("\n1.Addition\n2.Subraction\n3.Multiplication.\n4.Division\n5.Quit");
	       int ch=sc.nextInt();
	  
	       switch(ch) {
	       
	       case 1:
		       System.out.println("Add="+(num1+num2));
		       break;
	       case 2:   
		       System.out.println("Sub="+(num1-num2));
		       break;   
           case 3:
	           System.out.println("Mul="+(num1*num2));
	           break;
	       case 4:
		       System.out.println("div="+(num1/num2));
		       break;
	       case 5:
		       System.out.println("Quiting");
		       return;
	       default:
		       System.out.println("Enter correct input");
	       }
	       System.out.println("do you wish to proceed(yes/no)");
	       s=sc.next();
	       
	    }while(s.equalsIgnoreCase("yes"));
	   sc.close();
	  } 
   
  }

