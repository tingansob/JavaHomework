/*
 * Author:      Kevin George Rusty
 * Professor:   Eileen Lichtenthal
 * Class:       CP 500 02[3995] Introduction to Computer Programming
 * Textbook:    Building Java Programs: A Back to Basics Approach. 4th Edition
 * Date::       Sun Oct 22 09:10:03 
 


 setup scanner in main class
 ask user for 5 integers
 store values as doubles
 pass values of user input to functions for
  - calculation of mean
  - product of paren^2
  - sum of previous
  - division of that sum by 5
  - square root of divisor stored as double
  display example of problem
presentation of standard deviation
*/


import java.util.*;
public class ClassProject2
{ 
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        double a, b, c, d, e, mean, prod, sqr, sum, radic, solu;
        instructions();
        a=userInput(in);
        b=userInput(in);
        c=userInput(in);
        d=userInput(in);
        e=userInput(in);
        mean=average(a, b, c, d, e);
        space();
        System.out.println("The average of those 5 numbers is "+mean);

//        sum=numerator(a, b, c, d, e, mean);
	}

    /*
    public static double numerator(double a, double b, double c, double d, double e, double m)
    {
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+m);
    }
    */


    public static double average(double a, double b, double c, double d, double e)
    {
        return (a+b+c+d+e)/5;
    }
    public static double userInput(Scanner in)
    {
        double value;
        System.out.print("Please enter a value: ");
        value=in.nextDouble();
        return value;

    }

    public static void instructions()
    {
        space();
        System.out.println("Welcome to Project two!");
        System.out.println("Let's find the mean and the standard deviation:\n");
        System.out.println(" - You will be asked to enter 5 values.");
        System.out.println(" - Please enter each value followed by <ENTER>.\n");
    }

    public static void space()
    {
        System.out.println();
    }
} // ClassProject2      _EOF_
