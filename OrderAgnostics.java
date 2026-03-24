package com.company;

public class OrderAgnostics {
    public static void main(String[] args) {
        
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = OrderAgnosticsBS(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticsBS(int[]arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAcs  = arr[start] < arr[end];
        while(start <=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target ) {
                return mid;
            }

            if (isAcs) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
             }
                else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    }
                    else if (target < arr[mid]) {
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    }

