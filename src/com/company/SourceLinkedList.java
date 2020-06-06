package com.company;

import java.io.IOException;
import java.util.*;

public class SourceLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        fun1();
        System.out.print("A");
    }

    static void fun1() {
        try {
            fun2();
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        }
    }

    static void fun2() throws IOException {
        fun3();
        System.out.print("D");
    }

    static void fun3() throws IOException {
        throw new IOException();
    }


    static void fun() {
        throw new ArithmeticException();
    }

    static void fun(int n) {
        if (n < 60)
            throw new ArithmeticException("Not Eligible");
        else
            System.out.println("Eligible for pension");
    }


    static void fun1(int n){
        try {
            fun2(n);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("In fun1");
    }
    static void fun2(int n){
        fun3(n);
        System.out.println("In fun2");
    }
    static void fun3(int n) {
        if (n < 60)
            throw new ArithmeticException("Not Eligible");
        else
            System.out.println("Eligible for pension");
    }


//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        head = null;
//        if (n > 0) {
//            head = new Node(s.nextInt());
//            Node temp = head;
//            for (int i = 1; i < n; i++) {
//                temp.next = new Node(s.nextInt());
//                temp = temp.next;
//            }
//        }
//        int k = s.nextInt();
//        kthNodeFromEnd(k);
        //5 8 2 15 6 25 1 11 13
//        System.out.println(search(k));




    /* Function to reverse the linked list */
    private static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static void kthNodeFromEnd(int k) {
        // Write your code here
        Node reverseList = reverse(head);
        int iIndex = 1;
        Node temp = reverseList;
        while(temp != null){
            if(iIndex == k){
                System.out.println(temp.data);
                break;
            } else {
                temp = temp.next;
                iIndex++;
            }
        }
        if(k > iIndex){
            System.out.println("Not Possible");
        }
    }

    static  void deleteNodeAtGivenIndex(int index) {
        int iIndex = 0;
        int iSerialNumber = index-2;
        if(index==1){
            head = head.next;
        }
        Node temp = head;

        while (temp.next != null && index >1) {
            if(iIndex == iSerialNumber ){
                Node holder = temp.next.next;
                    //System.out.println("Holder "+holder.data);
                    temp.next = holder;
                    break;

            } else{
                temp = temp.next;
                iIndex++;
            }
        }
    }

    static void deleteLastNode() {
        // Write your code here
        Node temp = head;
        if(temp.next != null){
        while (temp.next != null) {
            //System.out.println(temp.data + " ");
            if(temp.next.next == null)
                break;
            else
                temp = temp.next;
        }
            temp.next = null;
        } else if(temp.next == null){
            head = null;
        }
    }


    static  void addAtGivenIndex(int k, int index) {

        Node temp = head;
        Node newNode = new Node(k);
        int iIndex = 0;

        while (temp.next != null) {
            if(iIndex < index - 1){
                temp = temp.next;
                iIndex++;
            } else
                break;
        }

        Node exchangeNode = temp;
        newNode.next = exchangeNode.next;
        temp.next = newNode;

}


    static  void addAtEnd(int k) {
        // Write your code here
        Node temp = head;
        while (temp.next != null) {
            //System.out.println(temp.data + " ");
            temp = temp.next;
        }

        if(temp.next == null){
            temp.next = new Node(k);
            temp = temp.next;
        }
    }


    static boolean search(int k) {
        // Write your code here
        Node temp = head;
        boolean found = false;
        boolean lastNode;

        while (!found) {
            lastNode = (temp.next != null) ? false : true;
            int tempData = temp.data;
            if (tempData == k) {
                found = true;
                break;
            } else if (lastNode)
                break;
            else
                temp = temp.next;
        }
        return found;
    }




//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = s.nextInt();
//        int k = s.nextInt();
//        search(arr, k);

        //int random[ ] = {2, 4, 5, 10};
//        ArrayList<Float> random = new ArrayList<Float>();
//        random.add(2.0f);
//        random.add(4.0f);
//        random.add(5.0f);
//        random.add(10.0f);
//        random.add(99.9f);


        //Declare and create an object of the ArrayList class named 'random', in place of the line above

        //Add the first four elements to this 'random' ArrayList

//        printArray(random);

//        Scanner s = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = s.nextInt();
//        for (int i = 0; i < n; i++)
//            list.add(s.nextInt());
//        reverseArrayList(list);
//        for (int i = 0; i < list.size(); i++)
//            System.out.print(list.get(i) + " ");







//    }

    // Method to search for k in an unsorted array
//    static void search(int[] arr, int k) {
//        // Write your code
//        boolean found = false;
//        for(int iterator: arr){
//            if(!found){
//                if(iterator == k){
//                    found = true;
//                    break;
//                }
//        }
//    }
//        System.out.println(found);
//    }

    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        Object[] array = list.toArray();
        list.clear();
        int iterator = array.length;
        for (int i=iterator-1;i>=0;i--){
            list.add((Integer)array[i]);
        }
    }

//    public static void printArray(int[] arr) {   //Change the type of the parameter to ArrayList
//        for(int a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
//            System.out.println(a);
//        }
//    }
//
//    public static void printArray(ArrayList<> numberList) {   //Change the type of the parameter to ArrayList
//        for(Object o : numberList) {              //Change the data type of 'a' from 'int' to 'Object'
//            System.out.println(o);
//        }
//    }


}