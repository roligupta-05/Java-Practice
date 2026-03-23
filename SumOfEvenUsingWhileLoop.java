package com.company;
import java.util.Scanner;
public class SumOfEvenUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
           int sum = 0;
           int i = 1;
           while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of even numbers are:");
        System.out.println(sum);
    }
}