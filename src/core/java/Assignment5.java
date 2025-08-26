package core.java;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

       // Write a program to find the area of a circle, rectangle, and triangle.

        Scanner scanner = new Scanner (System.in);
        //area of circle = πr^2
        System.out.println( "Enter the radius of circle (in cm): ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + circleArea );

        //Area of rectangle = length * breadth

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle(in cm): ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle(in cm): ");
        double breadth = sc.nextDouble();
        double rectangleArea = length*breadth;
        System.out.println("Area of rectangle is: " + rectangleArea);

        //Area of triangle = 1/2 base * height
        System.out.println("Enter the base of triangle (in cm): ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of triangle ( in cm): ");
        double height = sc.nextDouble();
        double triangleArea= 0.5 * base * height;
        System.out.println("Area of triangle is: "+ triangleArea);

        scanner.close();

    }
}
