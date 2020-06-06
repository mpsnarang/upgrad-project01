package com.company;
import java.util.*;

public class PalindromeQ {

    public static void checkPalindrome(String input) {
        //Write your code here
        Queue<Character> qu = new LinkedList<Character>();
        int iStrLen = input.length();
        for (int i=iStrLen-1; i>= 0; i--)
            qu.add(input.charAt(i));

        boolean isPalindrome = true;
        for(int i = 0; i<iStrLen;i++){
            if(!(input.charAt(i) == qu.remove()))
                isPalindrome = false;
        }

        if(isPalindrome)
            System.out.println("The given input is a palindrome.");
        else
            System.out.println("The given input is not a palindrome.");
    }
    public static void main(String[] args) {
        PalindromeQ obj = new PalindromeQ();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}
