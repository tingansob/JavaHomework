/* Kevin George Rusty
 * Fri Nov 10 17:29:01 EST 2017
 *
 * What a shame that I didn't see this during the exam. You even gave us all the clues in the test. The answers to many of the questions led us to the program you were asking for. 
 *
 * I lamented over that problem after the exam and decided that drawing nice shapes was helpful but learning to use a for loop beyond repeating print statements would be useful...so I pondered and tought and worked...AND THEN, as my eyes were crossed and I could barely see...laying down after hours of coding it all hit me.
 *
 * Now I totally understand that this is of no influence on my grade but just for my own knowledge I wanted to make sure I understood what you were asking in the program we were to submit for the exam.
 *
 * The goal was to create a class variable N and we were to add the reciprocal of N to N itterations. I thought about how I would use a for loop to calculate, to date I'd only printed pretty picutres on the screen, I hadn't done more complex variable assignments. I realized that I wasn't really using the full body of knowledge I'd learned so far. 
 *
 * Surely I could be more creative.
 *
 * I downloaded a ton or free online resources about computer science, programming philosophy, other languages, logic, and all sorts of examples...I've looked at more ways that people have used this set of knowledge (which has been hard since we've really only scratched the surface). 
 *
 * I wanted to share this code with you to make sure I understood what you were asking for. I think this is more akin to what we were supposed to achieve. I did try to advance my application a bit by using printf to format the output of the double...once N got to 3 the output becme quite wild, I also figured I'd read ahead and include a version with some features I've seen in the pipeline. 
 *
 * 
 *
 */
import java.util.*;
public class Answer
{
    // Variables
    public static final int N = 8;
    /* Here is wehre I will set the reciprocal of N */
    public static double recip;
    /* Here's where I will += the previous reciprocal value to the sum of the N */
    public static float total = 0;


    public static void main(String[] args)
    {
        for (double i=1; i<=N; i++)
        {
            System.out.printf(" 1/"+(int)i+" = %.2f += ",  (1/i)); // I wanted to format the output
            recip = (1/i);                           // so that it would ine up better
            total += recip;
            System.out.println(total);
        }

        for (int j=1; j<=15  ; j++)       // Altough you said no nested loops
        {                                           // you didn't say we couldn't
            System.out.print("-");                  // include other loops for style
        }                                           // enhancements. 
        System.out.printf("\ntotal = %.2f or %.8f \n",  total, (double)total);
    }
}
