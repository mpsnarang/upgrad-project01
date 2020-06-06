package com.company;

import java.util.Scanner;

public class userInput {
    public static void main( String[] args ) {
        int numberA;
        int numberB;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");

        numberA = input.nextInt();

        System.out.println("Enter the value for b");

        numberB = input.nextInt();
        System.out.println(numberA + numberB);

        int a=2;

        char b='1';

        int c=a+(int)b;

        System.out.println(c);
    }
}
