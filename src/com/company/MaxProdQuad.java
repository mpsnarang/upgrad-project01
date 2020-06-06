package com.company;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;
public class MaxProdQuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max =  maxProdQuad(n,arr);
        if(max == -1)
            System.out.println("No Maximum Product Quadruple");
        else
            System.out.println(max);

    }

    static int maxProdQuad(int n, int[] arr){
        if(n<4)
            return -1;
        int firstMax= Integer.MIN_VALUE,
                secondMax= Integer.MIN_VALUE,
                thirdMax= Integer.MIN_VALUE,
                fourthMax= Integer.MIN_VALUE;

        int firstMin = Integer.MAX_VALUE,
                secondMin= Integer.MAX_VALUE,
                thirdMin= Integer.MAX_VALUE,
                fourthMin= Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>firstMax){
                fourthMax = thirdMax;
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(arr[i]>secondMax){
                fourthMax = thirdMax;
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if(arr[i]>thirdMax){
                fourthMax = thirdMax;
                thirdMax = arr[i];
            } else if(arr[i]>fourthMax){
                fourthMax = arr[i];
            }

            if(arr[i]<firstMin){
                fourthMin = thirdMin;
                thirdMin = secondMin;
                secondMin = firstMin;
                firstMin = arr[i];
            } else if(arr[i]<secondMin){
                fourthMin = thirdMin;
                thirdMin = secondMin;
                secondMin = arr[i];
            } else if(arr[i]<thirdMin){
                fourthMin = thirdMin;
                thirdMin = arr[i];
            } else if(arr[i]<fourthMin){
                fourthMin = arr[i];
            }
        }

//        System.out.println("MAX: "+firstMax+" "+secondMax+" "+thirdMax+" "+fourthMax);
//        System.out.println("MIN: "+firstMin+" "+secondMin+" "+thirdMin+" "+fourthMin);
        int x = firstMax * secondMax * thirdMax * fourthMax;
        int y = firstMin * secondMin * thirdMin * fourthMin;
        int z = firstMin * secondMin * firstMax * secondMax;

        System.out.println("x: "+x+", y: "+y+", z: "+z);
        return Math.max(x,Math.max(y,z));
    }




}
