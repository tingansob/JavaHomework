import java.util.*;
/*
 * PythonGifts information
 *
 * Author       Kevin George Rusty
 * Purpose      To learn to program and have a good time doing so
 * Road Map     Learn Chapter 2 in the book
 * Reason       I need to become competent in this area to progress
 * Small Win    I'll be able to finish the exercises in the chapter
 * Date         Sun Nov  5 02:51:43 EST 2017
 *
 * 
 * Why did I call this PythonGifts?
 *
 *  So I decided that I'd try to learn some other languages also.
 * One of the languages I'm teaching myself while I'm in school Is python.
 * I understand it's awesome if you're a sys admin - my destination.
 *
 * While learning about python I picked up some tricks (okay, not really tricks),
 * but I was reminded of what could be possible when programming, such as using the
 * +=, /=, %=, etc.
 *
 */

public class PythonsGifts {
/*
 * variables 
 */
    public static final int WIDTH = 3;
    public static final int HEIGHT = WIDTH/2;
// end constants 
/*
 * MAIN 
 */
    public static void main(String[] args) 
    {
//        greeting();
        tableOfContents();
        System.out.println();
        looping();
    } // END MAIN

/*
 * METHODS
 */
/*
 * loopIncrement
 * I want to have this loop increment on one half and decrement on the other
 */
    public static void looping()
    {
        int i, j, k, m, width=19;

        for (i = 1; i <= width; i++) {
            System.out.print("|");
            for (j = i; j < width; j++) {
                System.out.print("~"); }
            for (k = 1; k < (i *2); k++) {
                System.out.print("^"); }
            for (m = width; m >= i; m--) {
                System.out.print("~"); }
            /*
            for (j = i; j > width; j--) {
                System.out.print("~"); }
            for (k = 1; k > (i * 2); k--)
            */
            System.out.println("|");
        }
    } // END looping


/*
 * greeting
 */
    public static void greeting() 
    {
        System.out.println("Hello"); // include method to get name
        System.out.println();
    } // END greeting ----------------------------------
/*
 * tableOfContents
 */
    public static void tableOfContents() 
    {
        for (int header = 1; header <= 2; header++) 
        {
            System.out.print("+");
            for (int toc = 1; toc <= 32; toc++) 
            {
                System.out.print("-");
            }
            System.out.println("+");
            for (int toc = header; toc <= 1; toc+=2 ) 
            {
                System.out.println("\tTable Of Contents");
            }
        }
    } // END tableOfContents -----------------------------------------

} // END PythonGifts
