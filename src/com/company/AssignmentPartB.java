package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AssignmentPartB {
    private static String sNotFoundMessage = "NOT_FOUND";

    /*
    * Populate the array
    * start indexed at one
    */
    private static void populateArray(Scanner scanner, int iArraySize, int[] arr) {
        for (int i = 1; i < iArraySize; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    /*
     * Get last non null index of the infinte array
     *
     */

    static int getlastIndex(int[] arr, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            try{
                // check if value at mid of array is null or not
                // Using minnimum value of Integar as check
                if(Integer.valueOf(arr[mid]) > Integer.MIN_VALUE){
                    // if it is not null, then shift right of mid to find last not null element
                    return getlastIndex(arr, mid + 1, high);
                }
            }
            catch(NullPointerException npEx){
                // if it is null, then shift left of mid last not null element
                return getlastIndex(arr, low, mid - 1);
            }
            catch(ArrayIndexOutOfBoundsException aiExp){
                // if array is out of bound, then shift left of mid last not null element
                return getlastIndex(arr, low, mid - 1);
            }
            // If this has reached it means the high, low and mid
            // are same for last not null value. Should never reach here
            return mid;
        }
        return low-1;
    }

    /*
     * Binary Search
     */

    private static int binarySearch(int[] arr, int iLow, int iHigh, int iKey) {

        if (iHigh >= iLow) {
            int mid = iLow+ (iHigh - iLow) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == iKey)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > iKey)
                return binarySearch(arr, iLow, mid - 1, iKey);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, iHigh, iKey);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    /*
     * This method first find the last index of infinite array
     * Then calls the binary search to find the key
     */

    private static int searchInfiniteArray(int[] aNumbers, int iKey ) {
        int ilocalLow = 1;
        int iLocalHigh = 2;
        int lastIndex;
        try{
            do {
                ilocalLow = iLocalHigh;
                iLocalHigh = 2*iLocalHigh;
            } while(Integer.valueOf(aNumbers[iLocalHigh]) != null);
        }
        catch (NullPointerException npEx){}
        catch(ArrayIndexOutOfBoundsException aiExp){}

        lastIndex = getlastIndex(aNumbers, ilocalLow, iLocalHigh);
        return binarySearch(aNumbers, 1, lastIndex, iKey);
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // get size of array
        int iSizeofArray = s.nextInt();

        // get the key to be found
        int iKey = s.nextInt();

        // instantiate the array
        int[] aNumbers = new int[iSizeofArray + 1];

        // Populate the array
        populateArray(s, (iSizeofArray + 1), aNumbers);

        // search the array for the key
        int iValueasIndex = searchInfiniteArray(aNumbers,iKey);

        if(iValueasIndex != -1)
            System.out.println(iValueasIndex);
        else
            System.out.println(sNotFoundMessage);
    }
}
