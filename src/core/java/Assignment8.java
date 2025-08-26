package core.java;

import java.util.Scanner;

public class Assignment8 {
    //8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit
    public static void main(String[] args) {

        // Celsius to Fahrenheit : F= (C*9/5)+32
        //Fahrenheit to Celsius : C= (F-32)*5/9

        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Conversion: 1. Celsius to Fahrenheit   2. Fahrenheit to Celsius");
        System.out.println("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit =(celsius * 9/5) + 32;
            System.out.println(celsius + " C = " + fahrenheit + " F");
        } else if (choice == 2) {
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit -32) * 5/9;
            System.out.println(fahrenheit + " F = " + celsius + "C" );

        }else{
            System.out.println("Invalid choice");
        }


        }

    }

