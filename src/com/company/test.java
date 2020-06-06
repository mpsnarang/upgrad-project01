package com.company;
import java.util.*;

public class test {
    public static void main(String[] args) {
   /*     char a = 97;
        int iIndex = 0;
        while (iIndex < 26) {
            System.out.print(a);
            a++;
            iIndex++;
        }
        System.out.println("");
        for (int i = 2000; i <= 3000; i++) {
            if (i % 8 == 0) {
                if (i % 6 != 0) {
                    System.out.print(i + " ");
                }
            }
        }*/
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        //Enter the number upto which you wish to find the sum, in the input console
        //System.out.println("Enter a Number");
        int number;
      /*  int sum = 0;

        for (int i=1; i <=number;i++) {
            sum = sum+i;
        }
        System.out.println(sum);
        System.out.println("Enter a Number to print in reverse order");
        int n=scan.nextInt();
        while(n>0){
            System.out.println(n);
            n--;
        }
        System.out.println("Average of how many numbers");
        int howManyNumbers=scan.nextInt();
        sum = 0;
        for(int i=0; i<howManyNumbers;i++){
            sum = sum + scan.nextInt();
        }
        int average = sum/howManyNumbers;
        System.out.println(average);*/
        System.out.println("Enter the number");
        // Enter the number
        number = scan.nextInt();
        int result = 1;
        if(number >= 2) {
            while (((Math.pow((double)2,(double)result))) <= number){
                result++;
            }
        }
        System.out.print((int)Math.pow((double)2,(double)(result-1)));
    }
}