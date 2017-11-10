import java.util.*;

/*
 * Created by tingansob on 11/06/2017 at 06:00:44 PM
 * Assignment:  Master Loops
 *
*/

/*
 * MAIN
 */
public class Rusty
{
    public static void main(String[] args)
    {
        helloWorld();
        loop01();

    }
// END main

    public static void helloWorld()
    {
        System.out.println("\nHello World!\n");
        for (int i=1; i<=5;i++)
        {
            for (int j=5;j>=i; j-- )
            {
              System.out.print("# ");
            }
            System.out.println();
        }

    } // END helloWorld

} // End of application
