import java.util.*;
/*
 * Author: Kevin George Rusty
 * Professor: Eileen Lichtenthal
 * Class: CP 500 02[3995] Introduction to Computer Programming
 * Text: Building Java Programs: A Back to Basics Approach. 4th Edition
*/

public class LoopyRocket{
    public static final int width=6; 

	public static void main(String[] args)
	{
		drawRocket();
	} // END main

// Assemble Rocket

	public static void drawRocket()
	{
        drawCone();
		drawCabin();
        drawEdge();
		drawCone();

	} // END drawRocket

 // Draw The Box

    public static void drawCabin()
    {
        for ( int i = 1; i <=2; i++ ){
            drawEdge();
            drawSide();
        }
    }
    /*
    public static void drawLid()
    {
        drawEdge();
    } // END drawLid

    public static void drawWalls()
    {
        drawSide();
    } // END drawWalls

    public static void drawBottom()
    {
        drawWalls();
        drawSide();
        drawLid();
    } // END drawBottom

	public static void drawBox()
	{
        drawLid();
        drawBottom();
	} // END drawBox

    public static void drawCabin()
    {
        drawCone();
        drawBox();
    } // drawCabin

    public static void drawJets()
    {
        drawBottom();
        drawCone();
    } // END drawJetes
    */

// Create the smallest elements  of the rocket 

	public static void drawCone()
	{
		System.out.println("   /\\  ");
		System.out.println("  /  \\ ");
		System.out.println(" /    \\");
	} // END drawCone

    public static void drawEdge()
    {
        for ( int i = 1; i <= 8; i++ ){
            System.out.print("-");
        }
        System.out.println();
    } // END drawEdge
/*
    public static void drawSide()
    {
        for ( int i = 1; i <= 2; i++ ){
	    	System.out.println("|      |");
        }
    } // END drawSide
    
*/
    public static void drawSide()
    {
        System.out.print("|");
        for (int  i = 1 ; i <=width; i++ ){
            System.out.print(" ");
        }
        System.out.println("|");
    }
}//  END LoopyROcket
