package com.company;

public class MinimumElementOfArray_06 {
    public static void main(String[] args) {
        int [] arr = {67, -98, 45, 89, 90};
        int min = arr[0];
        for(int e:arr) {
            if (e<min) {
                min = e;
            }
        }
        System.out.println(min);
    }
    
}
