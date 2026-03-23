package com.company;
import java.util.Scanner; 

public class TypeOfWebsite {
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    
    String Website = sc.next();
    if(Website.endsWith(".org")) {
        System.out.println("This is an organizational website.");
    }
    else if (Website.endsWith(".com") ) {
        System.out.println("This is a commercial website.");
    }
    else if(Website.endsWith(".in")) {
        System.out.println("This is an indian website.");
    }

}
}


