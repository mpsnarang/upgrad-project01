package com.company;

import java.util.*;

public class StackReverse {
    class Node {
        char data;
        Node next;
        public Node(char new_data) {
            data = new_data;
            next = null;
        }
    }

    Node top;

    // Push and pop operations
    public void push(char new_data) {

        Node new_node = new Node(new_data);
        if (top == null) {

            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
    }

    public Node pop() {
        Node node = top;
        top = top.next;
        return node;
    }

    // prints contents of stack
    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Reverses the stack using simple
    // linked list reversal logic.
    public Node reverse() {
        // Write your code here.
        if(this.top==null){
            System.out.print("the stack is empty");
            return null;
        }
        Node prev, cur, succ;
        cur = prev = this.top;
        cur = cur.next;
        prev.next = null;
        while (cur != null) {

            succ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = succ;
        }
        this.top = prev;
        return top;
    }



    public static void main(String[] args) {
        StackReverse obj = new StackReverse();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            obj.push( in .next().charAt(0));

        }

        obj.display(obj.top);
        System.out.println(" ");
        // reverse
        Node temp = obj.reverse();
        obj.display(temp);


    }
}