import java.util.*;
public class Util{


    public void space(){System.out.println();}
    public void space(int x){for (int i=0;i<x;i++)System.out.println();}



   // public int choice(Scanner in){

    public int choice(Scanner in){

        System.out.print("What's your choice => ");
        int choice = in.nextInt();
        return choice;

    }


}
