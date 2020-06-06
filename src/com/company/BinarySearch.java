package com.company;
import java.util.*;

public class BinarySearch {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int start = 0;
        int end = inputArr.length - 1;
        int iNoOfComparison = 0;
        boolean bFound = false;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            System.out.println("Mid is : "+mid);
            ++iNoOfComparison;
            if (key == inputArr[mid]) {
                bFound = true;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //System.out.println("No of Comparisons: "+iNoOfComparison);
        if (bFound)
            return iNoOfComparison-1;
        else
            return iNoOfComparison;
    }
    public static void main(String args[] ) throws Exception {
        BinarySearch bs = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
