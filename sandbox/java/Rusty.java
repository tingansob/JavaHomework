/* Created by tingansob on 11/28/2017 at 10:00:42 PM */
import java.util.*;

public class Rusty {

    /* constants */

        public static final String NAME = "Kevin";

    // end constants


/* main */

    public static void main(String[] args)
    {
        helloWorld();

        int m, k, i = 3, j = 10; 
        System.out.println(i+" i");
        System.out.println(j+" j");
        i=++j;

        System.out.println(i+" i");
        i++; 
        System.out.println(i+" i");
        k=j++;
        System.out.println(k+" k");
        System.out.println(j+" j");
        m=j+=k;
        System.out.println(m+" m");
        System.out.println(k+" k");
    } 

// end main


/* methods */

    public static void helloWorld()
    {
        System.out.println("\nHello "+NAME+"\n");
    }

// end methods

} // end rusty
