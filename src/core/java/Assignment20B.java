package core.java;

import java.util.Scanner;

public class Assignment20B {
    public static void main(String[] args) {
        //Write a program to create the equivalent of a four-function calculator.
        // The program to enter two integer numbers and an operator.
        // It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers.
        // Finally, it displays the result.

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter operator: (+, - , *, / )");
        char op =sc.next().charAt(0);

        switch(op){
            case '+':
                int sum = a + b;
                System.out.println("Addition is: " + sum);
                break;
            case '-' :
                int diff = a - b;
                System.out.println("Subtraction is: " + diff);
                break;
            case '*' :
                int mult = a * b ;
                System.out.println("Multiplication is: " + mult);
                break;
            case '/' :
                int div = a / b ;
                System.out.println("Division is: " + div);
                break;
                default:
                    System.out.println("Invalid choice");
                    break;
        }
    }
}
