/* Kevin George Rusty */

import java.util.*;
public class arrayTesting {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner in = new Scanner(System.in);
        String name=greeting(in);;
        // variables
        System.out.print("How large is this array? ");
        int sizeOfArray=in.nextInt();
       // String name=greeting(in);
       int [] amounts = new int[sizeOfArray];

       for (int i=0;i<amounts.length;i++){
           System.out.println(amounts[i]);
       }



    } // END main


/* METHODS */
    public static String greeting(Scanner in) {
        System.out.print("What is your name -> ");
        return in.nextLine();
    }

    public static void welcomeMessage(String name) {
        System.out.println("\nHello there "+name);
    }


} // END class arrayTesting _EOF_

