package com.techment.assignment;
import java.util.*;

public class Bmi {
	public static void main(String[] args)
	{
		float height;
		float weight;
		float bmi;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height in meters: ");
		height = scanner.nextFloat();
		System.out.println("Enter weight in kg: ");
		weight = scanner.nextFloat();
		bmi=weight/(height*height);
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi>18.5 && bmi<25)
			System.out.println("Normal");
		else if(bmi>25 && bmi<30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");




			
	}

}
