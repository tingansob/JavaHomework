import java.util.*;

/*
 * Created by tingansob on 10/30/2017 at 09:32:25 AM
 * Assignment:
 *
*/

public class PrintSumOf2Numbers   // Application name
{
    public static void main(String[] args) // Beginning of main method
    {
        getNumbers();
        doMath();

} // END main

    public static void getNumbers() // Beginning of the getNumbers method
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number ");
        int firstNumber = scan.nextInt();
        System.out.println("You entered  "+firstNumber+" as your first#.");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your second number ");
        int secondNumber = scan2.nextInt();
        System.out.println("You entered  "+secondNumber+" as your secon#.");

    } // END getNumbers
    
    public static void doMath() // Now's time to calculate the sum of the 2 numbers.
    {
        System.out.println("The sum of "+firstNumber+" and "+secondNumber);
    }


} // End of application

/*
 * email:
 *
*/

