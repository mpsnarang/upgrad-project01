package com.company;

import java.util.*;

public class QSort {

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
        System.out.println(queue.toString());
    }

    // Method to sort the queue

    // Function to sort the given
// queue using recursion
    static void sort(Queue<Integer> q) {

        // Return if queue is empty
        if (q.isEmpty())
            return;

        // Get the front element which will
        // be stored in this variable
        // throughout the recursion stack
        int temp = q.peek();

        // Remove the front element
        q.remove();

        // Recursive call
        sort(q);

        // Push the current element into the queue
        // according to the sorting order
        pushInQueue(q, temp, q.size());
    }

    static void pushInQueue(Queue<Integer> q,
                            int temp, int qsize) {
        if (q.isEmpty() || qsize == 0) {
            q.add(temp);
            return;
        }

        // If current element is less than
        // the element at the front
        else if (temp <= q.peek()) {
            // Call stack with front of queue
            q.add(temp);

            // Recursive call for inserting a front
            // element of the queue to the last
            FrontToLast(q, qsize);
        } else {
            // Push front element into
            // last in a queue
            q.add(q.peek());
            q.remove();

            // Recursive call for pushing
            // element in a queue
            pushInQueue(q, temp, qsize - 1);
        }
    }

    static void FrontToLast(Queue<Integer> q,
                            int qsize) {
        // Base condition
        if (qsize <= 0)
            return;

        // pop front element and push
        // this last in a queue
        q.add(q.peek());
        q.remove();

        // Recursive call for pushing element
        FrontToLast(q, qsize - 1);
    }
}
