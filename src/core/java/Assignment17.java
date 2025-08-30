package core.java;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        //Write a program to calculate leap years.
        // A century year is a year ending with 00, century year is leap year if divisible by 400 eg:2000
        //leap year is divisible by 4 eg: 2016,2024
        //but 1900 is also divisible by 4, but  not a leap year(it is divisible by 100)
        //century year like 1700,1800,1900 is filtered out by 100

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println((year + " is Not  a Leap Year"));
        }

    }
}
