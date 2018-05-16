import java.util.*;
public class Util{

    // INSTANCE VARIABLES

    private int choice;
    public void space(){System.out.println();}
    public void space(int x){for (int i=0;i<x;i++)System.out.println();}

    // CONSTRUCTORS 
    
    // ACESSORS
    

    // MODIFIERS


    // toString
    
    // METHODS


    public int choice(Scanner in){
        System.out.print("What's your choice => ");
        choice = in.nextInt();
        return choice; }

    /** User Scanner to get name
     *
     */
    public String getName(Scanner in){
        System.out.print("What is your name? ");
        String name = in.nextLine();
        space();
        return name; }




} // END Util class
