package com.company;
import java.util.*;
import java.lang.Math;


public class PeopleMeet {

    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        int p1 = s.nextInt();
//        int p2 = s.nextInt();
//        int s1 = s.nextInt();
//        int s2 = s.nextInt();
//        twoPeopleMeet(p1, p2, s1, s2);
        //GrowthRates();
        System.out.print(fun(6));
    }

    static int fun(int n) {
        int a = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < i * i; j++)
                for (int k = 0; k < j; k++)
                    a++;
System.out.println(a);
                return a;
    }



    static int fun(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return fun(a + a, b / 2);
        return fun(a + a, b / 2) + a;
    }

    public static int factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        return factorials[n];
    }

//    static void fun(int x){
//        if(x>0){
//            fun(x-1);
//            System.out.print(x-1+" ");
//            fun(x-1);
//        }
//    }

//    static int fun(int a) {
//        if (a % 2 == 1)
//            return a++;
//        else
//            return fun(fun(a - 1));
//    }


    static void GrowthRates() {

        for(int n = 1; n<5; n++) {
            System.out.println("2^n : " + Math.pow(2, n));
            System.out.println("n^2 : " + Math.pow(n, 2));
            System.out.println("n : " + n);
            System.out.println("sqrt(n) : " + Math.sqrt(n));
            System.out.println("n! :" + factorial2(n));
            System.out.println("4^n :" + Math.pow(4, n));
            System.out.println("log(n!) :" + Math.log(factorial2(n)));
            System.out.println("log(n) :" + Math.log(n));
            System.out.println("1 :" + "1");
            System.out.println("log(log(n)) :" + Math.log(Math.log(n)));
            System.out.println("log(n) * log(n)) :" + Math.log(n) * Math.log(n));
            System.out.println("n*log(n)) :" + n * Math.log(n));
            System.out.println("\n\n");
            System.out.println("+++++++++++++++++++++++++++++++++++");
        }

    }




    // Method to find whether two people meet after jumping for the same number of times
    static void twoPeopleMeet(int p1, int p2, int s1, int s2) {
        // Write your code here
        if(p1==p2){
            return;
        }

        boolean isP1Ahead = (p1>p2)? true : false;
        boolean isP2Ahead = !isP1Ahead;
        boolean isP2SpeedMore = (s2>s1)? true: false;
        boolean isP1SpeedMore = !isP2SpeedMore;

        if((isP1Ahead && isP2SpeedMore)|| (isP2Ahead && isP1SpeedMore)){
            int iSpeedDifference;
            int iDistanceOfSeperation;
                if(isP1Ahead){
                    iDistanceOfSeperation = p1-p2;
                    iSpeedDifference = s2-s1;
                }
                else {
                    iDistanceOfSeperation = p2-p1;
                    iSpeedDifference = s1 - s2;
                }
            if(iDistanceOfSeperation%iSpeedDifference == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }



}
