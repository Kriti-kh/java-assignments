package core.java;

import java.util.Scanner;

public class Assignment15 {
    //Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
 //ASCII code is printable from 32-126 and non-printable from 0-31,127,128

    public static void main (String  [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an ASCII code (0-128): ");
        int code = sc.nextInt();

        if(code >=32 && code <=126) {
            char ch = (char) code;
            System.out.println(code + " -> " + ch);
        }else if (code >=0 && code <=128){
            System.out.println("Code " + code + " is a non-printable ASCII character");
        }else{
            System.out.println( "Error: Please enter valid ASCII code between (0-128");
        }

    }
}


