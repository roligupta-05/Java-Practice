package com.company;

public class AddingOfArray_06 {
    public static void main(String[] args) {
        float [] numbers = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float sum = 0;
        for( float element : numbers) {
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum);
    }
    
}
