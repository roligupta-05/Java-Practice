package com.company;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 2, 1, 0};
        int peakIndex = findPeakIndex(arr);
        System.out.println("Index of peak element: " + peakIndex);
    }

    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
