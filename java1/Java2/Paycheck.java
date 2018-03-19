/*
 * Kevin George Rusty
 * Due March 18, 2018
 *
 * An employee is paid at a rate of $18.28 per hour
 * for the first 40 hours worked in a
 * week.  Any
 *
 * w
 * hours over that are paid at the
 * overtime rate of
 * one and a half times that.
 *
 * From the worker's gross pay,
 * 6% is withheld for social security tax,
 * 13% is withheld for federal income tax,
 * 5% is withheld for state income tax, and
 * $11 per week is withheld for union dues.
 *
 * If the
 *      worker has two or more dependents,
 *  then an additional
 *  $35 is withheld
 *  each week to cover the extra cost of health insurance beyond what the employer pays.

Remember:
    - Use variables or named constants to store all numbers so that they can be changed later on if necessary.
    - Do not repeat calculations unnecessarily!
    - Test your program with different values for the variables to make sure it works in all scenarios!

Write a program that
    1 - stores the number of hours worked in a week and
    2 - the number of dependants and then
    3 - will output the worker's
            - gross pay,
            - each withholding amount, and the
            - net take-home pay for the week.

Ask the user for
    the number of hours worked in a week and
    the number of dependents as input, and

    then print out the same information as in Part 1.
    Perform input validation to make sure the numbers entered by the user are reasonable (non-negative, not unusually large, etc).
    Let the calculations repeat for several employees until the user wishes to quit the program.
 *
 *
 */


import java.util.*;
public class Paycheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean calculate=false;
        do {
            calculate=calculateAgain(in);

            } while (!calculate);
    }//END main

            /*
             *
    public static boolean again(Scanner in){
            System.out.print("Would you like to continue? (Y/n) ");
            String moveOn=in.nextLine();
            if (moveOn=="y"||moveOn=="Y") {
                System.out.println("Hello World");
                return true;
            } else if (moveOn!="Y"||moveOn!="y"||moveOn!="N"||moveOn!="n"){
                System.out.println("That is invalid, try again.");
                return true;
            } else if (moveOn=="n"||moveOn=="N")
                return false;
            

                return false;

            }
                */
    public static boolean calculateAgain (Scanner in){
            System.out.print("Would you like to continue? (Y/n) ");
            String moveOn=in.nextLine();
            return true;

    }
}//END class
