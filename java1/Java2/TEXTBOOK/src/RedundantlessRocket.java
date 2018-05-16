/*
import java.util.*;
 * Author: Kevin George Rusty
 * Professor: Eileen Lichtenthal
 * Class: CP 500 02[3995] Introduction to Computer Programming
 * Text: Building Java Programs: A Back to Basics Approach. 4th Edition
*/

public class RedundantlessRocket
{
    /*
	public static void main(String[] args)
	{
		drawRocket();
	} */// END main

// Assemble Rocket

	public  void drawRocket()
	{
		drawCabin();
		drawJets();

	} // END drawRocket

 // Draw The Box

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

// Create the smallest elements  of the rocket 

	public static void drawCone()
	{
		System.out.println("   /\\  ");
		System.out.println("  /  \\ ");
		System.out.println(" /    \\");
	} // END drawCone

    public static void drawEdge()
    {
		System.out.println("+------+");
    } // END drawEdge

    public static void drawSide()
    {
		System.out.println("|      |");
    } // END drawSide

    public static void printMessage()
    {
		System.out.println("|United|");
		System.out.println("|States|");
    } // END printMessage
	
} //  END RedundantlessRocket
