package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Find the Greatest of the Three Numbers in Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * Given three integer inputs N1, N2 and N3, the objective is to write a
 * code to Find the Greatest of the Three Numbers in Java.
 * In order to do so we’ll check the numbers with each other and print the
 * larget of them all.
 *
 * EXAMPLES:
 * Input : num1 = 12 num2 = 9 num3 = 14
 * Output : 14
 *
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (if-else)
 * Approach-2: Using Ternary Operator.
 * ------------------------------------------------------------
 */
public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();

        // Approach-1 function call
        usingIfElse(num1, num2, num3);

        // Approach-2 function call
        usingTernaryOperator(num1, num2, num3);
    }

    // Approach-1: Using Brute Force. (if-else)
    static void usingIfElse(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " is the greatest number.");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }
    }

    // Approach-2: Using Ternary Operator.
    static void usingTernaryOperator(int num1, int num2, int num3) {
        int temp = 0;
        temp = (num1 > num2) ? num1 : num2;
        temp = (temp > num3) ? temp : num3;
        // NOTE: We can use Math.max() method too for comparing two numbers.
        System.out.println(temp + " is the greatest number.");
    }
}
