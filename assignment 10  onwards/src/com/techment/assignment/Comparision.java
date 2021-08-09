package com.techment.assignment;
import java.io.*;
import java.util.*;
public class Comparision 
{

	    public static boolean areEqual(int arr1[], int arr2[])
	    {
	        int length1 = arr1.length;
	        int length2 = arr2.length;
	 
	        
	        if (length1 != length2)
	            return false;
	 
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	 
	        for (int i = 0; i < length2; i++)
	            if (arr1[i] != arr2[i])
	                return false;
	 
	        return true;
	    }
	 
	    public static void main(String[] args)
	    {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter the size of first array you want to enter");
	    	int n= scanner.nextInt();
	    	int[] array1 = new int[10];  
	    	System.out.println("Enter the elements of the first array: ");  

	    	for(int i=0; i<n; i++)
	    	{
	    		array1[i]= scanner.nextInt();
	    	}
	    	
	    	System.out.println("Enter the size of second array you want to enter");
	    	int m= scanner.nextInt();
	    	int[] array2 = new int[10];  
	    	System.out.println("Enter the elements of the second array: ");  

	    	for(int i=0; i<n; i++)
	    	{
	    		array2[i]= scanner.nextInt();
	    	}
	       
	
	        if (areEqual(array1, array2))
	            System.out.println("Equal");
	        else
	            System.out.println("Not equal");
	    }
	
}
