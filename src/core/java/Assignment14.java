package core.java;

import java.util.Scanner;

public class Assignment14 {
    public static void main (String [] args){
        // Write a program to relate two integers entered by the user using = =or > or < sign.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2)
        {
            System.out.println(num1 + " = " + num2);
        }else if (num1> num2){
            System.out.println(num1 + " > " + num2);
        }else {
            System.out.println(num1 + " < " + num2);
        }
    }
}
