package com.company;

import java.util.*;

public class ImplementingStacks {
    public static void main(String args[]) {
//        Stack<Integer> stack = new Stack<>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int i = n;
//        while (n-- > 0)
//            stack.push(s.nextInt());
//        int position = 5;
       // printFifthElementFromStart(stack,i);

//        Stack<Character> s = new Stack<Character>();
//        Scanner in = new Scanner(System.in);
//        String data = in.nextLine();
//        for(int i = 0; i<data.length();i++){
//            s.push(data.charAt(i));
//        }
//        do{
//            System.out.print(s.pop());
//        } while(!s.empty());

        printReverse();
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here
        int position = 1;
        boolean bEnoughElements = true;
        while(position<5){
            if(stack.empty()){
                System.out.println("There are not enough elements in the stack");
                bEnoughElements = false;
                break;
            } else {
                stack.pop();
                position++;
            }
        }
        if(bEnoughElements && !stack.empty())
            System.out.println(stack.peek());
        else
            System.out.println("There are not enough elements in the stack");
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack,int iNumberofElements) {
        // Write your code here
        int iElementfromStart = (iNumberofElements-4);
        boolean bEnoughElements = (iElementfromStart>0) ? true : false;

        if(bEnoughElements){
            while(iElementfromStart >1) {
                stack.pop();
                iElementfromStart--;
            }
            System.out.println(stack.peek());
        } else
            System.out.println("There are not enough elements in the stack");
    }

    static void printReverse() {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(14);
        stack.push(23);
        stack.pop();
        stack.push(12);

        //Write your code here. Your stack should finally look like this: [2, 45, 53, 54, 12].
        do{
            stack.pop();
        } while(!stack.empty());

        stack.push(2);
        stack.push(45);
        stack.push(53);
        stack.push(54);
        stack.push(12);

        System.out.print(stack);


    }




}
