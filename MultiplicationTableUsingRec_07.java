package com.company;

public class MultiplicationTableUsingRec_07 {
    static void multiplication(int n) {
        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(25);
    }
    
}
