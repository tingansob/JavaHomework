/*
Importing java utilities. We will not be using this currently but it's reuired for java to process math and calculations
*/
import java.util.*;

// This is the beginning of the actual "Hello World" class
public class Hello
{
   public static void main(String[] args)
   {
     /*
        Exprimenting with escape sequences, and the difference between print and println. The difference is that print does not include a carrage return where println does.
     */
     System.out.println("Hello World!");
     System.out.println("Now we're cooking with gas!");
     System.out.print("This string has no new line or carrage return after it.....");
     System.out.println("This is a new line in the program but is attached to the line before it.");
     System.out.println("So to put escape sequences like \" \" ");
     System.out.println("\tWe can also indent using the \\t escape sequence");
     System.out.println("\t\tWe can also indent using the \\t escape sequence");
   }
}
