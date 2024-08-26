package Assignments;

import java.util.Scanner;

public class Arithmetic
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();

        System.out.print("Enter second number :");
        int b = sc.nextInt();

        System.out.println("The addition of two number is :" + (a+b));
        System.out.println("The subtraction of two number is :" + (a-b));
        System.out.println("The multiplication of two number is :" + (a*b));
        System.out.println("The division of two number is :" + (a/b));
        System.out.println("The modules of two number is :" + (a%b));
    }
}


