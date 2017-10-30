import java.util.*;

/*
 * Created by tingansob on 10/30/2017 at 09:12:28 AM
 * Assignment: https://www.w3resource.com/java-exercises/basic/index.php
*/

public class Hello   // Application name
{
    public static void main(String[] args) // Beginning of main method
    {
        helloWorld();

    } // END main


    public static void helloWorld() // Beginning of the helloWorld method
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter you first name then press <ENTER> ");
        String name = scan.nextLine();
        System.out.println("Hello\n"+name+"\n");
    } // END helloWorld

} // End of application


/*
 * email:
 *
*/

