package com.techment;
import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in );
        int a, b;
        char operator;
        System.out.print("Enter A : ");
        a=s.nextInt();
        System.out.print("Enter operator (+, -, *, /)");
        operator = s.next().charAt(0);
        System.out.print("Enter B : ");
        b=s.nextInt();
        double addition  = a+b;
        double subtraction  = a-b;
        double multiplication  = a*b;
        double division  = a/b;

        switch(operator)
        {
            case '+' :
            {
                System.out.print("Total after Addition is : "+addition);
                break;
            }
            case '-' :
            {
                System.out.print("Total after Subtraction is : " +subtraction);
                break;
            }
            case '*' :
            {
                System.out.print("Total after Multiplication is : "+multiplication);
                break;
            }
            case '/' :
            {
                System.out.print("Total after Division is : "+division);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }
        }
    }
}