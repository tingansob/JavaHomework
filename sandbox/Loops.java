/*
 * Loops * Created by tingansob on 11/06/2017 at 06:00:44 PM
 * Assignment:  Master Loops
 *
*/

//  loops MAIN
import java.util.*;
public class Loops {
    // variables
    public static final int COUNT = 5;

    public static void main(String[] args) {

        intro();
        loopSquares();
        rtlth(); // right triangles - low to high 

} // END main

// METHODS

public static void intro() {
    System.out.println("\nUsing a '#' char I want to print some ascii art...let's see how this goes.\n");
}
// square loops
public static void loopSquares()
{
        loop01();
        loop02();
        loop03();
        loop04();
        loop05();
        loop06();
        loop07();
        loop08();
    
}
public static void loop01() {
    System.out.println("Single loop, i=1, i<=5; i++; # ");
    for (int i = 1; i <= 5; i++){
            System.out.print("# ");
    }
    System.out.println();
} // END loop01
public static void loop02() {
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=COUNT; j++) {
            System.out.print("*"); }
        System.out.println(); }
}
public static void loop03() 
{
    System.out.println();
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=COUNT; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println(); 
    }
}
public static void loop04()
{
    System.out.println();
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=COUNT; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
public static void loop05() 
{
    System.out.println();
    for (char i='A'; i<='E'; i++)
    {
        for (char j='A'; j<='E'; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println(); 
    }
}
public static void loop06()
{
    System.out.println();
    for (char i='A'; i<='E'; i++)
    {
        for (char j='A'; j<='E'; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
public static void loop07()
{
    System.out.println();
    for (int i=COUNT;i>=1;i--)
    {
        for (int j=COUNT;j>=1;j--)
        {
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
public static void loop08()
{
    System.out.println();
    for (int i=COUNT;i>=1;i--)
    {
        for (int j=COUNT;j>=1;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

// Right triangle from low to high 
//
// image
// *
// * *
// * * *
// * * * * 
// * * * * * 
public static void rtlth()
{
    int z = 1;
    System.out.println();
    for (int i=1; i<=5; i++) {
        for (int j=5; j>i; j--) 
        {
            System.out.print(". "); 
        }
        System.out.print(i);
        for (int k=1;k<z;k++)
        {
            System.out.print(" .");
        }
        z++;
        System.out.println();
    }
}

} // loops _EOF_ 

/*
 * 
 */
