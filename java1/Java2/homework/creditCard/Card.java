/* Kevin George Rusty
 *
 *
Credit Card Class
Write a class named CreditCard that has (at least) the following member variables:
• name. A String that holds the card holder’s name.
• cardNumber. A field that holds the credit card number.
• balance. A double that stores the current credit card balance.
• spendingLimit. A double that stores the spending limit of the card holder.
• additional fields that you can think of.
In addition, the class should have (at least) the following member methods:
• Constructor. The constructor should accept the card holder’s name and card number and
assign these values to the object's corresponding member variables. The constructor
should initialize the spending limit to $2,000 and the balance to $0.
• Accessors. Appropriate accessor methods should be created to allow values to be
retrieved from an object's member variables.
• purchase. This method should add the amount specified as a parameter to the balance
member variable each time it is called, assuming the purchase does not cause the balance
to exceed the customer’s spending limit.
• increaseSpendingLimit. This method should increase the spending limit by $50 each
time it is called.
• payBill. This method should reset the balance to 0.
• toString. to render the state of a CreditCard as a String.
Input validation: Whenever a credit card number is modified, verify that it is of reasonable
length.
Demonstrate the class in a program that creates a CreditCard object and allows the user to
change and view the state of the credit card with a menu driven program.
1. View Card Information.
2. Purchase an Item: ask the user the purchase amount and increase the card balance
accordingly.
3. Pay Bill: call payBill method to set the balance to 0.
4. Increase Spending Limit: ask the user how much the spending limit should be, and call
the increaseSpendingLimit method the appropriate number of times.
Keep in mind: input and output should not be performed directly in the CreditCard class. All
input and output to the user should be done in the main method (or other methods that are in a
separate class) to increase flexibility of the classes we will design later on in this project.
*/
import java.util.*;
public class Card{
	public static void main(String[] args){
		// Variable declarations
		int choice = 0;
		int cartItem = 0;

		// Constructing instances of classes
		Scanner in = new Scanner(System.in);	// Scanner
		Util make = new Util(in);				// My personal Utilities
		CreditCard owner = new CreditCard("Kevin G Rusty", 10, .15 ); // establish first card
		// Pre existing Items for purchase
		//
		//Item[] shopping = new Item[25];			// Space for array of shopping items
		Item[] shopping;

		// present menu
		do {
			// Menu for Credit Card Management System
			make.space();
			System.out.println("Credit Card Management");
			make.border(21, '-');
			make.space();
			System.out.println("(1) Card info");
			System.out.println("(2) Purchase an Item");
			System.out.println("(3) Pay bill");
			System.out.println("(4) Exit");
			make.border(21, '-');
			make.space();

			// Get user input
			System.out.print("Please Select  -> ");
			choice = in.nextInt();
		   	make.space();
				
			if (choice == 1){
			   	cardInfo(owner); }
			
			if (choice == 2){
				System.out.print("How many itmes do you want to buy? ");
				int n = in.nextInt();
				shopping = new Item[n];
				for (int i=0; i<=n; i++)
				{

					shopping[i] = shopping();

				}
		   	}


		}while (choice != 4);
	} // END main
	

	public void buyItem(){
		System.out.println("owner");
	}
	public void  buyItem(Util make, Scanner in){
		int subChoice = 0;
	}
    public static void cardInfo(CreditCard cc){
	   	System.out.println(cc);
	}

    public static void cardInfo(CreditCard cc, Scanner in, Util make){
	   	System.out.println(cc);
	   	int choiceMod = 0;
	   	do {
			make.space();
		   	System.out.println("Modify card Below\n-----------------");
			System.out.println("(1) View General Card Info");
			System.out.println("(2) View  Limit ");
			System.out.println("(3) Modify ");
			System.out.println("(4) Modify ");
			System.out.println("(5) Exit to main menu");
			choiceMod = in.nextInt();
		}while (choiceMod != 3 );
   	}

   	public static double shop(Util make, Scanner in, CreditCard owner, Item shopping[]){
	   	int subChoice = 0; 
		double balance =  owner.getBalance();


	   	do {
		   	make.space();
			System.out.println("(1) Enter new Item for purchase."); 
			System.out.println("(3) Done adding items");
		   	make.space();
		   	subChoice = in.nextInt(); make.space();

			if (subChoice == 1){
				for (int i = 0; i<=3; i++){
					System.out.println(shopping[i]);
				}
			}

			if (subChoice == 2) { } 

		}while (subChoice != 3); 
		return balance;
	}

} // END class _EOF_ 
