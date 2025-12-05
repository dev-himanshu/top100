package gettingstarted;

import java.util.Scanner;

/*
 * ------------------------------------------------------------
 * TITLE: Check Whether or Not the Year is a Leap Year in Java.
 * ------------------------------------------------------------
 * PROBLEM STATEMENT:
 * Given an integer input “year” the objective is to check if the
 * given year is a leap year or not using the conditions for a leap year.
 *
 * EXAMPLES:
 * Input  : year = 2012
 * Output : 2012 is a Leap Year
 *
 * Input  : year = 2019
 * Output : 2019 is not a Leap Year
 * ------------------------------------------------------------
 * SOLUTIONS:
 * Approach-1: Using Brute Force. (if-else)
 * ------------------------------------------------------------
 */
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Approach-1 function call
        usingIfElse(year);
    }

    // Approach-1: Using Brute Force. (if-else)
    static void usingIfElse(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
