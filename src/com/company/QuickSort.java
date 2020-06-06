package com.company;

import java.util.Arrays;
import java.util.Scanner;

//"Christene","Tomas","Marline", "Marcelluss", "Michelle", "Quiana", "Keny"

public class QuickSort {
    public static void main(String[] args) {

        //        int i = 0;
//        Scanner input = new Scanner(System.in);
//        int iSizeofArray = input.nextInt();
//        String[] ar = new String[iSizeofArray];
//        for (i = 0; i < iSizeofArray; i++) {
//            ar[i] = input.next();
//        }

        int[] ar = {2,4,6,8,10,12,14,16,18,20};
        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

    public static void quickSort(int[] ar, int start, int end) {
        if (start < end) {
            int p = partitionDesc(ar, start, end);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, end);
        }
    }

    public static void quickSort(String[] ar, int start, int end) {
        if (start < end) {
            int p = partition(ar, start, end);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, end);
        }
    }

    public static int partition(String[] ar, int start, int end) {
        int pivot = ar[end].length();
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length() <= pivot) {
                String temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;
        return i;
    }


    public static int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j] <= pivot) {
                int temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;
        return i;
    }

    public static int partitionDesc(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j] >= pivot) {
                int temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;
        return i;
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]+" ");
    }

    static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.println(arr[i]+" ");
    }



}
