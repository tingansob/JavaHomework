/* ShadowV */

import java.util.*;
public class ShadowV
{

/* static class variables */

    public static final char CHECK = '\u2713';
    public static final char RECYCLE = '\u2672';
    public static final char ARROW = '\u2BC8';
    public static final char ARROW2 = '\u2BC7';
    public static final char TIME = '\u23F3'; 
    public static final char FIVER = '\u2B1F'; 
    public static final char DNRT = '\u21D8'; 
    public static final char DNLF = '\u21D9'; 
    public static final char DOTF = '\u22F0'; 
    public static final char DOTB = '\u22F1'; 
    public static final char DOTU = '\u22EE'; 
    public static final char DOTD = '\u22EF'; 

    public static final int SIZE = 9; 
    

    
    public static void main(String[] args) 
    {
        System.out.println();
        greeting();
        System.out.println();
        looping();
        System.out.println();
        loop2();
    }

    public static void greeting() 
    {
        System.out.println("I wasn't sure what the homework assignment was...");
        System.out.println("So I decided to try and recreate it from memory...");
        System.out.println("...I hope this is close enough. "+CHECK);
        System.out.println();
        System.out.println("The unicode character's I'm using are \n\n\t"+CHECK+"   "+RECYCLE+"   "+ARROW+"   "+ARROW2+"   "+TIME+"   "+FIVER+"   "+DNRT+"   "+DNLF+"   "+DOTF+"   "+DOTB+"   "+DOTU+"   "+DOTD);
        System.out.println();
    }


    public static void looping()
    {
        int z = 0;
        for (int i = 1; i <= SIZE; i++)
        {
            System.out.print("  "+ARROW+""+DOTU);
            for (int j=SIZE; j>=i; j--)
            {
                System.out.print(DOTF+""+DNRT);

            }
            for (int j=z+2; j<=i*2; j++)
            {
                System.out.print(FIVER);
            }
            for (int j=z ; j<i*2-2; j++)
            {
                System.out.print(FIVER);
            }
            for (int j=SIZE; j>=i; j--)
            {
                System.out.print(DNLF+""+DOTB);
            }
            System.out.print(DOTU+""+ARROW2+" "+DOTD+TIME+DOTD+" |");
            for (int j=SIZE; j>=i; j--)
            {
                System.out.print(DNLF+"/");

            }
            for (int j=1; j<=(i*2-1); j++)
            {
                System.out.print("^");
            }
            for (int j=z ; j<i*2-2; j++)
            {
                System.out.print("^");
            }
            for (int j=SIZE; j>=i; j--)
            {
                System.out.print("\\"+DNRT);
            }
        System.out.print("|");
        System.out.println();
        }
    }
        public static void loop2()
        {
            for (int i=1; i<=SIZE; i++)
            {
                for (int j=1; j<i; j++)
                {
                    System.out.print(" ");
                }
                System.out.println(ARROW+" "+i);
            }
        }
    

} // ShadowV _EOF_

