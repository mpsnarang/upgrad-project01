package com.company;

public class FirstInterfaceExample {
    public static void main(String[] args) {
        //Interface variables are implicitly static and final
        System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);

        Knight knight = new Knight();
        Ninja ninja = new Ninja();

        knight.showWeapon();
        ninja.showWeapon();

        knight.attack();
        ninja.attack();

        knight.escape();
        ninja.escape();
    }
}
