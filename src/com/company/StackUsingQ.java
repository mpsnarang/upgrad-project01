package com.company;

import java.util.*;

public class StackUsingQ {

    /*implementing queue using linked list */
    static Queue < Integer > qu = new LinkedList < Integer > ();

    /* Push operation of stack using queue*/
    public static void push(int x) {
        //write your code here
        //System.out.println("Queue");
        if(qu.isEmpty())
            qu.add(x);
        else{
            int iQueueSize = qu.size();
            qu.add(x);
            int iCounter = 1;
            do{
                int iTemp = qu.remove();
                qu.add(iTemp);
                iCounter++;
            } while(iCounter <=iQueueSize);
        }

    }

    /*Removes the top element of the stack*/
    int pop() {
        //write your code here
        return qu.remove();
    }


    /*Returns the element at the top of the stack */
    int top() {
        //write your code here
        return qu.peek();
    }


    public static void main(String[] args) {
        StackUsingQ obj = new StackUsingQ();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in.nextInt();

        if (n == 0)
            System.out.println("Stack is empty");
        else {
            /*Enter the elements of the stack */
            for (int i = 0; i < n; i++) {
                obj.push(in.nextInt());
            }

            System.out.println(obj.top());
            obj.pop();
            System.out.println(obj.top());
        }
    }
}
