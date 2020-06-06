package com.company;

import java.util.Scanner;

public class MergingTwoArrayDesc {

    public static void PopulateArray(int[] arr, int iSizeOfArray, Scanner input){
        int i = 0;
        for (i = 0; i < iSizeOfArray; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {

        int i = 0;
        Scanner input = new Scanner(System.in);
        int iSizeofArray1 = input.nextInt();
        int iSizeofArray2 = input.nextInt();
        int[] arr1 = new int[iSizeofArray1];
        int[] arr2 = new int[iSizeofArray2];
        int[] mergedArray = new int[iSizeofArray1+iSizeofArray2];

        PopulateArray(arr1,iSizeofArray1,input);
        PopulateArray(arr2,iSizeofArray2,input);
        sort(arr1);
        sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        MergeArrays(arr1,arr2,mergedArray);
        printArray(mergedArray);
    }

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);
            mergeDesc(numbers, first, mid, last);
        }
    }

    public static void mergeDesc(int[] numbers, int i, int m, int j) {
        int l = i; //inital index of first subarray
        int r = m + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] t = new int[numbers.length];

        while (l <= m && r <= j) {
            if (numbers[l] >= numbers[r]) {
                t[k] = numbers[l];
                k++;
                l++;
            } else {
                t[k] = numbers[r];
                k++;
                r++;
            }
        }

        // Copy the remaining elements on left half , if there are any
        while (l <= m) {
            t[k] = numbers[l];
            k++;
            l++;
        }

        // Copy the remaining elements on right half , if there are any
        while (r <= j) {
            t[k] = numbers[r];
            k++;
            r++;
        }

        // Copy the remaining elements from array t back the numbers array
        l = i;
        k = 0;
        while (l <= j) {
            numbers[l] = t[k];
            l++;
            k++;
        }
    }


        public static void MergeArrays(int[] arr1,
                                       int[] arr2,
                                       int[] mergedArray) {
            int iSizeArr1 = arr1.length;
            int iSizeArr2 = arr2.length;


            // Merge two sorted arrays into mergedArray
            int i = 0, j = 0, k = 0;
            while (i < iSizeArr1 && j < iSizeArr2) {
                if (arr1[i] >= arr2[j]) {
                    mergedArray[k++] = arr1[i++];
                } else {
                    mergedArray[k++] = arr2[j++];
                }
            }

            while (i < iSizeArr1) {  // Merging remaining
                // elements of arr1
                mergedArray[k++] = arr1[i++];
            }
            while (j < iSizeArr2) {   // Merging remaining
                // elements of arr2
                mergedArray[k++] = arr2[j++];
            }
        }
    static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.println(arr[i]);
    }
    }
