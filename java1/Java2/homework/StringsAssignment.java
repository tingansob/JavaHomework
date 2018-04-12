/* Kevin George Rusty
 *
 * Assignment
 * Write a program that 
 *      asks the user for their name 
 *      then create a design from the name 
 *      forwards and backwards 
 *
 *      Exmaple:
 *
 *      If the user enters that their name is Sam the program should display the following (all in uppercase):

S
SA
SAM
AM
M
*******
M
MA
MAS
AS
S


*/
import java.util.*;



public class StringsAssignment {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /* get user input */ space(2); String name = getName(in);

        int string=name.length();
        String bucket="";

        styleName(name,bucket,string);


    } // END main

    /* @getName - get user input and return value  */
    public static String getName(Scanner in){
        System.out.print("\n Please enter a name =>  ");
        String name=in.nextLine();
        return name.toUpperCase();
    }

    /* @reverseString - reverse String */
    public static String reverseString(String name, String bucket, int x)
    {
        for (int i=x-1; i>=0; i--) 
        { 
            bucket += name.charAt(i); 
        }
        return bucket;
    } // END reverse

    /* @styleName(String, Holder) - print name in order */
    public static void styleName(String name, String bucket, int x)
    {
        space();
        for (int i=1;i<=2;i++){ 
            displayName(name, bucket, x);
            if (i==1){seperator();}
            name=reverseString(name, bucket, x);
        }
        space();

    } // END display

    /* @displayName - print name to console */
    public static String displayName(String name, String bucket, int x ){ 
        for (int i=0; i<x ;i++) { 
            bucket+=name.charAt(i); 
            System.out.println(bucket); 
        } 
        displayR(name,bucket,x); 
        return bucket;
    }

    /* @ displayR - display descending */
    public static void displayR(String name, String bucket, int x){
        for (int i=1;i<x;i++) {
                bucket=name.substring(i);
                System.out.println(bucket);
            }
    }

    // console cleanup
    /* @space() - create newline */ public static void space(){System.out.println();}
    /* @space(x)- create x newlines  */ public static void space(int x){for (int i=1;i<=x;i++)System.out.println();}
    /* @seperator - create seperator */ public static void seperator(){for(int i=1;i<=7;i++){System.out.print("*");}space();} 

} // END class _EOF_


