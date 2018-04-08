/* Kevin George Rusty
 *
 * The median of an array is the middle value, once the array is in sorted order.  
 * The median is the mean of the two middle numbers when the array is of even length.  
 *
 * Write a program that uses an array of integers.  
 * It finds the median element if the array is already sorted.  
 * If the array is 
        not in sorted order, 
        it should display a message and 
        not attempt to find the median.  
 * Make sure your code works for an array of even length and an array of odd length.  
 *
 * For example, the median of [2, 4, 5, 17, 55] is 5 and 
 * the median of [2, 4, 8, 9, 17, 55] is 8.5.  
 *
 * However, the array [102, 2, 43, 5, 17, 55] is not in sorted order, 
 * so your program would not attempt to find its median value.  
 *
 *
 * Bonus: Write a program that calculates the mode of an array of integers 
 * (whether it is sorted or unsorted).  
 * The mode is the element that occurs most frequently in the array.
 *
 * DUE: April 23, 2018
 */
import java.util.*;
public class MedianAssignment3 {
    public static void main(String[] args) {
        // Array Assignments
        int [] SortedOdd = {2, 4, 5, 17, 55};
        int [] SortedEven = {4, 7, 8, 9, 17, 55};
        int [] UnsortedOdd = {10, 11, 12, 15, 104, 102, 3, 102, 5, 17, 102};
        int [] UnsortedEven = {102, 4, -32, 5, 17, 24, -32, 55, 15, 32};

        System.out.println("\n\tFinding the Median and the Mode\n");
        spacer();

        analyzeArray(SortedEven);
        analyzeArray(SortedOdd);
        analyzeArray(UnsortedEven);
        analyzeArray(UnsortedOdd);
        
    } // END main

/* METHODS */
    /* @ analyzeArray --- check for sorting, mode and median */
    public static void analyzeArray(int[] array){

        if (sorted(array)!=true){ 
            System.out.println("This array is Unsorted, I can not find the Meidan");
        }
        else {
            median(array); 
        } 
        mode(array);
        spacer();

    } // END analyzeArray

    /* @display --- print all elements of the array */
    public static void display(int[] list){
        for(int i=0;i<list.length;i++) {
            System.out.print(list[i]+" ");
        } spacer();
    } // END display method

    /* @sorted --- return true if array is sorted lowest to highest */
    public static boolean sorted(int[] list){
        int lowest=0;
        for (int i=0; i<=list.length-1; i++) {
            if (list[i]>lowest) {
                lowest = list[i];} 
            else if (list[i]<lowest){
                display(list);
                return false; }
        } return true;
    } // END sorted method

    /* @median --- find the mediain */
    public static void median(int[] list){
        double num1=0, num2=0;
        if ((list.length)%2==0){ 
            // if array length is an even number the average of middle 2 values is the median
            num1=(list[list.length/2-1]); 
            num2=(list[list.length/2]);
            display(list);
            System.out.println("The median for this array is "+(num1+num2)/2); } 
        else { 
            // if arrray is an odd number the value in the center is the median
            num1=list[list.length/2];
            display(list);
            System.out.println("The median for this array is "+(num1)); }
    } // END median method

    /* @mode --- find the mode */
    public static void mode(int[] list){
        int modeCount=0, modeID=0;
        for (int i=0; i<list.length;i++){
            int count=0;
            for (int j=0; j<list.length;j++){
                if (list[j]==list[i])
                    count++;
            } if(count > modeCount){
                modeCount=count;
                modeID=list[i];
            }
        }
        if (modeCount==1){
            System.out.println("This array has all unique values, there is no mode.");
        } else {
            System.out.println("The mode of this array is "+modeID+" which appears "+modeCount+" times.");

        }
    } // END mode

    // spacer methods --- creating whitespace via method
    public static void spacer(){System.out.println();}
    public static void spacer(int x){for(int i=1;i<=x;i++){System.out.println();}}

} // END// class _EOF_
