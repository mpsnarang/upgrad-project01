package com.company;
import java.util.*;

// Implement the Parallelogram class
class Parallelogram extends Quadrilateral {
    private double height;
    public Parallelogram(double side1, double side2, double height) {
        super(side1,side2,side1,side2);
        this.height = height;
    }
    protected double getArea(){
        return super.side1*this.height;
    }

}

// Implement the Rhombus class
class Rhombus extends Quadrilateral{
    private double height;
    public Rhombus(double side, double height) {
        super(side,side,side,side);
        this.height = height;
    }
    protected double getArea(){
        return super.side1*this.height;
    }
}

// Implement the Rectangle class
//class Rectangle extends Quadrilateral {
//    public Rectangle(double length, double breadth) {
//        super(length,breadth,length,breadth);
//        // Implement the Parallelogram class
//    }
//    protected double getArea(){
//        return super.side1*super.side2;
//    }
//
//}

// Implement the Square class
class Square extends Quadrilateral {
    public Square(double side) {
        super(side,side,side,side);
    }
    protected double getArea(){
        return super.side1*super.side2;
    }
}

// Do not edit the Test class
public class AbstractClassExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
//        double length = scan.nextDouble();
//        double breadth = scan.nextDouble();
//        Rectangle rectangle = new Rectangle(length, breadth);
//        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
//        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();
    }
}
