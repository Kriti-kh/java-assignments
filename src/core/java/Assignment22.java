package core.java;

import java.util.Scanner;

public class Assignment22 {
    //Write a program to print the table of given numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to show its table: ");
        int num = sc.nextInt();
        System.out.println("Multiplication table of " + num + "is : ");
        for (int i =1; i <=10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
