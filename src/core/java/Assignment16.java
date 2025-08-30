package core.java;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        //Write a program to find if the given number is even or odd.
        //even = %2
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is Even number.");
        }else{
            System.out.println(num + " is Odd number.");
        }
    }
}
