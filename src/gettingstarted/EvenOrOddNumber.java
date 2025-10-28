package gettingstarted;

import java.util.Scanner;

/*
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
 * Method-1: Using Brute Force. (modulo operator)
 * Method-2: Using ternary operator.
 * Method-3: Using bitwise operator.
 * ------------------------------------------------------------
 */
public class EvenOrOddNumber {
    public static void main(String[] args) {
        // Take Input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Method-1 call
        usingModulo(number);

        // Method-2 call
        usingTernary(number);

        // Method-3 call
        usingBitwise(number);
    }

    // Solution using Method-1
    public static void usingModulo(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }
    }

    // Solution using Method-2
    public static void usingTernary(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }

    // Solution using Method-3
    public static void usingBitwise(int number) {
        if ((number & 1) == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }
    }
}
