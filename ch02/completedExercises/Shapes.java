import java.util.*;
public class Shapes
{
    //
    //  CLASS VARIABLES 
    //

    public static final String TINGANSOB = "Kevin";
    public static final int FLEX_BOX = 8;
    public static final int DIAMOND = FLEX_BOX/2;
    public static final int LOOP_BOX = FLEX_BOX*2;

    public static void main(String[] args)
    {
        greeting();
        drawBox(); 
        chapterEx();
        line1();
        line2();
        line3();
    }

    public static void line3() {
        System.out.print("+");
        for (int i = 1; i <= LOOP_BOX*2; i++)
        {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void line1() {
        System.out.print("+");
        for (int i = 1; i <= LOOP_BOX; i+=2) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void line2() {
        System.out.print("+\n+");
        for (int i = 1; i <= LOOP_BOX; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void chapterEx() {
        System.out.println("Chapter 2 - 'Self Check Problems'");
        System.out.println("\n2.1: Basic Data Concepts\n");
        ex01();
        ex02();
        ex03();
    }

    public static void ex01() {
        System.out.println("1 - Which of the following are legal int literals?\n");
        System.out.println("\t22\t-6834835\t '7'");
        System.out.println();
    }

    public static void ex02() {
        System.out.println("2 - What is the result of the following expression?\n");
        System.out.println("\t 1 + 2 * 3 + 7 * 2 % 5 = 11 ");
        System.out.println("\t 1 + 2 * 3 + 7 * 2 % 5 = "+(1 + 2 * 3 + 7 * 2 % 5));
    }

    public static void ex03() {
        System.out.println("3 - Trace the evaluation of the following expressions, and give their responding values:\n");
        System.out.println("a. 2 + 3 * 4 - 6");
        System.out.println("b. 14 / 7 * 2 + 30 / 5 + 1");
        System.out.println("c. (12 + 3) / 4 + 2");
        System.out.println("d. (238 % 10 + 3) % 7");
        System.out.println("e. (18 - 7) * (43 % 10)");
        System.out.println("f. 2 + 18 % 5 - (11 * (5 / 2))");
    }



//  DRAW BOX
    public static void drawBox() {
        drawBoxEdge();
        drawBoxBottom();
    }

// DRAW BOX ELEMENTS
    public static void drawBoxEdge() {
        System.out.print("+"); {
            for (int i = 1; i <= FLEX_BOX; i++) {
                System.out.print("-");
            }
            System.out.println("+");
        }
    } 

    public static void drawBoxBottom() {
        for (int sides = 1; sides <= FLEX_BOX/2+1; sides++){
            System.out.print("|"); {
                for (int i = 1; i <= FLEX_BOX; i++) 
                    System.out.print(" ");
            }
            System.out.println("|");
        }
        drawBoxEdge();
    } // END BOX ----------------------------------------


// GREETING
    public static void greeting() {
        System.out.println("Hello "+TINGANSOB);
        System.out.println();
    } // END GREETING ----------------------------------------

} // END CLASS ----------------------------------------

