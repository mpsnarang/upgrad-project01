package com.company;

import java.util.Scanner;

public class ValueSameAsIndex {

    private static String sNotFoundMessage = "NOT_FOUND";

    private static void populateArray(Scanner scanner, int iArraySize, int[] arr) {
        for (int i = 1; i < iArraySize; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    static int binarySearch(int arr[], int low, int high) {
        if(high >= low)
        {
            /* low + (high - low)/2; */
            int mid = (low + high)/2;
            if(mid == arr[mid])
                return mid;
            if(mid > arr[mid])
                return binarySearch(arr, (mid + 1), high);
            else
                return binarySearch(arr, low, (mid -1));
        }

        /* Return -1 if there is
           no Fixed Point */
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int iSizeofArray = s.nextInt();
        int[] aNumbers = new int[iSizeofArray + 1];
        populateArray(s, (iSizeofArray + 1), aNumbers);
        int iValueasIndex = binarySearch(aNumbers,1, iSizeofArray+1);
        if(iValueasIndex != -1)
            System.out.println(iValueasIndex);
        else
            System.out.println(sNotFoundMessage);
    }
}
