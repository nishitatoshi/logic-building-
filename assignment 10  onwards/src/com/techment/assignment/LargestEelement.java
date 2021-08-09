package com.techment.assignment;

public class LargestEelement {
	public static void main(String[] args)
	{
		int a[]={25,11,7,75,56};
		System.out.println("Largest item: "+getLargest(a,5));
        
	}
	
public static int getLargest(int[] a, int total){  
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[total-1];  
	}  
}
