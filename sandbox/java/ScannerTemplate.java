/*
 * Author:      Kevin George Rusty
 * Professor:   Eileen Lichtenthal
 * Class:       CP 500 02[3995] Introduction to Computer Programming
 * Textbook:    Building Java Programs: A Back to Basics Approach. 4th Edition
 * Date::       Sun Oct 22 09:10:03 
*/


import java.util.*; // Import java utilities 
public class ScannerTemplate  // Application name
{ 
    public static void main(String[] args) // Beginning of main
    {
        getName();
        message();

	} // End of main

    public static void message()
    {
        System.out.println("Welcome Home!\n");

    }

    public static void getName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nWhat is your name? ");
        String name = scan.nextLine();
        System.out.println("\nNice to meet you " + name + "");
    } // End of getName static method

} // End of app

/*
 * email: tingansob@gmail.com
 * kevin.rusty33@students.kingsborough.cuny.edu
*/
