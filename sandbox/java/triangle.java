import java.util.*;
public class triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a, b, c;
        double area;
        instructions();

        a=getValues(in, 1);
        b=getValues(in, 2);
        c=getValues(in, 3);
        
        if (a<=0 || b<=0 || c<=0) {                            // testing for <=0
            System.out.println("\n\tInvalid data was entered.\n");   // if true exit
        } 
        else if (a+b>c && b+c>a && a+c>b) {
            typeOfTriangle(a, b, c);
            check4RightAngle(a, b, c);
            System.out.println("Area: "+area(a, b, c));

        } 
        else 
        {
            System.out.println("Not sides of a triangle");
        } 
        // System.out.println("Done");

    } // end main

    public static void instructions() {
        System.out.println("\n\tWelcome to the triangle problem.\n");
    } // end instructions

    public static int getValues(Scanner in, int count) {
        int value;
        System.out.print("Enter number "+count+" => ");
        value=in.nextInt();
        return value;
    } // end getValues

    public static void evaluate(int a, int b, int c) {
            int sum=a+b+c;
            System.out.println("Good Job Sum = " +sum);
    } // end evaluate

    public static void typeOfTriangle(int a, int b, int c) {
        if (a!=b && b!=c && c!=a) {
            System.out.println("No sides equal - scalene");
        } else if (a==b && b==c) {
            System.out.println("Three sides equal - equlilateral");
        } else if (a==b || b==c || a==c) {
            System.out.println("Two sides equal - isoceles");
        }
    } // end method

    public static void check4RightAngle(int a, int b, int c) {
        if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) {
            System.out.println("This is a right triangle.");
        } else 
            System.out.println("This is not a right triangle.");
    }

    public static double area(double a, double b, double c) {
        double p, area;
        p = (a+b+c)/2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;

        /*

           Calculate area
           for area when you have 3 side lengths

           let a, b, c, be lengths of sides

           area = square root of (p(p-a)(p-b)(p-c))
           where p = (a+b+c)/2
         
        */
    }

} // end class _EOF_
