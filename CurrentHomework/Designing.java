import java.util.*;
/*
        Designing - information & briefing
 
    Information
-----------------------------------------------------------------
Author:             Kevin George Rusty
Date:               Sun Nov  5 09:21:50 EST 2017
Email:              tingansob@gmail.com
Class:              Intro to Programming @ Kingsboroug CC
Professor:          Eileen Lichtenstein
Text:               Intro To Java Programming by AUTHOR
-----------------------------------------------------------------


Briefing
-----------------------------------------------------------------
 * Situation:       You can use java to print out patterns on the screen
 *                  using the 'for' control structure.
 *
 * Purpose:         My purpose is to be a fantastic programmer
 *                  and have a good time doing so.
 *
 * Road Map:        Now     - Create various for loop constructs to explore
 *                          - 
 *                  
 *                  Then    - What comes next
 *                          -
 *
 *                  Later   - What comes later
 *                          - 
 *
 *                  Maybe   - Might or might not do
 *                          -
 *
 * Goals            Create pretty pictures with for loops
 *
 * General Goals:   I should be able to write for loops without much struggle
 *                  this shouldn't be difficult to do, nested for loops
 *
 * Project Goals:   In the end I should have a pretty set of patterns that
 *                  demonstrate my knowledge and use of for loops as well as
 *                  string literals. I should be able to use complex nested
 *                  loop structures to print designs with multiple unicode
 *                  characters on each line - aka: ascii art
 *                  I am limited to what we have learned in class so far
 *                  ** include what topics we've discussed here
 *
 * Scope:           I have am using VIM on an Ubuntu 17.04 system.
 *                  ** use :r! to scan in sys specs
 *                  I have until ____ days to complete the project
 *                  I am using ___ textbook
 *
 * Success Criteria:    I can create a method to print a complex shape
 *                          - using only for, print, & println 
 *                          - the shape is dynamic using CONSTANT variables
 *                          - the shape has multiple parts that are interchangeable
 *                              and create new contiguous shapes.
 *                          - I complete the examples in the book
 *                      I properly document my code
 *                      I meet the deadline
 *                      I take a walk on the beach
 */
public class Designing 
{
/*
 * VARIABLES
 */
    public static final String NAME = "George";
    public static final int SUB_HEIGHT = 8;
    public static final int BOX_WIDTH = SUB_HEIGHT*2;
    public static final int HEIGHT = BOX_WIDTH/2-1;
    public static final int PYRAMID = SUB_HEIGHT+1;
    public static final int TEST = 10;
// END CLASS VARIABLES  
/*
 * MAIN
 */
    public static void main(String[] args) 
    {
        greeting();
        printBoxes();
        hourglass();
        shadowPyramid();
        printPyramid();
        printBottom();
    }// END MAIN
/*
 * METHODS
 */
/*
 * shadowPyramid()
 */
    public static void shadowPyramid() 
    {
        // local varaibles
        int i, j, k, width = 8;

        for (i = 1; i <= SUB_HEIGHT; i++ ) {
            System.out.print("|");
            for (j = i; j <= SUB_HEIGHT; j++) {
                System.out.print("-"); }
            for (k = 1; k < (i * 2); k++) {
                System.out.print("*"); }
            for (j = SUB_HEIGHT; j >= i; j--) {
                System.out.print("-"); }
        //  System.out.println();
            System.out.println("|");
        }
    } // END shadowPyramid
/*
 * printPyramid
 */
    public static void printPyramid()
    {
        for (int i = 1; i <= PYRAMID; i++)
        {
            for (int j = i; j < PYRAMID; j++)
                System.out.print(" ");
            for (int k = 1; k < (i * 2); k++)
                System.out.print("*");
            System.out.println();
        }
    }
// END printPyramid
/*
 * greeting
 */
    public static void greeting()
    {
        System.out.println("Welcome "+NAME+"\n");
    }
/*
 * hourglass
 */
    // assemble hourglass
    public static void hourglass() {
        printLine();
        printTop();
        printBottom();
        printLine();
    }
    // hourglass edges 
    public static void printLine() {
        System.out.print("+");
        for (int i = 1; i <= ( 2 * SUB_HEIGHT ); i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
    // top half hourglass
    public static void printTop() {
        for (int line = 1; line <= SUB_HEIGHT; line++ ) {
            System.out.print("|");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            int dots = 2 * SUB_HEIGHT - 2 * line;
            for (int i = 1; i <= dots; i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    // bttom half hourglass
    public static void printBottom() 
    {
        for (int line = 1; line <= SUB_HEIGHT; line++) 
        {
            System.out.print("|");
            for (int i = 1; i <= (SUB_HEIGHT - line); i++) 
            {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++) 
            {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= (SUB_HEIGHT - line); i++) 
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
// END hourglass
/*
 * printBoxes
 */
    public static void printBoxes() {
        openBox();
        closeBox();
        }
        
    public static void openBox() {
        System.out.print("+");
        for (int i = 1; i <= BOX_WIDTH; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void closeBox() {
        for (int i = 1; i <= HEIGHT; i++) {
            System.out.print("|");
                for (int j = 1; j <= BOX_WIDTH; j++) {
                    System.out.print(" ");
            }
            System.out.println("|");
        }
        openBox();
    }
// END printBoxes
// END METHODS
}// END Designing
