package com.company;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class StacksAndQ {

    static Stack<Integer> st = new Stack<Integer>();
    static Queue<Integer> qu = new LinkedList<Integer>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            int iNext = s.nextInt();
            pushToQueue(iNext);
            pushtoStack(iNext);
        }
        System.out.println("Stack: "+st.toString());
        System.out.println("Queue: "+qu.toString());
    }

    private static void pushtoStack(int iNext){
        //System.out.println("Stack");
        st.push(iNext);
    }

    private static void pushToQueue(int iNext){
        //System.out.println("Queue");
        if(qu.isEmpty())
            qu.add(iNext);
        else{
            int iQueueSize = qu.size();
            qu.add(iNext);
            int iCounter = 1;
            do{
                int iTemp = qu.remove();
                qu.add(iTemp);
                iCounter++;
            } while(iCounter <=iQueueSize);
        }
    }










    }

