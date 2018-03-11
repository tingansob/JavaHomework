import java.util.*;
public class TestingControls {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        String uName;
        uName=userName(in);
        greeting(uName);
        count=userCount(in);
        boxedNumber(count);
        printPowersOf2(count);

    } // end main

    public static int userCount(Scanner in)
    {
        int count;
        System.out.print("How many times should I count? ");
        count=in.nextInt();
        return count;

    }

    public static void boxedNumber(int count)
    {

        if (count <=0){
            System.out.println("You entered "+count+". Please enter a + #.");
        } else {
            for (int i=1; i<=count; i++) {
                System.out.print ("["+i+"] ");
            }
            br();
        }
        br();
    }

    public static void printPowersOf2(int count) {
        for (int i=0; i<=count; i++) {
                System.out.print(i);
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            br();
        }
        br();
    }


    public static String userName(Scanner in) 
    {
        String uName;
        System.out.print("What is your name? ");
        uName=in.nextLine();
        return uName;
    }

    public static void greeting(String uName) {
        br();
        System.out.println("Hello, "+uName);
    }
    public static void br(){System.out.println();}
} // TestingControls _EOF_
