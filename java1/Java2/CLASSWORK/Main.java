import java.util.*;
public class Main{
    public static void main(String[] args){
        Boat Browdie = new Boat("Tug", 23, 7);

        displayBoat(Browdie);
        System.out.println(Browdie.length);
    }


    
    void space(){System.out.println();}
    void space(int x){for(int i=1;i<=x;i++)System.out.println();}


    public static void displayBoat(Boat t){

        System.out.print(t.type+", ");
        System.out.print(t.length+", ");
        System.out.print(t.draft+" ");
        t.sound(); 
        t.length++;


    }

}


