package com.celcom.day11.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Userinput{
	int num;
	double time;
	String name,mode;
	 Userinput(int num, double time, String name, String mode) {
		super();
		this.num = num;
		this.time = time;
		this.name = name;
		this.mode = mode;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	@Override
	public String toString() {
		return "Userinput [num=" + num + ", time=" + time + ", name=" + name + ", mode=" + mode + "]";
	}
	
	
	
}




class User {
	ArrayList<Userinput> list = new ArrayList<>();
	
    void addnew() {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of items : ");
        int num = scanner.nextInt();

        System.out.print("Enter the base cooking time : ");
        double time = scanner.nextDouble();

        System.out.print("Enter the item name : ");
        String name = scanner.next();
  
        System.out.print("Enter the mode: ");
        String mode = scanner.next();
        
        list.add(new Userinput(num, time, name, mode));

    }
    
    public void viewUser()
	{
		if (list.isEmpty()) {
			System.out.println("No Tasks");
			return;
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println((i+1)+ " -> "+list.get(i));
			}
		}
	}
    
    public void calculateTime(int userId) {
    		
    	 
 	    	Calculation.itemNumber(list.get(userId).getNum(),list.get(userId).getTime(),list.get(userId).getName(),list.get(userId).getMode());
 	    
    }
}
