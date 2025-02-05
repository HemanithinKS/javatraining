package com.celcom.day1;
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		  int i,fact=1;  
		  int number=sc.nextInt(); 
		  sc.close();
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println(number+"!="+fact);
		  
	}

}
