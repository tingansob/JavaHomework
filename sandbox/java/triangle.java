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
        
        evaluate(a, b, c);

    }

    public static void instructions() {
        System.out.println("\n\tWelcome to the triangle problem.\n");
    }

    public static int getValues(Scanner in, int count) {
        int value;
        System.out.print("Enter number "+count+" => ");
        value=in.nextInt();
        return value;
    }

    public static void evaluate(int a, int b, int c) {
        if (a <= 0) {
            System.out.println("Bad Info - BYE");
            bye();
        }
        if (b <= 0) {
            System.out.println("Bad Info - BYE");
        }
        if (c <= 0) {
            System.out.println("Bad Info - BYE");
        }
        System.out.println("Good Job");
    }

    public static void bye()
    {
        System.out.println("Good Bye");
    }

    public static void typeOfTriangle() {
        /* 
         * Based on matching lengths, what type of triangle is this
         * equilateral triangle has all 3 matching sides
         * Isosceles triangle has 2 matching sides
         * Scalene triange has no mathcing sides
         */
    }

    public static void proveShapeIsATriangle() {
        /*
         * calculate side lengths to make sure this is actually a triangle
         - triangle inequality theorm
         
           a + b > c
           b + c > a
           a + c > b

           all 3 must be true for a, b, c to be a triangle
          
         */
    }

    public static void check4RightAngle() {
        /*
         Check for right triangle

          a^2 + b^2 = c^2

         */
    }

    public static void area() {
        /*

           Calculate area
           for area when you have 3 side lengths

           let a, b, c, be lengths of sides

           area = square root of (p(p-a)(p-b)(p-c))
           where p = (a+b+c)/2
         
        */
    }

} // end class _EOF_
