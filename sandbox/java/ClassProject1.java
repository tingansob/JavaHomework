/* Java Programming Class Project 1

    Author:                 Kevin George Rusty
    Date Completed:         Sat Nov 18, 2017

 */
import java.util.*;
/* variables

 You can change any of these constants and they'll change the drawings accordingly.
 thought I usually use ALL_CAPS and snake case for my constant variables I put a lower case indicator to identify the individual drawings dimensions.
 */
public class ClassProject1
{
    public static final int rHEIGHT = 5, rWIDTH = 4; // rectangle dimensions
    public static final int hHEIGHT = 2, hWIDTH = 6; // honeycomb dimensions
    public static final int tHEIGHT = 3, tWIDTH = 6; // overall tiles dimension
    public static final int FULL_HEIGHT = 5, FULL_WIDTH = 4; // full size tile dimensions

    /* MAIN

     I've put the various parts together here to create the output as described. 
     There isn't anything in main that isn't a method.
     
     -heading - Just a simple introduction in case this was being printed.

     */
    public static void main(String[] args)
    {
        heading();
        space();
        rectangle();
        space();
        honeycomb();
        space();
        tiles();
        space();
    }
    
    /* rectangle
    previously discussed this with the professor. I had to break this down into parts because the odd row at the bottom of the drawing wasn't making sense with what we've learned so far. I had to break the 3/2 down to 1 & 1/5 and put them back together to create the full wall as it appears in the example. */
    public static void rectangle()
    {
        System.out.println("Height of rectangle: "+rHEIGHT+"\nWidth of rectangle: "+rWIDTH);
        space();
        rectangleCaps();
        rectangleSides();
        rectangleCaps();

    }
    public static void rectangleCaps()                  // the top and bottom of the
    {                                                   // shape are broken down into segments
        System.out.print(" ");                          // ' ',  '.',  &  '+"+'
        for (int i=1; i<=rWIDTH; i++)                   // creating a pretty though challenging
        {                                               // section to code
            System.out.print(".");
                System.out.print("+\"+");
        }
                System.out.println(".");
    }
    public static void rectangleSides()
    {
        for (int i=1; i<=rHEIGHT; i++)
        {
            rectangleSideA();
            rectangleSideB();
        }
            rectangleSideA();
    }
    public static void rectangleSideA()
    {
            System.out.print("(");
            {
                for (int j=1; j<=rWIDTH*4+1; j++)
                {
                    System.out.print(" ");
                }
                System.out.println(")");
            }
    }
    public static void rectangleSideB()
    {
            System.out.print(" )");
            {
                for (int j=1; j<=rWIDTH*4-1; j++)
                {
                    System.out.print(" ");
                }
                System.out.println("(");
            }
    }

    /* honeycomb
    I found this to be the easiest of the three. perhaps because I did the first two one right after the other and my brain was primed because of the rectangle. 
     
    Unlike the rectangle I needed to write an actual for loop in the creation of the honeycomb to allow for the change in height, where the width is changed in the method that creates the individual rows.

    I didn't have to do this with the rectangle, the evolution of these two drawings prepared me for the next one.  */
    public static void honeycomb()
    {
        System.out.println("Height of honeycomb: "+ hHEIGHT+"\nWidth of honeycomb: "+hWIDTH);
        space();
        hEdge();
        for (int i=1; i<=hHEIGHT; i++)
        {
            hComb();
        }
    }
    public static void hEdge()
    {
        for (int i=1; i<=hWIDTH; i++)
        {
            System.out.print(" _  ");
        }
        System.out.println(" ");
    }
    public static void hComb()
    {
        for (int i=1; i<=hWIDTH; i++)
        {
            System.out.print("/ \\_");
        }
        space();
        for (int i=1; i<=hWIDTH; i++)
        {
            System.out.print("\\_/ ");
        }
        space();
    }
    /* tiles
    I realized while breaking this problem down that there were a vew distinct parts. Where the rectangle presented me with even number that produced an odd output requiring me to break the 3/2 portions down into 1 & 1/2 thus allowing for the inclusion of the first row at the end, here I had to sandwich full tile height and width between "end caps" so that there was a distinction. 
     
      seperating the tiles into the smallest coponents and then putthing them back together to create the flexible design that allows for both dynamics (h+w of tiles vs. full tiles) to scale within the design parameters. 
     
      Based on the original design, the top and bottom half tiles are simply the height of two, regardless of the size of the full tiles within. The beginning and ending tiles, however, are half of the tile width, this presents a unique problem with odd numbers where there will always be an even number of beginning and ending tiles as the remainder of /2 is removed leaving an even#.  */
    public static void tiles()                          // Create tiles from parts
    {                                                   // half tiles and full tiles
        System.out.println("Number of full tiles across: "+FULL_WIDTH+"\nNumber of full tiles down: "+FULL_HEIGHT+"\nWidth of tiles: "+tWIDTH+"\nHeight of tiles: "+tHEIGHT);
        space();
        for (int i=1; i<=2; i++)                        // looped together to create 
        {                                               // the flexible tile pattern
            tileFlats();
        }
        tileEdge();
        for (int i=1; i<=FULL_HEIGHT; i++)
        {
            tileLine();
            tileEdge();
            for (int j=1; j<=tHEIGHT-2; j++)
            {
                tileFlats();
            }
            tileEdge();
        }
        tileLine();
        tileEdge();
        for (int i=1; i<=2; i++)
        {
            tileFlats();
        }
    }
    public static void tileFlats()                      
    {                                                   // these are the vertical seperating
        System.out.print("|");                          // that seperate the tiles
        for (int i=1; i<=tWIDTH/2+1; i++)               // into half and whole
        {                                               // just the vertical lines though
            System.out.print(" ");
        }
        System.out.print("|");
        for (int i=1; i<=FULL_WIDTH; i++)
        {
            for (int j=1; j<=tWIDTH+2; j++)
            System.out.print(" ");
            System.out.print("|");
        }
        space();

    }
    public static void tileEdge()
    {
        System.out.print("|");
        for (int i=1; i<=tWIDTH/2+1; i++)
        {
            System.out.print(" ");
        }
        System.out.print("\\");
        for (int i=1; i<=FULL_WIDTH; i++)
        {
            for (int j=1; j<=tWIDTH+2; j++)
            System.out.print(" ");
            System.out.print("\\");
        }
        space();
    }

    public static void tileLine()
    {
        System.out.print("|");
        for (int i=1; i<=tWIDTH/2; i++)
        {
            System.out.print("-");
        }
        System.out.print("\\ \\");
        for (int i=1; i<=FULL_WIDTH; i++)
        {
            for (int j=1; j<=tWIDTH; j++)
                System.out.print("-");
                System.out.print("\\ \\");
        }
        for (int i=1; i<=tWIDTH/2; i++)
        {
            System.out.print("-");
        }
        space();
    }


// heading 
    public static void heading()
    {
        System.out.println("------------------------------------------");
        System.out.println("\t- Introduction to Programming");
        System.out.println("\t- Kevin George Rusty");
        System.out.println("\t- Class Project 1");
        System.out.println("------------------------------------------");
    }
    // space
    public static void space()
    {
        System.out.println();
    }
}// Class Project    _EOF_
