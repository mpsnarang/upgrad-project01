package com.company;

class A {
    public void display() {
        double i = 99.99;
        System.out.println(i);
    }
}
class B extends A {
    public void display() {
        double i = 100;
        super.display();
    }
}
public class Main {
    public static void main(String[] args) {
        B object = new B();
        object.display();
    }
}

//class B extends A {
//    int methodB(int i) {
//        return ++i;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        B obj = new B();
//        System.out.println(obj.methodB(10));
//    }
//}
