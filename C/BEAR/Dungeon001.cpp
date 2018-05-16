// Kevin George Rusty
#include<iostream>
#include<string>
#include<ctime>
#include<cstdlib>
using namespace std;

void intro();



int main() {


    srand(time(0));
    struct player {
        string name;
        int strength;
        int charisma;
        int speed;
        int bonus;
    };
    
    //
    //Variable Declarations
    string choice;
    string name;
    char ch;

    //
    // Monster array declarations
    player monster[50];
    for (int i=0; i<=5; i++) {
        monster[i].strength = rand()%10;
        monster[i].charisma = rand()%10;
        monster[i].speed = rand()%10;
        monster[i].bonus = rand()%5;
    }



    //
    //Character creation
    player self;
    self.name=name;
    self.strength= rand()%10;
    self.charisma= rand()%10;
    self.speed= rand()%10;
    self.bonus= rand()%5;

    do{


        cout<<"So, what shall I call you? ";
        cin>>name;
        intro();
        cin>>choice;

        cout<<"\n\nAwesome, I'm so glad you've choosen to take this adventure with me."
            <<"\n\n\nLet's ";


    }while (choice != "bye");



    cout<<"\n\n";
    return 0;
    
}// END main


void intro()
{
    cout<<"\n\nLong ago in a land far, far away, there was a great forest out on the edge of the city of Eldridge. Eldridge, home to a variety of friends and foes, has been over run by the most offensive monsters and you, our valiant warior, have been called upon to fight the monsters and return the town to the good people of Eldridge.\n\n)"
        <<"Legend states that there is one monster that is unusually difficult to kill. For that monster you will need to find the magic staff located somewhere in the forest. I'm sure you'll stumble across it in your travels so keep your eyes open\n\n"
        <<"Other than your dagger, you have on armor that makes it hard to do mortal damage with one blow, though your leather armor isn't very strong. I am told that somewhere out there is a shield and helmet that have magical powers, but beware, they are guarded by a beast so strong you may not survive...but if you do it will totally be worth it.\n\n"
        <<"Anyway, I could go on for hours, but that will keep you from your adventure. Are you ready to go? (go/bye)";
}
