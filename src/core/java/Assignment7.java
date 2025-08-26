package core.java;

import java.util.Scanner;

public class Assignment7 {
    //7.	Write a program that reads the radius and length of a cylinder and computes volume.
    // volume of cylinder= ∏*r^2*h
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder (in cm): ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of cylinder (in cm): ");
        double height = sc.nextDouble();
        double volume = Math.PI *radius*radius *height;
        System.out.println("The volume of cylinder is: " + volume + "cubic cm");

        sc.close();
    }
}
