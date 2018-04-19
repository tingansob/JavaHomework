import java.util.*;
public class Main{

    /* Instance Variables */



    public static void main(String[] args){

        
        Boat tug = new Boat();
        Lights red = new Lights();
        Sound prolong = new Sound();

        tug.greeting();
        red.flash();
        prolong.honk();


        int[] x = {10, 20, 30, 40, 50};
        String[] testing = {"a", "b", "c", "d"};
        
        for (int i : x){ System.out.println(i); }

        int a = testing.length;

        //for (int i=0 ; i<testing.length ; i++ ){
        for (String i : testing ){
            tug.greeting();
        }


    } // END main

    /* Methods */




} // END Main class _EOF_
