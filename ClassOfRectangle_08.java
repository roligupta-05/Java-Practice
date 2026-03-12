package com.company;
class Rectangle {
    int length;
    int breadth;
    public int area() {
        return length*breadth;
    }
    public int perimeter() {
        return 2 * (length + breadth);
    }
}
public class ClassOfRectangle_08 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5;
        r.breadth = 8;
        System.out.println("The area of rectangle is:" + r.area());
        System.out.println("The perimeter of rectangle is :" + r.perimeter());
    }
    
}
