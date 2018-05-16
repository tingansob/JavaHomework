import java.util.*;
public class Util{

    Util(){}
    Util(Scanner in){
        this();

    }
    public void space(){System.out.println();}
    public void space(int x){for (int i=0;i<x;i++)System.out.println();}

    // Ask user for int input 
    public int choice(Scanner in){ System.out.print("=> "); return in.nextInt();}

    // ask user for string input
    public String getInfo(Scanner in){ System.out.print("=> "); return in.nextLine(); } 
} // END Util
