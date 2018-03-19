import java.util.*;
public class addNums {
    public static void main(String[] args) {
        int sum=0;
        for (int count=100;count<=200;count+=2) {
            System.out.print(" "+sum+" + "+count+" = ");
            sum +=count;
            System.out.println(sum);
        } System.out.println("\nThe total is = "+sum);

    } // END main
}
