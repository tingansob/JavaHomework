import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kevin George Rusty
 *
 */
public class Ships {
	Util make = new Util();
	
/* Instance Variables-----------------------------------*/

	private String type;
	private String nickName;
	private String engine;
	private String natureOfWork;
	private int length;
	private int passengers;
	private int fuel;
	private int oil;
	private int numEngines;
	private boolean shorePower;
	private boolean springLine;
	private boolean bilgePump;
	private boolean underCommand;
	private boolean inspected;
	private boolean atAnchor;
	
/* Constructors---------------------------------------------*/
	
	Ships (){
		this("Catamaran", "Marina Vessel", "wind/diesel", "personal sailing", 7, 4, 6, 6, 0, false, false, false, false, true, true);	
		}


	Ships (String vType, String vNick, String vEng, String natureOW, int l, int p, int f, int o, int numEng, boolean sp, boolean sl, boolean bp, boolean uc, boolean ins, boolean aa){
		type = vType;
		nickName = vNick;
		engine = vEng;
		natureOfWork = natureOW;
		length = l;
		passengers = p;
		fuel = f;
		oil = o;
		numEngines = numEng;
		shorePower = sp;
		springLine = sl;
		bilgePump = bp;
		underCommand = uc;
		inspected = ins;
		atAnchor = aa;
	}

	Ships(Scanner in){
        System.out.println("Please answer the following questions");
		make.space();
		System.out.print("What type of ship is this? ");
		type = in.nextLine();
		System.out.print("Nick Name? ");
		nickName = in.nextLine();
		System.out.print("What powers this vessel? ");
		engine = in.nextLine();
		System.out.print("What is the nature of this vessels work? ");
		natureOfWork = in.nextLine();
		System.out.print("How long is the vessel (in meters)? ");
		length = in.nextInt();
		System.out.print("What is the passenger capacity? ");
		passengers = in.nextInt();
        in.nextLine();
        make.space();
		}
	




/* Accessors------------------------------------------------*/
    public String getType(){ return type; }
    public String getNick(){ return nickName; }
    public String getEngine(){ return engine; }
    public String getNOWwork(){ return natureOfWork; }

/* toString------------------------------------------------*/
	public String toString () {
		return "The " +nickName+ " is a  " +length+ " meter long " +type+ " used for " +natureOfWork+".\n" +
				nickName+ " can seat " +passengers+ " and is " +engine+ " powered.\n" ;
				
	}
} // END Ships class
