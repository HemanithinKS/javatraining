package com.celcom.day4;

class ClassAlpha
{
    {
        System.out.println("Alpha");
    }
    public String tostring() {
    	return "TO STRING";
    }
    static {
    	System.out.println("Static method");
    }
    ClassAlpha(){
    	System.out.println("Constructor");
    }
}

class ClassBeta extends ClassAlpha
{
    {
        System.out.println("Beta");
    }
}

class ClassGamma extends ClassBeta
{
    {
        System.out.println("Gamma");
    }
}

public class Final
{
    public static void main(String[] args)
    {
    	System.out.println("Main class Method");
        ClassGamma gamma = new ClassGamma();
    }
}