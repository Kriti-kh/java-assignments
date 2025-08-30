package core.java;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        //Write a Program to accept three sides of a triangle and display which kind of triangle is formed.
        //3 types of triangle: 1.equilateral: all 3 sides equal,2.Isosceles: any 2 sides equal 3. Scalene all 3 sides different

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first side of triangle: ");
        int side1 = scan.nextInt();
        System.out.println("Enter second side of triangle: ");
        int side2 = scan.nextInt();
        System.out.println("Enter third side of triangle: ");
        int side3 = scan.nextInt();

        if (side1==side2 && side2==side3) {
            System.out.println("This is equilateral triangle");
        }else if ( side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("This is isosceles triangle");
        }else{
            System.out.println("This is a scalene triangle");
        }

    }
}
