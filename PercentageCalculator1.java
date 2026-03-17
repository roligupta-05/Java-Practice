package com.company;
import java.util.Scanner;

public class PercentageCalculator1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter marks of Maths:");
        int a = sc.nextInt();
        System.out.println("Enter marks of Physics:");
        int b = sc.nextInt();
        System.out.println("Enter marks of Chemistry:");
        int c = sc.nextInt();
        System.out.println("Enter marks of English:");
        int d = sc.nextInt();
        System.out.println("Enter marks of Hindi:");
        int e = sc.nextInt();

        float percentage = (a+b+c+d+e)/500.0f * 100;

        System.out.println("The pecentage of the student is :");
        System.out.println(percentage + "%");
        
    }
    
}
