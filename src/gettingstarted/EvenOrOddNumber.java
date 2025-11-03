package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Check Whether a number is Even or Odd using Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd.
 * To do so the main idea is to divide the number by 2 and check if it’s divisible or not.
 *
 * It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise.
 *
 * EXAMPLES:
 * Input  : num = 11
 * Output : Odd
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (modulo operator)
 * Approach-2: Using ternary operator.
 * Approach-3: Using bitwise operator.
 * ------------------------------------------------------------
 */
public class EvenOrOddNumber {
    public static void main(String[] args) {
        // Take Input
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Approach-1 function call
        usingModulo(number);

        // Approach-2 function call
        usingTernary(number);

        // Approach-3 function call
        usingBitwise(number);
    }

    // Approach-1: Using Brute Force. (modulo operator)
    public static void usingModulo(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }
    }

    // Approach-2: Using ternary operator.
    public static void usingTernary(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }

    // Approach-3: Using bitwise operator.
    public static void usingBitwise(int number) {
        if ((number & 1) == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }
    }
}
