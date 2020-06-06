package com.company;
import java.util.*;

public class QueueDeleteFloor {

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<1)
            return;
        else {
            while (n-- > 0)
                queue.add(s.nextInt());
            deleteSecondHalf(queue);
        }
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        int iSizeQ = queue.size();
        int iFloor = iSizeQ/2;
        int iCounter = 0;
        do {
            if(++iCounter<=iFloor)
                queue.add(queue.remove());
            else
                queue.remove();
            //System.out.print(iCounter+" ");
        } while(iCounter < iSizeQ);
        System.out.println(queue.toString());
    }



}
