package com.company;

import java.util.Scanner;
import java.util.Stack;

public class StackSubString {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student

        String s1 = sequence1.toString();
        String s2 = sequence2.toString();

        int j = 0;

        for (int i = 0; i < s2.length() && j < s1.length(); i++)
            if (s1.charAt(j) == s2.charAt(i))
                j++;

        // If all characters of str1 were found
        // in str2
        return (j == s1.length());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        int boxIndex = 0;
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}

