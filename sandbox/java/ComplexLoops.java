import java.util.*;
public class ComplexLoops 
{

//
//  Class Constants
//
public static final int LINES = 5;

    public static void main(String[] args) 
    {
        downCone();
        fullDiamond();
        upCone();
    }

    public static void fullDiamond() 
    {
        upCone();
        downCone();
    }
    public static void downCone() 
    {
        for (int line = 1; line <= LINES ; line++) {
            for (int i = 1; i <= (line - 1); i++ ) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (11 - 2 * line); i++ ) {
                System.out.print("*");
            }
            System.out.println();
         }
    }
    public static void upCone() {
        for (int line = LINES; line >= 1; line--) {
            for (int i = 1; i <= (line - 1); i++ ) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (11 - 2 * line); i++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
// ---------------------------------------------------------------

}
