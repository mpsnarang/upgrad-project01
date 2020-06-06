package com.company;
import java.util.*;

public class PrimeNumbers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }

    // Method to print all primes less than or equal to n in ascending order
    static void primesLessThanOrEqualTon(int n) {
        // Write your code here
        if(n<2){
            System.out.println("There are no prime numbers less than or equal to "+n);
            return;
        }

        boolean[] prime = new boolean[n+1];
        for(int i = 0; i<=n;i++){
            prime[i] = true;
        }
        for(int i = 2; i*i<=n; i++){
            if(prime[i] == true){
                for(int j=i*2;j<=n; j=i+j){
                    prime[j] = false;
                }
            }
        }
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
}
