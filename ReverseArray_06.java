package com.company;

public class ReverseArray_06 {
    public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};
    int n = Math.floorDiv(arr.length,2);
    for ( int i=0;i<n;i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
    }
    for(int element:arr) {
        System.out.println(element + " ");
    }
}
}


