import java.util.*;
public class loopingLesson {
/* MAIN */
    public static void main(String[] args) {

     // counting problem
        int sum=counting();
        System.out.println("\nThe sum of all #s from 116 to 135 = "+sum+"\n");

      // design problem
        design(6);

    } // END main
/* METHODS */
    public static int counting() {
        int j, sum=0;
        for (int i=116 ; i<=135; i++){
            sum+=i;
        }
        return sum;
    }// END counting()
// BEGIN design()
    // Display the design 
    public static void design(int j) {
        for (int i=1;i<=j;i++) {
            System.out.println("*****");
            System.out.println(" *** ");
            System.out.println("/\\*/\\");
        }
    } // END design()
} // END class fooBar
