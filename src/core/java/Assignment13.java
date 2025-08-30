package core.java;

import java.util.Scanner;

public class Assignment13 {
    //Write a program to print the number entered by the user only if the number entered is negative.
    //negative= <0
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("You entered a negative number: " + num);
        }else{
            System.out.println("The number cannot be printed, it is not negative");
        }

    }
}
