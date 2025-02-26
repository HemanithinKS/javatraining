package com.celcom.day8;

import java.util.StringTokenizer;

public class StringTokenizernExample {
	public static void main(String[] args) {
		String s1 ="Welcome to java programing";
		 StringTokenizer st =new StringTokenizer(s1, " ");
		 System.out.println(st.countTokens());
		 
		 while(st.hasMoreElements()) {
			 System.out.println(st.nextElement());
		 }
	}
}
