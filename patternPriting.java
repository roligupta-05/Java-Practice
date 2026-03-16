package com.company;

public class patternPriting {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Enter number of rows :");
        for (int i=1;i<=n;i++){
            for( int j=0;j<=n-i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
