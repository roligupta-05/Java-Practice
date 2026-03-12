package com.company;

public class Array_06 {
    public static void main(String[] args) {
        int[] marks = {98, 45, 67, 89, 90};
        int sum = 0;
        for(int i=0;i<marks.length;i++) {
            sum += marks[i];
        }
        System.out.println("The value of sum is: " + sum);
    }
    
}
