import java.util.*;

/*
 * Created by tingansob on 10/31/2017 at 09:13:01 AM
 * Assignment:
 *
*/

public class ForControlStructures
// Application name
{
    public static void main(String[] args) // Beginning of main method
    {
        System.out.println("Testing \"FOR\" control structures.");
        System.out.println("\nSquare Roots Loop");
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i + " squared = " + ( i * i ));
        }

        System.out.println("\nLoop starting with a negative #:");
        for (i = -10; i <= 10; i++) {
            System.out.println(i + " squared = " + ( i * i ));
        }

        System.out.println("\nLooping simple lines");
        for ( i = 1;i <= 10; i++ ) {
            System.out.println("+----------+");
        }

        System.out.println("\n i currently = "+ i);
        System.out.println("I'll have to reset the value of i in each \"if\" statement because it's been set by the previous loop.");
        System.out.println("\nloop through # on one line.");
        for (i = 1; i <= 10; i++) {
            System.out.print(i +" ");
        }
        System.out.println();


        System.out.println("\nloop through # on one line beginning with 0.");
        for (i = 0; i <= 10; i++) {
            System.out.print(i +" ");
        }
        System.out.println();

        System.out.println("\nDecrement from 10 - 0");
        for (i = 10; i >= 0; i--) {
            System.out.print(i +" ");
        }
        System.out.println();

        System.out.println("\nNested Loops");
        System.out.println("------------");

        for (i = 1; i <= 2; i++) {
            System.out.println("Head of the outer loop");
            for (int j = 1; j <=5; j++) {
                System.out.println("\t>Inside the inner loop");
            }
            System.out.println("Bottom the outer loop.\n");
        }

        for (i = 1; i <= 6; i++) {
            for (int j = 1; j <= 3; j++) {
            System.out.print(j + " ");
            } 
        }
        System.out.println();
        System.out.println("Next loop follows this.");

        for ( i = 1; i <= 5; i++ ) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
        System.out.println();
        }


        for ( i = 1; i <= 6; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    } // END main
} // End of application

/*
 * email:
 *
*/

