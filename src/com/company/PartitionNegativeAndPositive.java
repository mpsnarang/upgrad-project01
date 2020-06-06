package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PartitionNegativeAndPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    private static boolean samesigns(int a, int b) {
        if ((a ^ b) > 0)
            return true;
        else
            return false;
    }

    private static void printArraylist(ArrayList<Integer> arrList, boolean bFirstElementPos) {
        if (arrList.isEmpty()) {
            if (bFirstElementPos)
                System.out.print("Array doesn't have negative numbers");
            else
                System.out.print("Array doesn't have positive numbers");
        } else {
            int iLastIndex = arrList.size() - 1;
            for (int i = 0; i < arrList.size(); i++) {
                System.out.print(arrList.get(i)+" ");
//                if (i != iLastIndex)
//                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    private static void partitionNegativeAndPositive(int iArraySize, int[] aNumbers) {
        ArrayList<Integer> alFirst = new ArrayList<Integer>();
        ArrayList<Integer> alSecond = new ArrayList<Integer>();

        alFirst.add(Integer.valueOf(aNumbers[0]));
        boolean bIsFirstPositivePos = (aNumbers[0] >= 0) ? true : false;

        for (int i = 1; i < iArraySize; i++) {
            if (samesigns(aNumbers[0], aNumbers[i]))
                alFirst.add(aNumbers[i]);
            else
                alSecond.add(aNumbers[i]);
        }
        printArraylist(alFirst, bIsFirstPositivePos);
        printArraylist(alSecond, bIsFirstPositivePos);
    }
}
