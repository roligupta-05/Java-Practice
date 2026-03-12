package com.company;

public class AverageOfArray_06 {
    public static void main(String[] args) {
        float [] marks = {67.9f, 67.9f, 98.8f, 89.4f, 90.8f};
        float sum = 0;
        for(float element: marks) {
            sum = sum + element;
        }
        System.out.println("The value of average marks is:" + sum/marks.length);
    }
    
}
