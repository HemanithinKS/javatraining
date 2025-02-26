package com.celcom.day4;

import java.util.Scanner;

public class Pronic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int temp1 = 1,temp2=1;
		boolean flag = false;
//		for (int i = 2; i < num; i++) {
//			if((num % i == 0) && (temp1 != (temp2-1)))
//			{
//				temp2=temp1;
//				temp1=i;	
//			}
//		}

		for (int i = 1; i <= num / 2; i++) {
			if ((i * (i + 1)) == num) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Pronic number");
		} else {
			System.out.println("Not Pronic number");
		}
	}

}
