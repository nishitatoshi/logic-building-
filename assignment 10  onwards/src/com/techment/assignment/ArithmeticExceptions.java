package com.techment.assignment;

import java.io.*;
import java.util.Scanner;
class ArithmeticExceptions {
    public static void main(String[] args)
    {   
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num1= scanner.nextInt();
        int a = 0;
        try {
            System.out.println(num1 / a); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                "Divided by zero operation cannot possible");
        }
    }
}