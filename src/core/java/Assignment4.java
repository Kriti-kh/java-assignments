package core.java;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        //Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100
        //P=Principle, T = Time, R= Rate of interest


        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter principle amount: ");
        double P = scanner.nextDouble();
        System.out.println("Enter time in years: ");
        double T = scanner.nextDouble();
        System.out.println("Enter rate of interest: ");
        double R = scanner.nextDouble();

        double simpleInterest = (P * T * R)/100;
        System.out.println("Simple interest is: " + simpleInterest);

    }

}
