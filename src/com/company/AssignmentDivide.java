package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class AssignmentDivide {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++) {
            int factorial = computefactorial(n);
            //System.out.println("factorial "+i+" : "+factorial);
        System.out.println(factorial);
        System.out.println(lastNonZeroIndex(factorial));
//        }
//

    }

    static int computefactorial(int n){
        if(n<=1) return 1;
        return n * computefactorial(n-1);
    }

    static int lastNonZeroIndex(int n){
        while(n%10==0)
            n= n/10;
       return n%10;
    }




}
