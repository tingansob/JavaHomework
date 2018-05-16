nclude<iostream>
#include<cstring>
#include<cstdlib>
using namespace std;

// BOOLS: 0 = playerName, 1 = shadyPlayer seen, 2 = hasSword, 3 = hasLilacs, 4 = tiedLifestone , 5 = inTown, 6 = inOutpost, 7 = inGrotto, 8 = deathFlag, 9 = inBlacksmith, 10 = inTailor, 11 = DoubleCheck, 12 = witsCheck
bool flags[13] = {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}; 
int inventoryFlag = 0;
string inventory[50];

int whereToGo();
void addToInventory(string);
void removeFromInventory(string);
void townCrier(string);
void blacksmith();
void tailor();
void grotto();
void outpost();
void inTown(int);
void openVendor();
void showInventory();
void hold();


int main()
{
	string playerName;
	int playerDirection;

	cout << "ENTER YOUR NAME: ";
	cin >> playerName;
	do{
	townCrier(playerName);
	playerDirection = whereToGo();
	inTown(playerDirection);
	

	}while (flags[8] == 0);

	return 0;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void inTown(int pDirection)
{
	flags[5] = 1;
	if (pDirection == 1) blacksmith();
	if (pDirection == 2) tailor();
	if (pDirection == 3) {flags[7] = 1; flags[6] = 0; flags[5] = 0; grotto();}
	if (pDirection == 4) {flags[6] = 1; flags[7] = 0; flags[5] = 0; outpost();}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
int whereToGo()
{
	int myNewDirection;
	if(flags[5] == 1) // If the player is in town..
	{
		if(flags[1] == 1) // if the player has encountered the shadyPlayer at the outpost yet..
		{
			cout << "\"I've seen a sketchy fellow hiding about..Keep your wits about you.\" - Town Crier";
			flags[12] = 1;
		}
		
		cout << "\nYou are in the center of town. There is a blacksmith to the North, a tailor to the South, a dangerous portal to the West just outside of town, and an outpost to the East. Where do you go?"
			 << "\n1. North \t2. South \t3. West \t4. East\nYour Choice: ";
		cin >> myNewDirection;
		flags[5] = 0; // we 'leaving' town in any of following cases
		if (myNewDirection == 1)  // if we're going to blacksmith
		flags[9] = 1; // set inBlacksmith true
		
		if(myNewDirection == 2) // if we're going to tailor
		flags[10] = 1; // set inTailor true
		
		if(myNewDirection == 3) // if we're going to the grotto
		flags [7] = 1; // setting inGrotto true.. maybe??++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		if(myNewDirection ==4) // if we're going outpost..
		flags[6] = 1; // setting inOutpost true
		return myNewDirection;
	}
	if(flags[6] == 1) // If the player is at the outpost..
	{
		cout << "\nYou are in the Eastern outpost. There is nothing but wilderness to the North, South, and East, and is unexplorable for now. What direction do you want to go?"
			 << "\n1. West\nYour Choice: ";
		cin >> myNewDirection;
		if (myNewDirection == 1)
		{
			flags[5] = 1; // sets the player's location to inTown since they are leaving the outpost.
			flags[6] = 0; // sets inOutpost to false since they are leaving
		}
	}
	if(flags[7] == 1) // If the player is at the grotto..
	{
		cout << "\nAfter flowing through portal space, you arrive at the Grotto. There are strange creatures afoot..\nFeeling unsafe, you waver for just a moment before fleeing back through the portal and running to town.";
		hold();
		flags[5] = 1; // we are returning to town after this
		flags[7] = 0; // we are leaving the grotto
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void blacksmith()
{
	system("cls");
	flags[9] = 1; // Sets inBlacksmith to true.
	int choice;
	cout << "\n\"Hi there. I am Jake the Blacksmith.\"";
	if (flags[2] == 0) // if the player hasn't received a sword yet..
	{
		cout << "\n\"I see you're new here. Take this sword.\"";
		flags[2] = 1;
		addToInventory("Sword");
	}
	cout << "\nWould you like to browse my wares?\n1. Yes\t2. No\nYour choice: ";
	cin >> choice;
	if(choice == 2) {flags[9] = 0; return;}
	else 
	{openVendor();}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void tailor()
{
	int choice;
	flags[10] = 1;
	system("cls");
	cout << "\n\"Welcome! I am Olga, a special tailor.";
	openVendor();
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void outpost()
{
	int choice;
	system("cls");
	flags[5] = 0; flags[6] = 1; flags[7] = 0; // setting player to inOutpost, and NOT inGrotto or inOutpost.
	cout << "\nYou head East out of town, towards an outpost.";
	if(flags[1] == 0) cout << "\nOn your way there, you noticed a shady person heading in to town.";
	cout << "\nArriving at the outpost, you see a lifestone. If you attune yourself with the lifestone, you will resurrect here if you die."
		 << "\nDo you want to attune to the lifestone?"
		 << "\n1. Yes\t2. No.\nYour Choice: ";
	cin >> choice;
	flags[1] = 1;
	if (choice == 1)
	{
		flags[4] = 1; // Ties you to the lifestone
		cout << "\nYou feel your soul intertwine with the magic of the lifestone.";
		hold();
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void grotto()
{
	int choice;
	flags[7] = 1; // enabling inGrotto, disabling inTown and inOutpost
	if(flags[7] == 1 && flags[3] == 0) // also checks to make sure you don't have lilacs already
	{
		cout << "\nIn front of you is a patch of flowers. They are lilacs. Do you loot some? Perhaps the tailor can use these to dye clothing."
			 << "\n1.Yes \t2. No\nYour Choice: ";
		cin  >> choice;
		if (choice == 1)
		{
			flags[3] = 1;
			addToInventory("Lilacs");
			cout << "\nContinue to the Grotto, or head back to town?\n1. Continue\t2. Go back to town\nYour Choice: ";
			cin >> choice;
			if(choice == 1) flags[7] = 1;
			if(choice == 2)
			{
				flags[7] = 0;
				flags[5] = 1;
				return;
			}
		}
		if (choice == 2)
		{
			cout << "You continue up the hill to the portal.";
			hold();
			flags[7] = 1;  flags[9] = 0;
			whereToGo();
		}
	}
	if(flags[7] == 1 && flags[3] == 1)
	{
		cout << "You continue up the hill to the portal.";
		hold();
		flags[9] = 0;
		whereToGo();
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void townCrier(string pName)
{
	system("cls");
	if(flags[2] == 0 && flags[11] == 0) // if the player has not received a weapon yet..
		{cout << "\n\"Welcome to Liaplandia, " << pName << ". I am the Town Crier. Let me know if you encounter any suspicious people. You can do whatever you like, but I suggest picking up a weapon at the blacksmith first.\"";
		flags[11] = 1;
		hold();}
	return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void addToInventory(string newItem) // add strings to the inventory array, increment the inventory number slot to place next item in. 0 is skipped.
{
	inventoryFlag++;
	inventory[inventoryFlag] = newItem;
	cout << "\n+++ " << newItem << " has been added to your inventory! +++\n";
	showInventory();
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void removeFromInventory(string remItem)
{
	int holdThis;
	cout << "\n--- " << remItem << " has been removed from your inventory! ---\n";
	for(int i = 0; i <= inventoryFlag; i++)
	{	if(inventory[i] == remItem) holdThis = i;}
	for(int i = holdThis; i <= inventoryFlag; i++) inventory[i] = inventory[i+1];
	inventoryFlag--;
	showInventory();
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void showInventory()
{
	cout << "\nYOUR INVENTORY:\n";
	for(int i = 1;i <= inventoryFlag;i++)
	cout << i << ". " << inventory[i] << endl;
	hold();
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void openVendor()
{
	int choice;
	//Tailor
	if (flags[10] == 1) // if inTailor is true..
	{
		if (flags[3] == 1) // if hasLilacs is true..
		{
			cout << "\n\"I see you have Lilacs! I can dye your clothes a beautiful purple color if you hand them over. What do you say? \n1. Yes\t2. No\nYour Choice: ";
			cin >> choice;
			if (choice == 1)
			{
				removeFromInventory("Lilacs");
				flags[3] = 0;
				cout << "\nThere! Now you have a beautiful purple outfit!";
				hold();
				flags[5] = 1; // in town
				flags[10] = 0; // out of shop
				return;
			}
			if (choice != 1)
			{
				cout << "\nThat's fine, no big deal. Just don't come crying to me when people insult your dull clothing!";
				hold();
				flags[5] = 1; // in town
				flags[10] = 0; // out of shop
				return;
			}
		}
		if (flags[3] == 0) // if you don't have any lilacs..
		{
			cout << "\nUnfortunately you're absolutely broke! But there is one way I can help you out... \nWould you mind getting me some Lilacs from out of town? They're just outside, to the West!\n1. Okay\t2. Walk away awkwardly";
			cout << "\nYour Choice: "; cin >> choice;
			return;
		}
	}
	//Blacksmith
	if (flags[9] == 1) // if inBlacksmith is true...
	{
		cout << "I don't have much for wares to be honest. This town is broke. We need more people to bring in supplies!";
		hold();
		flags[9] = 0; flags[5] = 1; // Since you're leaving the blacksmith, set it to false.
		return;
	}
}

void hold()
{
	string continues;
	cout << "\n\n\n\n\n\nPress 'k' to continue: ";
	cin >> continues;
}
