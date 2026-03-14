package com.company;

public class MaximumElementOfArray_06 {
    public static void main(String[] args) {
        int arr[] = {67, 98, 45, 89, 90};
        int max = 0;
        for(int e:arr) {
            if(e>max) {
                max = e;
            }
        }
        System.out.println(max);
    }
    
}
