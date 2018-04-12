/* Created by tingansob on 04/09/2018 at 09:52:17 AM */
import java.util.*;

public class test{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name=helloWorld(in);

        System.out.println("\nHello "+name);

    } // END main


/* METHODS */


    /* @helloWorld --- get user input and return as name */
    public static String helloWorld(Scanner in) {
        System.out.print("\nHello, what is your name? ");
        return in.nextLine();
    } // END helloWorld

    public static void space(){System.out.println();}
    public static void space(int x){for(int i=1;i<=x;i++)System.out.println();}

} // END class
