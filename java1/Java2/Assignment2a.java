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
public class Assignment2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/* VARIABLE DECLARATIONS  */ // CONSTANTS
        final int FTHOURS=40;
        final double PAYRATE=18.28;
        final double SS=.06;
        final double FED=.13;
        final double LOC=.05;
        final double UNION=11;
        final double INS=35;


        double otRate=PAYRATE+(PAYRATE/2), ftPay;
        boolean ot=false, dep=false;
        String name=hello(in);
        int hrsWorked=workWeek(in);
        int dependents=numDepend(in);


/* evaluate FT hours & Overtime */

        if (hrsWorked<=FTHOURS) {
            ftPay = hrsWorked*PAYRATE; 
        } else { 
            ot=true;
            int otHours=hrsWorked-FTHOURS;
            double otPay=otHours*otRate;
            ftPay = FTHOURS*PAYRATE;
        }

        // check for 2 or more dependents 
        if (dependents>=2) { dep=true; }


/* output */

        System.out.println("Thank You. Here is "+name+"'s paycheck");

        payCheck(name,hrsWorked,ot,dep,PAYRATE,SS,FED,LOC,UNION,INS);
        //payCheck(name,hrsWorked,ot,dep,ftPay,otPay,PAYRATE,SS,FED,LOC,UNION,INS);
        System.out.println();
    } // END main
    


    public static void payCheck(String name,int hrsWorked, boolean ot, boolean dep, double PAYRATE, double SS, double FED, double LOC, double UNION, double INS ) {
        System.out.println(name);
        System.out.println(hrsWorked);
        if (ot) {System.out.println("You worked Overtime this pay cycle");}
        if (dep) {System.out.println("You have 2 or more dependents");}

    }

    public static String hello (Scanner in) {
        System.out.print("Please enter the employees name: ");
        return in.nextLine();
    }


    public static int workWeek(Scanner in) {

        int hrsWorked=0;
        do { 
            System.out.print("How many hours did they work this week? \nBetween 1 - 168"); 
            hrsWorked = in.nextInt();
        } while (hrsWorked>=0&&hrsWorked>168);
        return hrsWorked;

    } 
    
    public static int numDepend(Scanner in) {
        System.out.print("How many dependents are you claiming? ");
        return in.nextInt();

    } 


} // 

