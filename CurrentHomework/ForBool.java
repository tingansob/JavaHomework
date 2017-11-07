import java.util.*;
public class ForBool
{
    public static final int TEST_NUMBER = 7;

    public static void main(String[] args)
    {
        testBool();
        System.out.println(345 / 10 / 3 * 55 / 5 / 6 + 10 / (5 / 2.0));
    }

// METHODS
    public static void testBool() {
        System.out.print("+");
        for (int i = 0; i ==(TEST_NUMBER % 2); i++) {
            System.out.println("TRUE");
            for (int line = 1; line <=TEST_NUMBER/2; line++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i == (TEST_NUMBER % 2); i++) {
            System.out.println("FALSE");
            for (int line = 1; line <=TEST_NUMBER/2; line++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
