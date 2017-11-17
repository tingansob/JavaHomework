import java.util.*;
public class Param
{
    int c, d, e;
    public static void main(String[] args)
    {
        getLW();
        stringers();
    }
    

    public static void getLW() {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter an int ");
        int length = scan.nextInt();

        System.out.print("Enter another int ");
        int width = scan.nextInt();
        int area = (length * width);

        System.out.println();
        System.out.println("Length = "+length+" \nWidth = "+width+"\n\nArea: "+length+" * "+width+" = "+area);

    }

    public static void stringers() {
        Scanner scan1 = new Scanner(System.in);

        System.out.print("\nEnter a string ");
        String name = scan1.nextLine();
        System.out.println("You entered "+name);

        System.out.print("\nEnter another string ");
        String name2 = scan1.nextLine();
        System.out.println("You entered "+name2);
    }
}
