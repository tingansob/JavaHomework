/* Heading */
import java.util.*;                                                 // import java utilites as needed
public class triangle {                                             // app name 
    public static void main(String[] args) {                        // opening of main method
        Scanner in=new Scanner(System.in);                          // create Scanner in
        int a, b, c;                                                // set variables (int a, b, c)
        double area;                                                // set varaible (double area)
        instructions();                                             // print welcome and instructions to screen
        a=getValues(in, 1);                                         // set variable a to return of user input
        b=getValues(in, 2);                                         // set varaible b to return of user input
        c=getValues(in, 3);                                         // set varaible c to return of user input
        System.out.println();                                       // create space between instructions and user input
        
        if (a<=0 || b<=0 || c<=0) {                                 // testing value <= 0
            System.out.println("\n\tInvalid data was entered.\n");  // if true exit 
        } else if (a+b>c && b+c>a && a+c>b) {                       // validate triangle - if all test return true
            typeOfTriangle(a, b, c);                                // evaluate the type of triangle
            check4RightAngle(a, b, c);                              // check if shape is rt triangle
            System.out.println("Area: "+area(a, b, c));             // calculate & display area
        } else {
            System.out.println("Not sides of a triangle");          // error message when invalid data is entered. 
        } 
    } // end main

    public static void instructions() {                                                     // create static method for invitation
        System.out.println("Welcome to the triangle program.\nPlease enter 3 integers.\n"); // welcome and invitation to enter 3 integers
    } // end instructions

    public static int getValues(Scanner in, int count) {
        int value;                                      // initialize int variable
        System.out.print("Enter side "+count+": ");     // prompt for user to input value
        value=in.nextInt();                             // set user entry to variable value
        return value;                                   // return value int
    } // end getValues

    public static void typeOfTriangle(int a, int b, int c) {        // create static method receiving 3 parameters (int a, b, c)
        if (a!=b && b!=c && c!=a) {                                 // if ALL sides are different
            System.out.println("No sides equal - scalene");         // then println SCALENE
        } else if (a==b && b==c) {                                  // if there all 3 sides are equal
            System.out.println("Three sides equal - equlilateral"); // then println EQUILATERAL
            drawTriangle(a, b, c);                                  // call method to draw triangle
        } else if (a==b || b==c || a==c) {                          // if 2 sides are equal
            System.out.println("Two sides equal - isoceles");       // then println ISOCELES
            drawTriangle(a, b, c);                                  // call method to draw triangle
        }
    } // end typeOfTriangle

    public static void check4RightAngle(int a, int b, int c) {
        if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) {           // calculate pythagorean therom to validate right triangle
            System.out.println("This is a right triangle.");        // if true println TRIANGLE
        } else 
            System.out.println("This is not a right triangle.");    // else println NOT TRIANGLE
    } // end typeOfTriangle

    public static double area(double a, double b, double c) {
        double p, area;                         // set double varaibles
        p = (a+b+c)/2;                          // set value of p
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));  // set area = to answer
        return area;                            // return double value 

        /*
           Calculate area
           ----------------
           - for area when you have the lengths of 3 sides
           let a, b, c, be lengths of sides
           area = square root of (p(p-a)(p-b)(p-c))
           where p = (a+b+c)/2
        */
    }

    public static void drawTriangle(int a, int b, int c) {
        if (a==b || a==c) {                     // test to see which two sides are of equal length
            for (int i=1; i<=a; i++)            // if so print out a triangle at the lenght
            {                                   // of the matching sides
                for (int j=1; j<=i; j++)        
                System.out.print("*");
                System.out.println();
            } 
        } else {
            for (int i=1; i<=b; i++)
            {
                for (int j=1; j<=i; j++)
                System.out.print("*");
                System.out.println();
            }
        }
    } // end drawTriangle

} // end class _EOF_
