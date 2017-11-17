/* 
 * Kevin George Rusty
 * Fri Nov 10 17:29:01 EST 2017 */
import java.util.*;
public class AnswerSED
{
    // Variables
    public static final int N = 8;
    public static double recip;         // Here is wehre I will set the reciprocal of N 
    public static float total = 0;      // Here's where I will += the previous reciprocal value to the sum of the N 

    public static void main(String[] args)
    {
        for (double i=1; i<=N; i++)
        {
            System.out.printf(" 1/"+(int)i+" = %.2f += ",  (1/i));  // I wanted to format the output
            recip = (1/i);              i                           // so that it would ine up better
            total = total += recip;
            System.out.println(total);
        }

        for (int j=1; j<=15  ; j++)                   // Altough you said no nested loops
        {                                           // you didn't say we couldn't
            System.out.print("-");                  // include other loops for style
        }                                           // enhancements. 
        System.out.printf("\ntotal = %.2f or %.8f \n",  total, (double)total);
    }
}
