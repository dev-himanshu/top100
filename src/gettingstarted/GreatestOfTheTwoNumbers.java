package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Find the Greatest of the Two Numbers in Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * Given two integer inputs N1 and N2, the objective is to write a
 * code to Find the Greatest of the Two Numbers in Java.
 * In order to do so we’ll compare the numbers using if-else statements.
 *
 * EXAMPLES:
 * Input : Number1 = 3 , Number2 = 12
 * Output : 12
 *
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (if-else)
 * Approach-2: Using Ternary Operator.
 * Approach-3: Using Built-in max Function.
 * ------------------------------------------------------------
 */
public class GreatestOfTheTwoNumbers {
    public static void main(String[] args) {
        // Take Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        // Approach-1 function call
        usingIfElse(firstNumber, secondNumber);

        // Approach-2 function call
        usingTernary(firstNumber, secondNumber);

        // Approach-3 function call
        usingMaxFunction(firstNumber, secondNumber);
    }

    // Approach-1: Using Brute Force. (if-else)
    static void usingIfElse(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is the greatest number.");
        } else if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " is the greatest number.");
        } else {
            System.out.println("Both are equal.");
        }
    }

    // Approach-2: Using Ternary Operator.
    static void usingTernary(int firstNumber, int secondNumber) {
        int result = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        System.out.println(result + " is the greatest number.");
    }

    // Approach-3: Using Built-in max Function.
    static void usingMaxFunction(int firstNumber, int secondNumber) {
        int result = Math.max(firstNumber, secondNumber);
        System.out.println(result + " is the greatest number.");
    }
}
