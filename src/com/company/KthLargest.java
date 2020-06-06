package com.company;

import java.util.*;

public class KthLargest {
    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        //write your code here
        Stack < Integer > tempStack = new Stack<Integer>();
        if(tempStack.isEmpty())
            tempStack.add(input.pop());

        do{

            Integer iTempInt = input.pop();
            int iCounter = 0;
            boolean bTempStPeakkCheck = true;
            //System.out.println("In Loop 1");
            while(bTempStPeakkCheck && !tempStack.isEmpty()){
                //System.out.println("In Loop 2");
                if(iTempInt < tempStack.peek()) {
                    //System.out.println("Poping from temp to input: "+tempStack.peek());
                    input.add(tempStack.pop());
                    iCounter++;
                } else{
                    //System.out.println("Else");
                    tempStack.push(iTempInt);
                    bTempStPeakkCheck = false;
                }

                if(tempStack.isEmpty()) {
                    //System.out.println("Else If for Empty");
                    tempStack.push(iTempInt);
                    bTempStPeakkCheck = false;
                }
            }
           // System.out.println("iCounter "+iCounter);

            while(iCounter>0){
               // System.out.println("Poping back from input to temp: "+input.peek());
                tempStack.push(input.pop());
                iCounter--;
            }
            //System.out.println("Temp Stack: "+tempStack.toString());

        } while(!input.isEmpty());

        System.out.println(tempStack.toString());
        return tempStack;
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        //write your code here
        int iSize = sortedStack.size();
        System.out.println(sortedStack.elementAt(0));

    }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }

}
