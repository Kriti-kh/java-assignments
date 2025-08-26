package core.java;

import java.util.Scanner;

public class Assignment5Part2 {
    //While calculating area of rectangle, if length = breadth it gives error message
    //Using if/else
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of rectangle(in cm): ");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of rectangle(in cm): ");
        double breadth = scanner.nextDouble();
        if (length == breadth) {
            System.out.println("Error: Length and breadth of rectangle cannot be equal");

        } else {
            double rectangleArea = length * breadth;
            System.out.println("Area of rectangle is: " + rectangleArea);
        }
    }
}
