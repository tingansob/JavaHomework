/*
 * INFO: PrintSumOf2Numbers
 * Created by tingansob on 10/30/2017 at 09:32:25 AM
 * Assignment:
 *
*/
import java.util.*;
/*
 * MAIN
 */
public class PrintSumOf2Numbers  {
    public static void main(String[] args) {
        getNumbers();
     //   doMath();

} // END main
/*
 * METHODS
 */
    public static void getNumbers() // Beginning of the getNumbers method
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your first number >\t");
        int num1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please enter your second number >\t");
        int num2 = scan2.nextInt();


        System.out.println("Thus the sum of "+num1+" + "+num2+" = " +(num1 + num2));
    } // END getNumbers
    
/*
    public static void doMath() // Now's time to calculate the sum of the 2 numbers.
    {
        System.out.println("The sum of "+num1+" and "+num2);
    }

    */

} // End of application

