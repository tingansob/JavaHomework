import java.util.*;
public class Witholdings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean calculate = true;
        int response;
        
        final int FTHOURS=40;
        final double PAYRATE=18.28;
        final double SS=.06;
        final double FED=.13;
        final double LOC=.05;
        final double UNION=11;
        final double INS=35;


        double otRate=PAYRATE+(PAYRATE/2), ftPay;
        boolean ot=false, dep=false;
        String name=hello(in);
        int hrsWorked=workWeek(in);
        int dependents=numDepend(in);



/*
        space();
        System.out.println("Welcome, Please choose from the following");

            System.out.println(" 1 - Calculate Witholdings\n 2 - Exit\n");
        do {
            System.out.print("Please Select: ");
            response=in.nextInt();
        } while (calculate);
        System.out.println("Hello World");

*/

/* evaluate FT hours & Overtime */

        if (hrsWorked<=FTHOURS) {
            ftPay = hrsWorked*PAYRATE;
        } else {
            ot=true;
            int otHours=hrsWorked-FTHOURS;
            double otPay=otHours*otRate;
            ftPay = FTHOURS*PAYRATE;
        }

        // check for 2 or more dependents
        if (dependents>=2) { dep=true; }


/* output */

        System.out.println("Thank You. Here is "+name+"'s paycheck");

        payCheck(name,hrsWorked,ot,dep,PAYRATE,SS,FED,LOC,UNION,INS);
        //payCheck(name,hrsWorked,ot,dep,ftPay,otPay,PAYRATE,SS,FED,LOC,UNION,INS);
        System.out.println();
    
    } // END main



    public static void payCheck(String name,int hrsWorked, boolean ot, boolean dep, double PAYRATE, double SS, double FED, double LOC, double UNION, double INS ) {
        System.out.println(name);
        System.out.println(hrsWorked);
        if (ot) {System.out.println("You worked Overtime this pay cycle");}
        if (dep) {System.out.println("You have 2 or more dependents");}

    }

    public static String hello (Scanner in) {
        System.out.print("Please enter the employees name: ");
        return in.nextLine();
    }


    public static int workWeek(Scanner in) {

        int hrsWorked=0;
        do {
            System.out.print("How many hours did they work this week? \nBetween 1 - 168");
            hrsWorked = in.nextInt();
        } while (hrsWorked>=0&&hrsWorked>168);
        return hrsWorked;

    }

    public static int numDepend(Scanner in) {
        System.out.print("How many dependents are you claiming? ");
        return in.nextInt();

    }




    //spacing
    public static void space(){System.out.println();}
    public static void space(int x){int i;for(i=1;i<=x;i++)System.out.println();}

} // END class Witholdings
