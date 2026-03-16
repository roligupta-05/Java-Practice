package com.company;

public class PatternPrinting_07 {
    static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(7);
    }
    
}
