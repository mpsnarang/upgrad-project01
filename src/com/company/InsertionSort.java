package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

    public static int[] InsertionSorterDesc(int[] arr){
        int iArrayLength = arr.length;
        for(int i=1; i < iArrayLength; i++){
            int j=i;
            int temp;
            while(j>0 && arr[j-1]<arr[j]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static String[] InsertionSorterDesc(String[] arr){
        int iArrayLength = arr.length;
        for(int i=1; i < iArrayLength; i++){
            int j=i;
            String temp = null;
            while(j>0 && arr[j-1].compareToIgnoreCase(arr[j])<0){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }



    public static int[] InsertionSorterAsc(int[] arr){
        int iArrayLength = arr.length;
        for(int i=1; i < iArrayLength; i++){
            int j=i;
            int temp;
            while(j>0 && arr[j-1]>arr[j]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
         System.out.println("After iteration "+(i)+" "+Arrays.toString(arr));
        }
        return arr;
    }

    public static String[] InsertionSorterAsc(String[] arr){
        int iArrayLength = arr.length;
        for(int i=1; i < iArrayLength; i++){
            int j=i;
            String temp = null;
            while(j>0 && arr[j-1].compareToIgnoreCase(arr[j])>0){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }


    public static void PrintArray(int[] arr){
        int iArrayLength = arr.length;
        for(int i=0; i < iArrayLength; i++){
            System.out.println(arr[i]);
        }
    }

    public static void PrintArray(String[] arr){
        int iArrayLength = arr.length;
        for(int i=0; i < iArrayLength; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {12, 8, 9, 10, 15, 4, 3, 6, 7};
//        String[] sFirstNames = {"Mahinder","Anuj","Rakhi"};
//        String[] sLastNames = {"Narang","Dhaliwal","Sawant"};

//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        String firstNames[] = new String[size];
//        String lastNames[] = new String[size];
//        for (int i = 0; i < size; i++) {
//            firstNames[i] = scanner.next().toLowerCase();
//        }
//        for (int i = 0; i < size; i++) {
//            lastNames[i] = scanner.next().toLowerCase();
//        }


        //        Scanner input = new Scanner(System.in);
//        int iSizeofArray = input.nextInt();
//        int[] arr = new int[iSizeofArray];
//        for (int i = 0; i < iSizeofArray; i++) {
//            arr[i] = input.nextInt();
//        }
//        InsertionSorterAsc(firstNames);
//        InsertionSorterDesc(lastNames);
//        PrintArray(firstNames);
//        PrintArray(lastNames);

        InsertionSorterAsc(arr);
        PrintArray(arr);
    }

}
