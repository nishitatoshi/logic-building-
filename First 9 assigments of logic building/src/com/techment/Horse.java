package com.techment;

public class Horse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	exitDoor(23,24,25);	
	}
	public static void exitDoor(int horse1, int horse2, int horse3){
		if(horse1 == horse2 || horse2 == horse3 || horse3 == horse1) {
			System.out.println("Entered weights are not distinct values");
		}else {
			if(horse1>horse2) {
				if(horse1>horse3) {
					System.out.println("Horse1");
				}else {
					System.out.println("Horse3");
				}
			}else {
				if(horse2<horse3) {
					System.out.println("Horse3");
				}else {
					System.out.println("Horse2");
				}
			}
		}
	}

}
