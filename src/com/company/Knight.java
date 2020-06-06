package com.company;

public class Knight implements SwordFighter {

    @Override
    public void attack() {
        System.out.println("Knight stops the horse and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Knight climbs the horse and flees");
    }

    // please write the showWeapon() method for the Knight class here.
    // It should print out "Shows Sword" in a new line
    @Override
    public void showWeapon() {
        System.out.println("Shows Sword");
    }

}
