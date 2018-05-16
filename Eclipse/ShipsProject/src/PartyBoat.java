import java.util.Scanner;

/**
 *
 */

/**
 * @author Kevin George Rusty
 *
 */

public class PartyBoat  extends Ships{
    Util mame = new Util();

    private String schedule;
    private int fullPassengers;
    private int staff;
    private boolean schedEvent;

    PartyBoat() {
        this("Fri - Sun 6 - until", 300, 10, false);
    }

    PartyBoat(String sched, int filled, int numStaff, boolean booked){
        super(in);
        schedule = sched;
        fullPassengers = filled;
        staff = numStaff;
        schedEvent = booked;
    }


/* Accessors -----------------------------------------*/
    public String getSchedule(){return schedule;}



/* toString ---------------------------------------------------*/
    public String toString(){
        return super.toString()+ "\n\nhello";
    }
}
