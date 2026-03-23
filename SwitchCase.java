package com.company;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator in java");
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("--Choose operation to perform--");
        System.out.println("1. Addition" );
        System.out.println("2. Subtraction" );
        System.out.println("3. Multiplication" );
        System.out.println("4. Division" );
        int c = sc.nextInt();
        switch (c) {
            case 1:
                float d = a + b ;
                System.out.println(d);
                break;
            case 2:
                float e = a - b;
                System.out.println(e);
            case 3:
                float f = a * b ;
                System.out.println(f);
                break;
            case 4:
                float g = a / b;
                System.out.println(g);
                break;
                default :
                System.out.println("please choose a valid choice.");

        }

    }
    
}
