package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisionChocolateBar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        numberOfSubArrays(arr, n, d, m);
    }
    // Method to find number of subarrays of size m whose sum of elements is d
    static void numberOfSubArrays(int[] arr,int n, int d, int m){
        int iCounter = 0;
        int sum = 0;
        for(int i=0; i<=(arr.length-m);i++){
            if(i<1){
                sum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
                //System.out.println("First Loop Sum: "+sum);
            }
            else {
                sum = sum - arr[i - 1] + arr[i+3];
                //System.out.println("Second Loop Sum: "+sum);
            }
            if(sum == d)
                ++iCounter;
        }
        System.out.println(iCounter);
    }


}
