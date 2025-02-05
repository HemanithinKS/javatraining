package com.celcom.day1;
import java.util.Scanner;

public class Calculator {
   public static void main(String args[]) {
	   Scanner sc= new Scanner(System.in);
	  	
	   int ch = 0;
	   do{
		   System.out.println("\n1.Addition\n2.Subraction\n3.Multiplication.\n4.Division\n5.Quit");
	       ch=sc.nextInt();
		   
		   System.out.println("Enter number 1 and number 2");
		   int num1 = sc.nextInt();
		   int num2 = sc.nextInt();
		   	  
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
	    	   
		       System.out.println("div="+((double)num1/(double)num2));
		       break;
	       case 5:
		       System.out.println("Quiting");
		       return;
	       default:
		       System.out.println("Enter correct input");
	       }
	       
	       
	   }while(ch != 5);
	   sc.close();
	  } 
   
  }

