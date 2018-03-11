import java.util.*; // Import java utilities 
/*
 * Author: Kevin George Rusty
 * Professor: Eileen Lichtenthal
 * Class: CP 500 02[3995] Introduction to Computer Programming
 * Text: Building Java Programs: A Back to Basics Approach. 4th Edition
 * Date Started
*/

public class FightSong  // App name
{ 
	public static void main(String[] args)  // start of main class
    {
        printFightSong();

	} // END main
    
    /*
     * This is where we create the actual fight song methods.
     */

    public static void printFightSong() 
    {
        printChant();
        System.out.println();
        printLoop();
        System.out.println();
        printLoop();
        System.out.println();
        printChant();

    } // END printFightSong 
    
    public static void printLoop()
    {
        printChant();
        printHook();
        printChant();

    } // END printLoop

    public static void printChant() 
    {
        System.out.println("Go, team, go!\nYou can do it.");

    } // END printChant

    public static void printHook() 
    {
        System.out.println("You\'re the best,\nIn the West.");

    } // END printChant

}

/*
 * email: tingansob@gmail.com
 * kevin.rusty33@students.kingsborough.cuny.edu
*/
