import java.util.*; // Import java utilities 

/*
 * Author:      Kevin George Rusty
 * Professor:   Eileen Lichtenthal
 * Class:       Introduction to Computer Programming - CP 500 02[3995]
 * Textbook:    Building Java Programs: A Back to Basics Approach. 4th Edition
 * Date::       Sun Oct 22 09:10:03 
 * 
 * Assignment:  
 *
*/

public class StarFigures   // Application name
{ 
    public static void main(String[] args) // Beginning of main
    {
        hangX();
        System.out.println();
        hangX();
        printBar();
        System.out.println();
        xCore3();
        hangX();

	} // END main

//   print blocks of graphics at one time

    public static void hangX()
    {
        printBar();
        printX();
    } // END hangX

    public static void printX()
    {
        xEdge();
        xCore();
        xEdge();

    } // END printX

//  printing individual components of above methods

    public static void printBar()
    {
        System.out.println("*****\n*****");

    } // END printBar

    public static void xEdge()
    {
        System.out.println(" * * ");

    } // END xEdge

    public static void xCore()
    {
        System.out.println("  *  ");
    
    } // END xCore

    public static void xCore3()
    {
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    } // END xCore3

} // End of ap

/*
 * email: tingansob@gmail.com
 * kevin.rusty33@students.kingsborough.cuny.edu
*/
