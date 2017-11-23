/*
  ClassProject2:        Calculate the Mean & Standard Deviation for 5 user defined #s
  Author:               Kevin George Rusty
  Promessor:            Eileen Lichtenthal
  Class:                CP 500 02[3995] Introduction to Computer Programming
  Textbook:             Building Java Programs: A Back to Basics Approach. 4th Edition
  Completion Date:      November 23, 2017
*/
import java.util.*;
public class Mean_StandardDeviation {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);                  // Scanner in
        double a, b, c, d, e, mean, num, radi, dev;         
        int count;
        instructions();

        // userInput 
        a=userInput(in, 1);
        b=userInput(in, 2);
        c=userInput(in, 3);
        d=userInput(in, 4);
        e=userInput(in, 5);


        // calculations
        mean=average(a, b, c, d, e);               // Calculate average of all 5 #
        num=numerator(a, b, c, d, e, mean);        // the sum of the totals of ((a to e)-m)^2
        radi=radicand(num);                        // numerator / 5
        dev=deviation(radi);                       // find the square of the radicand
        solution(a, b, c, d, e, mean, dev);        // display the solution
    } // enf of main

/*  Methods   */
    public static double deviation(double radicand) {    // find sqrt of radicand 
        return Math.sqrt(radicand);                      // return double dev
    }                                                    // dev = standard devitation

    public static double radicand(double numerator) {    // find radicand as quotient 
        return numerator/5;                              // of (numerator /5)
    }                                                    // return double radicand

    public static double numerator(double a, double b, double c, double d, double e,double m) {             // find numerator of radicand as sum of (([a-e]-m)^2)
        return Math.pow((a-m),2)+Math.pow((b-m),2)+Math.pow((c-m),2)+Math.pow((d-m),2)+Math.pow((e-m),2);   // return double numerator
    }
     
    public static double average(double a, double b, double c, double d, double e)  {           // find average of 5 user defined numbers.
        return (a+b+c+d+e)/5;                                                                   // return double average
    }

    public static double userInput(Scanner in, int count) {
        double value;
        System.out.print("Enter number "+count+" => ");
        value=in.nextDouble();
        return value;
    }

    public static void solution(double a, double b, double c, double d, double e, double mean, double dev) {
        space();
        System.out.println("\t   The average of   ("+a+"+"+b+"+"+c+"+"+d+"+"+e+")/5   = "+mean);
        System.out.println("The standard deviation of  "+a+", "+b+", "+c+", "+d+" and "+e+" = "+dev);
        space();
    }

    public static void instructions() {
        space();
        System.out.println("Welcome to Project two!");
        System.out.println("Let's find the mean and the standard deviation:\n");
        System.out.println(" - You will be asked to enter 5 values.");
        System.out.println(" - Please enter each value followed by <ENTER>.\n");
    }

    public static void space() {
        System.out.println();
    }
} // ClassProject2      _EOF_
