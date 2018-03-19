import java.util.*;
public class imputTesting {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int length, width;

        String name=greeting(in);
        System.out.println("Okay "+name+" Let's find out the area of a square");

        System.out.print("Enter a length: ");
        length=in.nextInt();

        System.out.print("Enter a width: ");
        width=in.nextInt();

        System.out.println("\nOk "+name+", your square takes up an area of "+length*width+" units.\n");
    }

    public static String greeting(Scanner in){
        System.out.print("\nWhat is your name? ");
        return in.nextLine();
    }
}
