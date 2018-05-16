import java.util.*;
public class Marina {

    private int numSlips = 8;
    private boolean slipsFull = false;

	public static void main(String[] args) {
        int numShips = 0;



        // create objects
		Scanner in = new Scanner(System.in);
		Util make = new Util();
        Ships demoBoat = new PartyBoat();
        Ships[] vessels = new Ships[20];
        Marina homeDock = new Marina();
		

        make.space();
        intro();
        System.out.println(homeDock);

        System.out.print("\nHow many ships would you like to dock in the marina? ");

        numShips = in.nextInt();
        in.nextLine();
        make.space(2);
        for (int i = 0 ; i < numShips ; i++)
        {vessels[i] = new Ships(in);}

        for (int i = 0 ; i < numShips ; i++)
        {System.out.println(vessels[i]);}



        System.out.println(demoBoat.getSchedule());


	} // END main

    // toString for Marina Class
    public String toString(){
        return "Hello from Marina";
            //private int numSlips = 8;
            //private boolean slipsFull = false;
    }

    // Methods
	public static String intro(Scanner in) {
		System.out.print("Please tell me your name => ");
		String name = in.nextLine();
		return name;
	}
     
    public static void intro() {
        System.out.println("Welcome to the Kingsboroug Student Marina");
        System.out.println("-----------------------------------------");
    }
	
} // END _EOF_

