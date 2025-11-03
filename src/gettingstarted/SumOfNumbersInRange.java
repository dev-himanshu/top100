package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Find the Sum of the Numbers in a Given Range in Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * Given two integer inputs number1 and number2, the objective is
 * to find the sum of all Number that lay in the given interval by
 * writing a code to Find the Sum of the Numbers in a Given Range in Java Language.
 *
 * EXAMPLES:
 * Input : Number1 = 12 , Number2 = 15
 * Output : 54
 *
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (for loop)
 * Approach-2: Using Recursion.
 * Approach-3: Using Formula for the Sum of Nth Term.
 * ------------------------------------------------------------
 */
public class SumOfNumbersInRange {
    public static void main(String[] args) {
        // Take Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        // Approach-1 function call.
        usingForLoop(firstNumber, secondNumber);

        // Approach-2 function call.
        int result = usingRecursion(0, firstNumber, secondNumber);
        System.out.println("The sum of the given range is " + result);

        // Approach-3 function call.
        usingFormula(firstNumber, secondNumber);
    }

    // Approach-1: Using Brute Force. (for loop)
    static void usingForLoop(int firstNumber, int secondNumber) {
        if ((firstNumber > secondNumber) || (secondNumber == 0)) {
            System.out.println("Invalid Range.");
            return;
        }

        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.println("The sum of the given range is " + sum);
    }

    // Approach-2: Using Recursion.
    static int usingRecursion(int sum, int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return sum;
        }
        return firstNumber + usingRecursion(sum, firstNumber + 1, secondNumber);
    }

    // Approach-3: Using Formula for the Sum of Nth Term.
    static void usingFormula(int firstNumber, int secondNumber) {
        if ((firstNumber > secondNumber) || (secondNumber == 0)) {
            System.out.println("Invalid Range.");
            return;
        }

        int sum = firstNumber + (secondNumber * (secondNumber + 1) / 2) - (firstNumber * (firstNumber + 1) / 2);
        System.out.println("The sum of the given range is " + sum);
    }
}
