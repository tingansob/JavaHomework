import java.util.*;
public class testPayroll {
    public static void main(String[] args) {
        // CONSTANTS
            final int FT=40;
            final double RATE=18.28;
            final double SS=.06;
            final double FED=.13;
            final double LOC=.05;
            final double UNION=11;
            final double INS=35;

        Scanner in=new Scanner(System.in);
        int done = 0;
        double otRate=RATE*(RATE/2), ftPay;
        boolean ot=false, dep=false;
        int hrsWorked=workWeek(in);
        int dependents=numDepend(in);

        

        do {
            done=again(in);
            if (done==1){
                System.out.println("Closer");
            } else if (done==0) {
                System.out.println("good bye");
            }
        } while (done != 0) ;

        











    } // END main
 
    public static int again(Scanner in) {
        System.out.print("1 - to continue \n0 - to exit\nContinue? -----> ");
        return in.nextInt();
    }

    public static int workWeek(Scanner in) {
        int hrsWorked=0;
        do {
            system.out.print("How many hours worked this week? \nBetween 1-168")
        }
    }
} // END class testPayroll
