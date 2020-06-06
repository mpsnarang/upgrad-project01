package com.company;

public class Ninja implements SwordFighter {

    @Override
    public void attack() {
        System.out.println("Ninja steps forward and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Ninja gets into forest and flees");
    }

    @Override
    // please write the showWeapon() method for the Ninja class here.
    // It should print out "Shows Katana" in a new line
    public void showWeapon() {
        System.out.println("Shows Katana");
    }

}



