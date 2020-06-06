package com.company;

import java.util.Scanner;

public class Fib {
    static int fib(int n) {
        int arrayNumbers[] = new int[n+1];
        arrayNumbers[0] = 0;
        arrayNumbers[1] = 1;
        arrayNumbers[2] = 2;

        for(int i=3; i<=n;i++){
            arrayNumbers [i] = arrayNumbers[i-1]+arrayNumbers[i-2]+arrayNumbers[i-3];
        }


        /* Declare an array to store Fibonacci numbers */
        /* Assign the 0th, 1st, and 2nd numbers of the Fibonacci series to 0, 1, and 2 respectively */
        /* Add the previous three numbers in the series, and store them */
        /* Return the nth element in the series */

        return arrayNumbers[n-1];
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
        scan.close();
    }
}
