package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class AssignmentRecurs {
    public static int sum(int n) {
        //write the logic here
        if((n/10)==0)
            return n;
        else
            return n%10 + sum(n/10);
    }



    public static boolean palindrome(int[] num, int index) {
        //write the logic here
        if(index < num.length/2) {
            if (num[index] == num[num.length - (index + 1)]) {
                palindrome(num, ++index);
            } else {
                return false;
            }
        }
        return true;
    }

    public static int func(int x, int n) {
        System.out.println("x: "+x+"   n: "+n + "n%2 is "+n%2);
        if (n == 0)
            return 1;
        else if(n%2 == 0)
            return func(x*x, n/2);
        else
            return x*func(x*x, n/2);
    }

    public static int func(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func(n/2);
    }

    public static void factorial1(int n) {

        int factorial = 1;
        int index = 1;
        for (int i = 0; i <= Math.pow(n, n); i++) {
            if (i == factorial * index) {
                factorial = i;
                index += 1;
                if (index == n + 1) {
                    System.out.println(factorial);
                    break;
                }
            }
        }
    }

    public static int factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        return factorials[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int num = sc.nextInt();
//        System.out.println(sum(num));

//        int num[] = new int[5];
//        for(int i=0; i< 5;i++)
//            num[i]=sc.nextInt();
//        boolean answer =palindrome(num, 0);
//        System.out.println(answer);

//        System.out.println(func(12));
//        factorial1(5);
            int factorial = factorial2(5);
    }
}

