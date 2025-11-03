package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Check if a Given Number is Positive or Negative in Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * The number is demonstrated as positive or negative by comparing
 * the entered number with Zero (0).
 *
 * If the number entered by the user is greater than zero,
 * then the number is Positive.
 * Else if the number is less than zero,
 * then the number is Negative.
 * Else, the number is Zero.
 *
 * CONDITIONS:
 * N > 0  →  Positive
 * N < 0  →  Negative
 * N = 0  →  Zero
 *
 * EXAMPLES:
 * Input  : num = 11
 * Output : Positive
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (if-else)
 * Approach-2: Using ternary operator.
 * ------------------------------------------------------------
 */
public class PositiveOrNegativeNumber {

    public static void main(String[] args) {
        // Take Input
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Approach-1 function call
        usingIfElse(number);

        // Approach-2 function call
        usingTernary(number);
    }

    // Approach-1: Using Brute Force. (if-else)
    static void usingIfElse(int number) {
        if  (number == 0) {
            System.out.println("Zero");
        } else if (number < 0) {
            System.out.println("Negative");
        } else  {
            System.out.println("Positive");
        }
    }

    // Approach-2: Using ternary operator.
    static void usingTernary(int number) {
        String result = (number == 0) ? "Zero" : ( (number < 0) ? "Negative" : "Positive");
        System.out.println(result);
    }
}
