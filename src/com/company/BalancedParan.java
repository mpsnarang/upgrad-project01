package com.company;

import java.util.Stack;
import java.util.*;

public class BalancedParan {

    public static void findDuplicateParenthesis(String inputString){
        Stack < Integer > inputStack = new Stack < Integer > ();
        Stack<Character> newStack=new Stack<>();
        for(int i=0;i<inputString.length();i++) {
            if (inputString.charAt(i) != ')') {
                newStack.push(inputString.charAt(i));
            } else if (inputString.charAt(i) == ')') {
                char top = newStack.peek();
                newStack.pop();
                int iCount = 0;
                while (top != '(') {
                    top = newStack.peek();
                    newStack.pop();
                    iCount++;
                }
                if (iCount < 1) {
                    System.out.println("Input string contains duplicate parenthesis");
                    return;
                }
            }
        }
        System.out.println("Input string does not contain duplicate parenthesis");
    }

    public static void main(String[] args){
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        findDuplicateParenthesis(inputString);
    }
}
