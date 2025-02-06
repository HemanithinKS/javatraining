package com.celcom.day3;

public class ThisKeyword {
	
	String name;
	
	ThisKeyword(){
		//System.out.println("nithin");//err :Constructor call must be the first statement in a constructor
		this("Nithin");
		//ThisKeyword("nithin");// want to use new keyword
	}
	


	ThisKeyword(String name){
		this.name = name;
		greeting();
	}
	
	void greeting() {
		System.out.println("Welcom " + name);
	}
	
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
	}
	
}
