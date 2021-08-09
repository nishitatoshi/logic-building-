package com.techment;
public class TheGlassHouse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exitDoor(99);
	}
	public static int exitDoor(int N){
		int firstDigit = N%10;
		int secondDigit = N/10;
		System.out.println(firstDigit + secondDigit);
		return(firstDigit + secondDigit);
	}
}