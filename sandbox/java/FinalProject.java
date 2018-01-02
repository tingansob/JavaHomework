/* Final Project
Author:                 Kevin George Rusty
Date:                   December 2, 2017 */
import java.util.*;
public class FinalProject {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int proj, vote, value;
        System.out.println("Welcome to the Final Project\n");
        do{                                         // main app menu
            System.out.println(" 1 - EVote");
            System.out.println(" 2 - Bad Key Board");
            System.out.println(" 0 - exit\n");
            System.out.print("What is your selection: ");
            proj=in.nextInt();                      // verify that user entry is valid selection option
            if ( proj >= 0 && proj < 3 ) {          
                if ( proj == 1 ){
                    evote(in);
                } else if (proj == 2){
                    badKeyBoard(in);
                } space();
            } else {
                space();                            // error message for invalid project selection
                System.out.println("Selection out of range,\nplease enter a valid project ID");
                space();
            }
        } while ( proj != 0 ); {                    // gracefully exit application on sentinel 0
            space();
            System.out.println("Thank you for a great semester. ");
            space();
        }
    } // end main

    public static void evote(Scanner in) { 
        int vote, cast, hc = 0, dt = 0, bo = 0, it = 0, tvc=0, winner, tie; //create scanner method to take user data for both methods
        space();
        System.out.println("Welcome to EVote");
        do {
            vote = ballot(in);      // add 1 to tvc(total votes cast) each time a vote is entered
            if (vote < 5){          // incerment by 1 each candidate tally for votes cast
                tvc++;              // vote ++h
                if (vote == 1){
                    hc++;
                } else if (vote == 2){
                    dt++;
                } else if (vote == 3){
                    bo++;
                } else {
                    it++;
                }
            }
            if (vote <= 0 || vote > 5 ) {           // error message for votes outside range 1 -4 and sentinel of 5
                System.out.println("Invalid entry");
            } 
        } while (vote != 5); 
        space();
        tally(hc, dt, dt, bo, tvc); //display results of winner and total votes cast upon exit
    }
    
    public static void tally(int hc, int dt, int bo, int it, int tvc) {
        int winner = 0;                                                     // display tvc and calculate winner
        System.out.println("Total Number of Votes Cast: "+tvc);             // sort highest # votes cast
        System.out.println("\n Hillary Clinton "+hc+"\n Donald Trump "+dt+"\n Barak Obama "+bo+"\n Ivanka Trump "+it);
        space();
    }
    

    public static int ballot(Scanner in) {
        int vote;                                           // voting ballot using scanner input
        space();
        System.out.println("1 - Hillary Clinton");
        System.out.println("2 - Donald Trump");
        System.out.println("3 - Barak Obama");
        System.out.println("4 - Ivanka Trump");
        System.out.println("5 - Voting Complete");
        space();
        System.out.print("\tPlease enter # and press <enter> to cast vote: ");
        vote=in.nextInt(); 
        return vote;
    }
    
    /* bad key pad*/
    public static void badKeyBoard(Scanner in) {        
        int desiredTemp, temp;                          // get users input for desired temperature
        do{                                             
            desiredTemp=getTemp(in);

        }while (desiredTemp <0 || desiredTemp > 999 );  // set condition for sentinel and valid valie range
        if (desiredTemp != 0) {                         // 1 > temp > 1000 && 0 is exit value
            evaluate(desiredTemp);
        } else
        System.out.println("\n\t- 0 - OVEN OFF - 0 -\n");  // exit method on sentinel
        space();
    } // end badKeyBoard                    

    public static int getTemp(Scanner in) {
        boolean valid;                                  // get value for desiredTemp from user
        int desiredTemp;                                // verify number in proper temp range
                                                        // verify that number does not contain invalid digits (1, 4, 7)
        System.out.print("\n Please enter temperature setting: "); // calcuate & dispaly next high & low temps
        desiredTemp=in.nextInt();

        valid=verifyTemp(desiredTemp);

        if (valid != false) {
            return desiredTemp;
        } else do {
            System.out.println("\n  \""+desiredTemp+"\" is not within the valid temperature range,");
            System.out.println("\n Please enter a temperature from \"1 - 999\" or \"0\" to Shut off the oven.");
            System.out.print("\n Please enter temperature setting: ");   // if desiredTemp invalid get new temp
            desiredTemp=in.nextInt();
        } while (valid=verifyTemp(desiredTemp) == false);
        return desiredTemp;
    }

    public static boolean verifyTemp(int x) {   // test to see that number is within  proper range
        if (x < 0 || x > 999 ){
            return false;
        } else {
            return true;
        }
    }

    public static boolean evaluate(int temp) {
        int x, y, z, m;
        x = temp/100; y=(temp%100)/10; z=(temp%100)%10%10;  // evaluate individual digits of # for broken keys
                                                            // 235 / 100 = 2 and 235%100 =35 thus we can 
                                                            // break a 3 digit # into 3 parts and analyze each
        for (int i=7; i<1; i-=3) {
            if (x == i) {
                System.out.println(i);
                changeTemp(temp);
            } 
            else if (y == i) {
                System.out.println(i);
                changeTemp(temp);
            }
            else if (z == i) {
                System.out.println(i);
                changeTemp(temp);
            } else {
                System.out.println("Valid Temperature");
                return true;
            }
        }
        return false;

    }

    public static void changeTemp(int temp) {
        while (evaluate(temp)==false) {
            temp++;
        }

    }


    public static void space() { System.out.println(); }
} // end FinalProject _EOF_

