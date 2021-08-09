package com.techment;
import java.util.Scanner;  
import java.lang.Math; 
public class Series {
	public static void main(String args[]) 
	{
		int n;
	    Scanner sc= new Scanner(System.in);  
	    System.out.println("Enter the number");
	    n=sc.nextInt(); 
	    for(int i=1; i<=n; i++) 
	    {
	    	System.out.println(Math.pow(i, 3));
	    }
	}

}
