/* Java Programming Class Project 1

   Kevin George Rusty
 */
import java.util.*;

// variables
public class ClassProject1
{
    public static final int rHEIGHT = 5, rWIDTH = 4; // rectangle dimensions
    public static final int hHEIGHT = 2, hWIDTH = 6; // honeycomb dimensions
    public static final int FULL_WIDTH = 4, FULL_HEIGHT = 5; // tiles dimensions
    public static final int tWIDTH = 6, tHEIGHT = 3; // tiles dimensions

    // start of MAIN
    public static void main(String[] args)
    {
       // heading();
        // print out the rectangle
        //System.out.println("\n1. Rectangle\n\n   h = "+rHEIGHT+" | w = "+rWIDTH+"\n");
        //rectangle();
        // print out the honeycomb
       // System.out.println("\n\n2. Honeycomb\n\n   h = "+hHEIGHT+" | w = "+hWIDTH+"\n");
        //honeycomb();
        // print out the tiles
        System.out.println("\n\n3. Tiles\n\n   h = "+tHEIGHT+" | w = "+tWIDTH+" Full W: "+FULL_WIDTH+" FUll H: "+FULL_HEIGHT+"\n");
        tiles();
    }
    
    
    public static void heading()
    {
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.println("\t- Introduction to Programming");
        System.out.println("\t- Kevin George Rusty");
        System.out.println("\t- Class Project 1");
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
    }
    
    // rectangle
    public static void rectangle()
    {
        rectangleCaps();
        rectangleSides();
        rectangleCaps();

    }
    public static void rectangleCaps() 
    {
        System.out.print(" ");
        for (int i=1; i<=rWIDTH; i++)
        {
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


    // honeycomb
    public static void honeycomb()
    {
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
        System.out.println();
        for (int i=1; i<=hWIDTH; i++)
        {
            System.out.print("\\_/ ");
        }
        System.out.println();
    }

    // tiles
    public static void tiles()
    {
        tOpen();
        tOpen();
        tBase1();
        tBase2();
    }

    public static void tOpen()
    {
        System.out.print("|");
        for (int i=1; i<=tWIDTH/2+1; i++)
        {
            System.out.print(" ");
        }
        System.out.print("|");
        for (int i=1; i<=FULL_WIDTH; i++)
        {
            for (int j=1; j<=tWIDTH+2; j++)
            System.out.print(" ");
            System.out.print("|");
        }
        System.out.println();

    }

    public static void tBase1()
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
        System.out.println();
    }

    public static void tBase2()
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
        System.out.println();
    }
}// Class Project _EOF_
