package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Check Whether a Given Number is Prime or Not in Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * Prime Number Program in Java  Given an integer input greater than 0,
 * the objective is to check whether the number is a prime.
 * To do so, we’ll write a code to check whether a given number is prime
 * or not in Java that checks for the factors of the number besides 1 and
 * the number itself.
 *
 * EXAMPLES:
 * Input  : num = 11
 * Output : Prime
 *
 * Input  : num = 625
 * Output : Not Prime
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (Iteration Method)
 * Approach-2: Using n/2 Iteration.
 * Approach-3: Using Square Root of N Iteration.
 * ------------------------------------------------------------
 */
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Approach-1 function call
        usingIteration(number);

        // Approach-2 function call
        usingHalfIteration(number);

        // Approach-3 function call
        usingSquareRootOfNIteration(number);
    }

    // Approach-1: Using Brute Force. (Iteration Method)
    static void usingIteration(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else if (number <= 3) {
            System.out.println("Prime");
        } else {
            int flag = 0;
            for (int i = 2 ; i < number ; i++) {
                if (number % i == 0) {
                    flag += 1;
                    break;
                }
            }
            if (flag > 0) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }

    /* Approach-2: Using number/2 Iteration.
     *  Because a number cannot be divided by any number greater than it's half.
     *  Example: 36 -> 36/2 = 18 is the half.
     *  Now 36 cannot divide by 19 and any higher number. If you try there will always reminder.
     */
    static void usingHalfIteration(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else if (number <= 3) {
            System.out.println("Prime");
        } else {
            int flag = 0;
            for (int i = 2 ; i < number/2 ; i++) {
                if (number % i == 0) {
                    flag += 1;
                    break;
                }
            }
            if (flag > 0) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }

    /* Approach-3: Using Square Root of number Iteration.
     *  In maths, all the factor of the number lay in the interval[2, sqrt(number)].
     *  Example: number = 625 and it's square root is 25.
     *  Now, any number more than 25 cannot divide 625.
     */
    static void usingSquareRootOfNIteration(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else if (number <= 3) {
            System.out.println("Prime");
        } else {
            int flag = 0;
            for (int i = 2 ; i < Math.sqrt(number) ; i++) {
                if (number % i == 0) {
                    flag += 1;
                    break;
                }
            }
            if (flag > 0) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}
