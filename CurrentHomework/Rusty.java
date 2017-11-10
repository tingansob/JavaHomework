/* Created by tingansob on 11/10/2017 at 08:00:40 AM */
import java.util.*; 
public class Rusty { 
    /* constants */

        public static final String NAME = "Kevin";
        public static final int COUNT = 19;

    // end constants


/* main */

    public static void main(String[] args)
    {
        //helloWorld();
        printSum();
    } 

// end main


/* methods */

    public static void helloWorld()
    {
        System.out.println("\nHello "+NAME+"\n");
    }


    public static void printSum()
    {
        int i, j, k, m = 10;
        for (i=COUNT-2; i>=0; i--)
        {
            System.out.println(i);
        }
        for (i=1; i<=COUNT*2; i++)
        {
            System.out.print(".");
        }
        System.out.println();
        for (i=COUNT/2; i>=0; i--)
        {
            System.out.println(i);
        }
    }
// end methods

} // end rusty
