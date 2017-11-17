/* Testing Scanner Constructor */
import java.util.*;
public class ImputTests
{
    public static void main(String[] args)
    {
        // Obtain value
        Scanner console = new Scanner(System.in);

        System.out.println("Testing user imput using the Scanner function.\n");
        System.out.println("This particular function calls the Scaner function once although \nit uses multiple iterations of the new constructor.\n\n");
        System.out.print("Please enter a string => ");
        String test1 = console.nextLine();
        System.out.print("Please enter a double value => ");
        double test2 = console.nextDouble();
        System.out.print("Please enter an integer =>");
        int test3 = console.nextInt();
        System.out.println();
        System.out.println("The string was "+test1);
        System.out.println("The double value was "+test2);
        System.out.println("The int is "+test3);
    }
}
