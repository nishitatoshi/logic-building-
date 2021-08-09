package com.techment;
import java.util.*;

public class leapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter year: ");
    int years = scanner.nextInt();
    isLeap(years);
	}
	public static void isLeap(int year){
		if ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))) {
			System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println(year + " is NOT a Leap Year");
		}
	}
}