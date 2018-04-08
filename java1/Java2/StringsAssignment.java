/*
Write a program that asks the user for their name and then creates a design from the name forwards and backwards.

If the user enters that their name is Sam the program should display the following (all in uppercase):

 

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
public class StringsAssignment{
    public static void main(String[] args){
        String name = "Sam";
        name = name.toUpperCase();
        System.out.println("String 1 length is "+name.length());
        for  (int i=0;i<name.length();i++){
            for (int j=0;j<=i;j++)
            { 
                System.out.print(name.substring(i,j));
            }
            space();

        }

        for (int i = 1 ; i <= 6 ; i++) {
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            space();

        }

    } // END main

    public static void space(){System.out.println();}
    public static void space(int x){for (int i=1;i<=x;i++)System.out.println();}
} // END class _EOF_


