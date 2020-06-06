package com.company;

import java.util.Scanner;

public class SortWrongIndex {

    private static void populateArray(Scanner scanner, int iArraySize, int[] arr) {
        for (int i = 0; i < iArraySize; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    private static int findWrongIndex(int[] arr){
        int iWrongIndex = -1;
        for(int i=1; i<arr.length-1;i++){
            if(arr[i-1] > arr[i]) {
                iWrongIndex = i;
                break;
            }
        }
        return iWrongIndex;
    }

    static int getMissingMax(int n, int[] arr) {

        int iMissingMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n && arr[i] > iMissingMax) {
                iMissingMax = arr[i];
            }
        }
        return iMissingMax;
    }


    private static void makeArraySorted(int[] unsortedArray, int[] secondArray){
        int iWrongIndex =   findWrongIndex(unsortedArray);
        int iMissingValue = getMissingMax(unsortedArray[iWrongIndex+1],secondArray);
        if(iMissingValue!=Integer.MIN_VALUE)
            System.out.println(iMissingValue);
        else
            System.out.println("Not Possible");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        populateArray(s, n1, array1);

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        populateArray(s, n2, array2);

        makeArraySorted(array1,array2);


        // Write your code here


    }
}