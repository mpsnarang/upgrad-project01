package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    System.out.println("Swapping " + numbers[j - 1] + " with " + numbers[j]);
                    swap(j - 1, j, numbers);
                }
            }
        }
        return numbers; // returning the final sorted array
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String args[]) {
        //int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        //int[] sortedNumbers;

        //sortedNumbers = sort(randomNumbers); // bubble sort

        // print out the sorted numbers
        //System.out.println(Arrays.toString(sortedNumbers));
        //optimisedBubbleSort();
        //Input 1: The value of M
        //Input 2: The size of the array
        //Input 3: The elements inside the array
        int i = 0;
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter the no. of iterations: ");
        int iNumberofIterations = input.nextInt();
        //System.out.println("Enter size of array: ");
        int iSizeofArray = input.nextInt();
        int[] arr = new int[iSizeofArray];
        //System.out.println("Enter the elements of the array :");
        for (i = 0; i < iSizeofArray; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(arr,iNumberofIterations));
    }

    public static void optimisedBubbleSort() {
        int i = 0;
        int[] arr = {12, 8, 9, 10, 15, 4, 3, 6, 7};
        System.out.println("Enter the elements of the array :");
        for (i = 0; i < arr.length; i++) {
            // setting the initial value of swap to zero.
            int swap = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    //swapping when element at position j-1 is greater than element at j position.
                    System.out.println("Swapping " + arr[j - 1] + " with " + arr[j]);
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = 1;
                    System.out.println("Value of swap: " + swap);
                    /* if at any step the swapping is done, we change the swap value to one,
                    so that we know  that the sequence is not sorted at this step.*/
                }
            }
            /*This will check if the swap value is not changed to 1, because if the value
            is not updated then it has not entered the inner loop even once, and no swapping was done.
            Therefore the sequence is sorted now.*/
            if (swap == 0) {
                break;
            }
        }

        System.out.println("sorted array ");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
    1 2 3 4
    Iertation 1
    j->1: arr[0] < array[1]: 1<2 -> Yes ; Swap-> 1
    j->2: arr[1] <array [2]: 1<3 -> Yes; Swap ->2
    j->3: arr[2] < arr[3]: 1<4 -> Yes: Swap ->3

    Now the array is 2 3 4 1

    Iertation 2
    i=1, j=1; j<3
    j->1 arr[0] < arr[1]: 2<3 -> yes: Swap 4
    j->2 arr[1] < arr[2]: 2<4 -> yes: Swap 5
    j->3 arr[2] < arr[3]: 2<1 -> No: Swap 5


     */

    static int totalBubbleSortSwaps(int[] array, int M) {
        int i = 0;
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        //Write your code here
        for (i = 0; i < M; i++) {
            for (int j = 1; j < size - i; j++) {
                if (array[j - 1] < array[j]) {
                    //swapping when element at position j-1 is less than element at j position.
                    //System.out.println("Swapping "+array[j-1]+"  with "+array[j]);
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    totalSwaps++;
                }
            }
        }
        return totalSwaps;
    }
}

// (11*12)/2 - (9*10)/2
//66 - 45 = 21