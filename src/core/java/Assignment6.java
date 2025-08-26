package core.java;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {

        //6.	Write a program to find the perimeter of a circle, triangle, and rectangle
        //Perimeter of Circle = 2*∏*R, Perimeter of triangle =side1+side2+side3, Perimeter of rectangle = 2*(length+breadth)

        //Perimeter of circle
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        double circlePM = 2* Math.PI * radius;
        System.out.println("Perimeter of circle is : " + circlePM);

        //Perimeter of triangle
        System.out.println("Enter the length of side1 of triangle: ");
        double side1= sc.nextDouble();
        System.out.println("Enter the length of side2 of triangle: ");
        double side2= sc.nextDouble();
        System.out.println("Enter the length of side3 of triangle: ");
        double side3 = sc.nextDouble();
        double trianglePM = side1 + side2 + side3;
        System.out.println("Perimeter of triangle is: " + trianglePM);

        //Perimeter of Rectangle
        System.out.println("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle: ");
        double breadth= sc.nextDouble();
        double rectanglePM= 2*(length+breadth);
        System.out.println("Perimeter of rectangle is: " + rectanglePM);

    }
}
