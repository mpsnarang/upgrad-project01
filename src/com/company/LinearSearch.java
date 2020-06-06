package com.company;

import java.util.Scanner;
public class LinearSearch {

    public static int getLinearSearchUnsuccessfulComparisonCount(int[] arr, int key) {
        int size = arr.length;
        int iFoundIndex = 0;
        int iComparison = 0;
        boolean bFound = false;
        for (int i = 0; i < size; i++) {
            ++iComparison;
            if (arr[i] == key) {
                iFoundIndex = i;
                bFound = true;
            }
        }

        if (bFound)
            return iComparison-1;
        else
            return iComparison;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int array[];
        int count = input.nextInt();
         array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        //write your code here
        System.out.println(getLinearSearchUnsuccessfulComparisonCount(array, key));
    }
}
