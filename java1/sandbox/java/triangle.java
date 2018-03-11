/* triangle         Class Project 3

Author:             Kevin George Rusty
Professor:          Eileen Lichtenthal
Class:              CP 500 02[3995] Introduction to Computer Programming
Textbook:           Building Java Programming: A Back To Basics Approach. 4th Edition
Completion Date:    December 2, 2017 */
import java.util.*; 
public class triangle { 
    public static void main(String[] args) { 

        Scanner in=new Scanner(System.in);           // call Scanner method

        int a, b, c;                                 // set variables (int a, b, c) (double area)
        double area;

        instructions();                              // call method to display instructions
        a=getValues(in, 1);                          // assign user input to varaibles
        b=getValues(in, 2);
        c=getValues(in, 3);
        System.out.println();
        
        if (a<=0 || b<=0 || c<=0) {
            System.out.println("\n\tInvalid data was entered.\n");
        } else if (a+b>c && b+c>a && a+c>b) {                   // check for valid triangle
            typeOfTriangle(a, b, c);                            // evaluate the type of triangle
            check4RightAngle(a, b, c);                          // check if shape is rt triangle
            System.out.println("Area: "+area(a, b, c));         // calculate & display area
        } else {
            System.out.println("Not sides of a triangle");      // error message when invalid data is entered. 
        } 
        System.out.println();
    } // end main

    public static void instructions() {
        System.out.println("Welcome to the triangle program.\nPlease enter 3 integers.\n");
    } // end instructions

    public static int getValues(Scanner in, int count) {
        int value;
        System.out.print("Enter side "+count+": ");     // prompt for user to input value
        value=in.nextInt();
        return value;
    } // end getValues

    public static void typeOfTriangle(int a, int b, int c) {
        if (a!=b && b!=c && c!=a) {                                 // if ALL sides different
            System.out.println("No sides equal - scalene");         // then SCALENE
        } else if (a==b && b==c) {                                  // if all 3 sides equal
            System.out.println("Three sides equal - equlilateral"); // then EQUILATERAL
            drawTriangle(a, b, c);                                  // draw triangle
        } else if (a==b || b==c || a==c) {                          // if 2 sides equal
            System.out.println("Two sides equal - isoceles");       // then ISOCELES
            drawTriangle(a, b, c);                                  // draw triangle
        }
    } // end typeOfTriangle

    public static void check4RightAngle(int a, int b, int c) {
        if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) {           // check for right triangle
            System.out.println("This is a right triangle.");        // print appropriate status
        } else 
            System.out.println("This is not a right triangle."); 
    } // end typeOfTriangle

    public static double area(double a, double b, double c) {
        double p, area;
        p = (a+b+c)/2;                          // calculate area of 
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));  // triangle and return value
        return area;
    } // end area

    public static void drawTriangle(int a, int b, int c) {
        if (a==b || a==c) {                     // check for matching sides and use
            for (int i=1; i<=a; i++)            // that value as loop to print triangle
            {
                for (int j=1; j<=i; j++)        
                System.out.print("* ");
                System.out.println();
            } 
        } else {
            for (int i=1; i<=b; i++)
            {
                for (int j=1; j<=i; j++)
                System.out.print("* ");
                System.out.println();
            }
        }
    } // end drawTriangle
} // end triangle class _EOF_
