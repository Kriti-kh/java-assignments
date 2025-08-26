package core.java;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        //9.	Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds:  ");
        double pounds = sc.nextDouble();

        double kg= pounds * 0.454;
        System.out.println(pounds + " pounds = " + kg + " kilograms ");

    }
}
