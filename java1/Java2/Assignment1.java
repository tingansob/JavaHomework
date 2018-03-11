/*  Kevin George Rusty

Problem
An employee is paid at a rate of $18.28 per hour for the first 40 hours worked in a week.  
Any hours over that are paid at the overtime rate of one and a half times that.  
From the worker's gross pay, 
    6% is withheld for social security tax, 
    13% is withheld for federal income tax, 
    5% is withheld for state income tax, and 
   $11 per week is withheld for union dues.  
   
   If the worker has 
        two or more dependents, then an additional 
        $35 is withheld each week to cover the extra cost of health insurance beyond what the employer pays.
        
Objective
Write a program that 
    stores the number of hours worked in a week and 
    the number of dependants and then will 
    
    output the worker's gross pay, 
    each withholding amount, and the 
    net take-home pay for the week.

Remember: 
    Use variables or named constants to store all numbers so that they can be changed later on if necessary.  
    Do not repeat calculations unnecessarily!  
    Test your program with different values for the variables to make sure it works in all scenarios!

*/
import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        // variables
        String empl="Rusty Lee";

        int dependents=3;

        double rate=18.28,
               tHrs=48.50,
               otRate=rate+(rate/2),
               GROSS=grossPay(tHrs,rate,otRate),
               // witholdings
               SS=GROSS*.06, FED=GROSS*.13, LOC=GROSS*.05, UNION=11.00, xIns=35.00,
               NET=netPay(GROSS,SS,FED,LOC,dependents,UNION,xIns);


        // Employee Info
        space(2);
        System.out.println("Employee: "+empl);
        System.out.println("Total hours worked this week: "+tHrs);
        System.out.println("Total number of dependents: "+dependents);
        
        //rates
        space();
        System.out.printf("Full Time Rate $%.2f/hr\n",rate);
        if (tHrs>40){
            System.out.printf("*Over Time Rate $%.2f/hr\n",otRate);
        } space();
        System.out.printf("%26s  $%7.2f\n","Total Gross Pay",GROSS);
        //witholdings
        spacer();
        System.out.printf("%26s -$%7.2f\n","Social Security Insurance",SS);
        System.out.printf("%26s -$%7.2f\n","Federal Tax",FED);
        System.out.printf("%26s -$%7.2f\n","Local Tax",LOC);
        System.out.printf("%26s -$%7.2f\n","Union Dues",UNION);
        /* only print supplamental insurance information if the user has more than 2 dependents*/
        if (dependents<2) {
            spacer();
            System.out.printf("%26s -$%7.2f\n","Total Deductions ",(SS+FED+LOC+UNION));
        } else {
            System.out.printf("%26s -$%7.2f\n","Supplamental Insurance",xIns);
            spacer();
            System.out.printf("%26s -$%7.2f\n","Total Deductions ",(SS+FED+LOC+UNION+xIns));
        }


        spacerTally();


        System.out.printf("%26s  $%7.2f\n","Total Net Pay:",NET);

        space(3);
    } // END main

    public static double grossPay(double hrs, double rate, double otRate) {
        double grossPay;
        if (hrs<=40) {
            grossPay=hrs*rate;
        } else {
            grossPay=(rate*40)+((hrs-40)*otRate);
        }
        return grossPay;
    } // END grossPay

    public static double netPay(double gross, double ss, double fed,double loc,int depend,double union,double  ins) {
        double netPay, base;
        base = gross-ss-fed-loc-union;
        if (depend >=2) {
            netPay=base-ins;
        } else {
            netPay=base;
        }

        return netPay;
    } //END netPay
    

    public static void space() {
        System.out.println();
    }

    public static void space(int a) {
        for (int i=1;i<=a;i++)
            System.out.println();
    }

    public static void spacer() {
        for (int i=0;i<=40;i++) {
            System.out.print("-");
        }space();
    }

    public static void spacerTally() {
        for (int i=0;i<=40;i++) {
            System.out.print("=");
        }space();
    }
}// END Assignment1 _EOF_
