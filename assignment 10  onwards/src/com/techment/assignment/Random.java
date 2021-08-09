package com.techment.assignment;
import java.lang.Math;
public class Random {
	public static void main(String args[])   
	{   
		double a=Math.random();
		double b=Math.random();

	System.out.println("1st Random Number: " + a);   
	System.out.println("2nd Random Number: " + b);  
	if(a==b)
		System.out.println("Equal");
	else
		System.out.println("Not Equal");

	
	}

}
