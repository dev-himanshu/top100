package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Find the Sum of First N Natural Numbers in Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * Given an integer input of N, the objective is to find the sum of
 * all the natural numbers until the given input integer.
 *
 * EXAMPLES:
 * Input : num = 5
 * Output : 15
 *
 * EXPLANATION:
 * First 5 numbers are: 1,2,3,4,5
 * Sum of these 5 numbers = 1 + 2 + 3 + 4 + 5 = 15
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (for loop)
 * Approach-2: Using Recursion.
 * Approach-3: Using Formula for the Sum of Nth Term.
 * ------------------------------------------------------------
 */
public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        // Take Input
        System.out.print("Please a natural number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Approach-1 function call
        usingForLoop(number);

        // Approach-2 function call
        System.out.println("The sum of the natural numbers using recursion is " + usingRecursion(number));

        // Approach-3 function call
        usingFormula(number);
    }

    // Approach-1: Using Brute Force. (for loop)
    static void usingForLoop(int number) {
        int sumOfFirstNaturalNumbers = 0;
        for (int i = 1; i <= number; i++) {
            sumOfFirstNaturalNumbers += i;
        }
        System.out.println("The sum of the natural numbers using for-loop is " + sumOfFirstNaturalNumbers);
    }

    // Approach-2: Using Recursion.
    static int usingRecursion(int number) {
        if (number == 0) {
            return number;
        }
        return number + usingRecursion(number-1);
    }

    // Approach-3: Using Formula for the Sum of Nth Term.
    static void usingFormula(int number) {
        int sumOfFirstNaturalNumbers = number * ((number + 1) / 2);
        System.out.println("The sum of the natural numbers using formula is " + sumOfFirstNaturalNumbers);
    }
}
