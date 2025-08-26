package core.java;

import java.util.Scanner;

public class Assignment10C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        double x = (- b + Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("The distance between two points is : "+ x);
    }
}
