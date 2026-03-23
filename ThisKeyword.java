package com.company;
class OneClass {
    int a;
    public int get() {
        return a;
    }
    OneClass(int a) {
        this.a = a;
    }
    public int returnone() {
        return 1;
    }
}
class Doclass  {
     Doclass(int a) {
        
    }

    class DoClass extends OneClass {
        DoClass(int c) {
            super(c);
            System.out.println("I am a constructor");
        }
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        OneClass e = new OneClass(56);
        System.out.println(e.get());
    }
    
}
