package com.company;
class Circle {
    float radius;
    public float area() {
        return (float)(Math.PI*radius*radius);
    }
    public float perimeter() {
        return (float)(2*Math.PI*radius);
    }
}

public class ClassOfCircle_08 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 6;
        System.out.println("The area of circle is:" +c.area());
        System.out.println("The perimeter of circle is:" + c.perimeter());
    }
}
