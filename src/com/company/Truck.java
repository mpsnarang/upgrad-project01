package com.company;

abstract class Vehicle {
    private char vehicleType;
    public abstract void move ();
}

public class Truck extends Vehicle {
    private int truckNo;
    public void move(){
        System.out.println("Hello");
    }


    public static void main(String args[]) {
        Truck mahindra= new Truck();
        mahindra.move();
    }
}