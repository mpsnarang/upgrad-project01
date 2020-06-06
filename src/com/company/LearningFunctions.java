package com.company;
import java.util.Scanner;
public class LearningFunctions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Enter the numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        //System.out.print(squareOfSum(number1, number2));
        System.out.print(lcm(number1, number2));
    }

    public static int squareOfSum(int var1, int var2){
        return((var1+var2)*(var1+var2));
    }

    public static int lcm(int num1, int num2){
        int lcm = 0;
        lcm = (num1>=num2)? num1:num2;
        int increment = 1;
        int probableLCM = lcm;
        while(true) {
            if (probableLCM % num1 == 0 && probableLCM % num2 == 0) {
              break;
            }
            increment++;
            probableLCM = lcm * increment;
            System.out.println("Probable is " + probableLCM);
        }

        System.out.println(Math.rint(10.6));
        return probableLCM;
    }

}
