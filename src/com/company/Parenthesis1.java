package com.company;

import java.util.Scanner;

public class Parenthesis1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sString = input.nextLine();
        if(match(sString))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean match(String parens) {

        char[] cString = parens.toCharArray();
        int iCounter = 0;
        int iStringLen = cString.length;
        for(int i = 0; i<iStringLen;i++){
            if(cString[i]=='(')
                iCounter++;
            else if (cString[i]==')')
                iCounter--;

            if(iCounter<0)
                return false;
        }
        return true;
    }
}
