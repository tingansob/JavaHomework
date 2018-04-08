import java.util.*;
public class STest{
// MAIN
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        space();
        System.out.println("\nWelcome "+getName(in));
        space(4);
    } // END main
// METHODS
    // get user name
    public static String getName(Scanner in){ 
        System.out.print("Please enter your name: "); 
        return in.nextLine(); } 
    // generate spaces - overloading the space() method
    public static void space(){System.out.println();}
    public static void space(int x){for (int i=1;i<=x;i++)System.out.println();}
}
