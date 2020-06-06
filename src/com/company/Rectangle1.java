package com.company;

public class Rectangle1 {
    public static void main(String[] args){
        RectangleObject rectangle1 = new RectangleObject(7.33f,4.22f);
        float area = rectangle1.getLength()*rectangle1.getBreadth();
        System.out.println(area);
    }


}

class RectangleObject{
    private float length;
    private float breadth;
    private static float PI = 3.14f;

    RectangleObject(float length, float breadth){
        setlenght(length);
        setbreadth(breadth);
    }

    public void setlenght(float length) {
        if (length>0){
            this.length = length;
        }
    }

    public void setbreadth (float breadth){
        if (breadth>0){
            this.breadth = breadth;
        }
    }
    public float getLength() {
        return this.length;
    }
    public float getBreadth() {
        return this.breadth;
    }
}
