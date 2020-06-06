package com.company;
import java.util.Scanner;

public class Sum {
    public static int sum(int n) {
        int value = 0;
        if (n >= 0)
            value = n + Sum.sum(n - 1);

        return value;
    }

    static int powerfunc(int base, int power) {
        //write your code here
       if(base==0) return 0;
        int value = 0;
        if (power == 1)
            value = base;
        else {
            value = base * powerfunc(base, power - 1);
        }
        return value;
    }

    static class Demo {
        int maximum;
        int i = 1;

        Demo(int n) {
            this.maximum = n;
        }

        void function() {
            if (i <= maximum) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                i++;
                function();
            }
        }
    }

    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n>0){
//            int value = Sum.sum(n);
//            System.out.print(value);
//        }
//        else{
//            System.out.println("Enter a natural number");
//        }

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        // printing the value of a^b i.e.,
        System.out.printf("%d", powerfunc(a, b));

//        int n = in.nextInt();
//        Demo obj = new Demo(n);
//        obj.function();
    }
}
