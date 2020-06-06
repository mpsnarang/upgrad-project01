package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Queue;

// In java, you can use an inbuilt Queue using the Linked class
// Here, the convention changes a bit -
// Java queues don't have enqueue and dequeue methods; these operations are carried out using the following methods:
// Enqueuing: add(x), Throws an exception if it fails to insert the object, i.e. when the queue is full
// Dequeuing: remove(), Throws an exception if the queue is empty
// peek(): Returns the head of the queue. It would return null if the queue is empty
// isEmpty(): Returns true if the queue is empty
// You may read more here - https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html

public class QueueEx {

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromStart(queue);
    }

    // Method to print the fifth element from the head of the queue
    static void printFifthElementFromStart(Queue<Integer> queue) {
        // Write your code here
        int iSize = queue.size();
        if(iSize<6){
            System.out.println("There are not enough elements in the queue");
            return;
        }
        int iCounter = iSize - 4;
        int n = 1;

        while (n<iCounter) {
            queue.remove();
            n++;
        }

        System.out.println(queue.peek());
    }

}


