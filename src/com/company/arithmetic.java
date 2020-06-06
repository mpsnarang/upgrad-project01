package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        /*
        // example 1
        int x = 3;
        int y = 2;
        int z = x/y;
        System.out.println(z);

        //example 2
        int a = 3;
        int b = 2;
        double c = a/b;
        System.out.println(c);

        // example 3
        double p = 3.0;
        double q = 2.0;
        double r = p/q;
        System.out.println(r);


        double j = 3.0;
        double k = 2.0;
        //int l = j/k;

        double[] array1 = {10.32,20.36,30.50,40.51,50.49,60.43,71.71};

        for(int i = 0; i <  array1.length; i++) {
            // Write the round function here.
            array1[i] = Math.rint(array1[i]);
        }


        for(int i = 0; i <  array1.length; i++) {
            System.out.println(array1[i] + " ");
        }

        int[] array = {29,34,12,45,56,02,43, 19};
            Arrays.sort(array);

        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        File inputFile = new File("/Users/mahindernarang/Documents/Java/ugGrad/quiz_numbers.txt");
        Scanner scan = new Scanner(inputFile);
        int sum = 0;
        int counter = 0;
        while(scan.hasNext()){
            counter++;
            int next = 0;
            next = scan.nextInt();
            System.out.println("Next Number is : "+next);
            sum = sum + next;
            System.out.println("Sum now is :"+ sum);
        }

        double average = 0;
        average = (double)sum/(double)counter;
        System.out.println("Sum is :"+sum);
        System.out.println("Counter is :"+counter);
        System.out.println("Average is :"+average);

        // Enter a string in the input console
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String inData;
        inData = stdin.readLine();

        System.out.println("You wrote: " + inData);*/
        int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);
    }

    public static int mostVotes(int[] votesArray) {
        int maxVotesIndex = 0;
        int maxVotes = votesArray[maxVotesIndex];

        for(int i=0;i<votesArray.length;i++){
            if(votesArray[i]>maxVotes){
                maxVotesIndex = i+1;
                maxVotes = votesArray[i];
            }
        }
        return maxVotesIndex;
    }

}
