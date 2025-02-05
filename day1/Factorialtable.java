package com.celcom.day1;

import java.util.Scanner;

public class Factorialtable {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		int i,fact=1;  
		int n=sc.nextInt();
		sc.close();
		int number=0;
		for(int j=0;j<n;j++) {
		    number++;
		    
	        fact=1;
		    for(i=1;i<=number;i++){    
		        fact=fact*i;    
		  }
		    
		  System.out.println(number+"!="+fact);
	  
	}
  }
}
