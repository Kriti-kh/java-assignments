package core.java;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter you nationality: ");
        String nationality = sc.nextLine();

        System.out.println("Personal Details");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age + " years ");
        System.out.println("Nationality : " + nationality);
    }
}
