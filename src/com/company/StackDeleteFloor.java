package com.company;
import java.util.*;

public class StackDeleteFloor {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n-- > 0)
            stack.push(s.nextInt());
        int iFloor = stack.size()/2;

        deleteFirstHalf(stack,iFloor);
        System.out.println(stack.toString());
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack, int iFloor) {
        // Write your code here
        if(stack.isEmpty())
            return;


        int iTop = stack.pop();
        if(stack.size()==iFloor){
            stack.removeAllElements();
            stack.push(iTop);
        } else{
            deleteFirstHalf(stack,iFloor);
            stack.push(iTop);

        }
    }
}
