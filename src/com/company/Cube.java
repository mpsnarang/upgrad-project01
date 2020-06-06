package com.company;

class Square1 {
    protected double length, breadth;
    Square1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Length=" + length + "Breadth=" + breadth);
    }
}
public class Cube extends Square1 {
    double height;
    Cube(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
        System.out.println("Height=" + height);
    }
    public static void main(String args[]) {
        Cube obj = new Cube(4,5,6);
    }
}

class School {
    private String name;
    private int numStudents;

    public School(String name, int numStudents) {
        this.name = name;
        this.numStudents = numStudents;
    }

    public String getName() {
        return this.name;
    }

    public int getNumStudents() {
        return this.numStudents;
    }
}


class University extends School {
    private final String type = "University";
    private boolean isPublic;

    public University(String name, int numStudents, boolean isPublic) {
        super(name,numStudents);
        this.isPublic = isPublic;
    }

    public boolean getIsPublic() {
        return this.isPublic;
    }
}