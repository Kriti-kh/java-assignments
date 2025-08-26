package core.java;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

       // Write a program to find the sum and average of two numbers input by User (using Scanner class).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double n1= scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double n2 = scanner.nextDouble();

        double sum = n1 + n2;
        double average = sum/2;

        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + sum);
        System.out.println("The average of " + n1 + " and " + n2 +  " is: " + average);

        scanner.close();
    }
}
