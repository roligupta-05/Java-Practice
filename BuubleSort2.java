package com.company;

import java.util.Arrays;

public class BuubleSort2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    //as the no of size is growwing, the no of comparisons is also grows
    // NOTE : this is the worst case time complexity of bubble sort  
    // when j never swaps for a value of i, it means array is sorted, hence you can end the program
    // Best case comparison is = N-1 but in time complexicity constants are ignored, so it is O(N) in best case
    // Worst case comparison is = N-1 + N-2 + N-3 + ... + 1 = N(N-1)/2, hence it is O(N^2) in worst case

        static void  bubble(int[] arr) {
            boolean swapped;
            //run the steps n -1 times
            for(int i=0;i<arr.length; i++) {
             swapped = false;
                //for each step, max item will come at the last respective index
                for (int j=0; j< arr.length - i; j++) {
                    //swap if the item is smaller than the previous items
                    if(arr[j] < arr[j-1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped) {
                    break;
                }

            }
        }
    }
