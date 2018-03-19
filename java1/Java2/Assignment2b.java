/* Kevin George Rusty
   Assignment 2b: Tuition Increase
   Due: March 18, 2018 */

import java.util.*;
public class Assignment2b {
/* MAIN */
    public static void main(String[] args) {
        /* variables */
        double tuition=8000,increase;
        int currentYear=2018,endYear=currentYear+10; // set amount of years to calculate

        heading(tuition); 
        while (currentYear<=endYear) {
            System.out.printf(" %2d  $%8.2f \n",currentYear,tuition);
            increase=tuition*.04; // calcuate the annual 4% increase
            tuition+=increase;    // increase tuition by 4% of current tuition rate
            currentYear++;
        } System.out.println();


    } // END main
/* METHODS */
    public static void heading(double tuition) {
        System.out.println("\nAssignment 2b: Tuition Increase\n-------------------------------\n");
        System.out.printf("Tuition at the LINUXversity in 2018 is $%6.2f.\n",tuition);
        System.out.println("Adding an annual 4% increase, what will tuition be in 10 years?\n");
    } // END heading
} // END class
/* Assignment instructions:
 
Suppose that the tuition for a university is currently $8,000 per year and increases by 4% every year.  
        
Use a loop to compute the tuition rate in ten years from now.

Realize that the second year's tuition will be $8,320 and the third year's tuition will be $8,652.80 and so on. 
*/
