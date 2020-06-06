package com.company;

class Shape2 {
    public Shape2() {
        super();
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle2 extends Shape2 {
    public Rectangle2() {
        super();
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square2 extends Rectangle2 {
    public Square2() {
        super();
        System.out.println("inside Square class default constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        Square2 sq = new Square2();
    }
}