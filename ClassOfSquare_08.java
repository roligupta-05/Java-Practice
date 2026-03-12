package com.company;
class square {
    int side;
    public int area() {
        return side*side;
    }
    public int perimeter() {
        return 4*side;
    }

}

public class ClassOfSquare_08 {
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 10;
        System.out.println("The area of square is:" + sq.area());
        System.out.println("The perimeter of square is:" +sq.perimeter());
    }
    
}
