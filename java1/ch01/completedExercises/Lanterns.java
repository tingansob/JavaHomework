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

public class Lanterns   // Application name
{ 
    public static void main(String[] args) // Beginning of main
    {
        printLid();
        System.out.println();
        printTableLantern();
        System.out.println();
        printRoundLantern();

	} // END main

    public static void printTableLantern()
    {
        printLid();
        printOpenings();
        printLong();
        printLid();

    } // END printTableLantern

    public static void printRoundLantern()
    {
        printLid();
        printShort();
        printOpenings();
        printOpenings();
        printShort();
        printShort();

    } // END printRoundLantern

    public static void printLid()
    {
        printShort();
        printMed();
        printLong();

    } // END printLid

    public static void printShort()
    {
        System.out.println("    *****    ");

    } // END printShort

    public static void printMed()
    {
        System.out.println("  *********  ");

    } // END printMed

    public static void printLong()
    {
        System.out.println("*************");

    } // END printLong

    public static void printOpenings()
    {
        System.out.println("* | | | | | *");

    } // END printOpenings


} // End of ap



/*
 * email: tingansob@gmail.com
 * kevin.rusty33@students.kingsborough.cuny.edu
*/
