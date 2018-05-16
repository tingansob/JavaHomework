//Copyright (c) 2018 by Mohamed and Adan

#include <iostream>
#include <string> 
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

using namespace std;
// declaring function for hit power
//int power( int str, int def);

    int command;


class character
{
public:
    character();
    //~character();
    string name;
    float str;
    float def;
    float health;   // hit points
    float regen;    // health regen amount
    float roll;     // for random value
    float ouch;     // amount of attack damage
    float getAttack(character& opponent);
    float getHeal(void);
    void setRegen(float reg);
    bool IsAlive() const;
    //void setHeal(float healAmt);

private:


};

character::character()
{
    str = rand() % 30 + 5;
    def = rand() % 30 + 5;
    health = 100;
    //Output to check the constructor is running properly
    cout<< "Character has been created.\n";
}

bool character::IsAlive() const
{
    return health > 0.0f;
}

void character::setRegen( float reg )
{
    regen = reg;
}


float character::getAttack(character& opponent)
{
//defines the magnitude/power of attack
    //function shows how much damage is inflicted


    // ouch is how much damage is done
    roll = rand() % 20 + 1; // range between 1 &20

    if (roll <= 11)
    {
        ouch = str - (def /2);
    }

    else if ((roll <= 17) && (roll >= 12))
    {
        ouch = (str * 2) - (def / 2);
    }

    else if ((roll <= 20) && (roll >= 18))
    {
        ouch = (str * 3) - (def / 2);
        //cout << "CRITICAL HIT!!";
    }

    opponent.health -= ouch;

    return ouch;

}

float character::getHeal()
{
    //this is what happens when you chose to heal
    regen = rand() % 20 + 3;
    cout << "regen value= " << regen<< ".\n";
    health += regen;    
    return regen;
}
/*character::~character()
{
    str = 0;
    def = 0;
    health = 0;
    // Output to check the destructor is running properly
    cout << "Character has been destroyed\n";
} */


int main()
{
    srand(time_t(NULL));
    //Class objects
    character user, computer;
    //Hard code in a name for the computer's player
    computer.name = "ZOID\n";

    float attackDamage;
    float healthAdded;

    user.setRegen(42.0);

    //Recieve data for the user's player
    cout<< "Please enter a name for your character:\n";
    cin>> user.name;

    //Output name and stats to the user 
    cout<< "\nYour name is: " << user.name << endl;
    cout << "here are your statistics: \n"
        << "strength:   " << user.str << endl
        << "Defense:    " << user.def << endl
        << "Health:     " << user.health << endl;

    cout<< "oh no an oppenent appeared!!!\n";
        cout<< "you will have to fight him!" << endl<< endl;

    cout << "opponent's health: 100"  << endl;


    while (user.IsAlive() && computer.IsAlive())
    {
        cout << "Str: " << user.str << "\t"
            << "Def: " << user.def << "\t"
            << "Health: " << user.health << "\t"
            << "\n";

        cout << "what would you like to do: heal (1), attack(2), or run(3).\n";
        cin>> command;

        switch(command)
        {
        case 1 :

            healthAdded = user.getHeal();

            cout<< ""<<user.name <<" has regenerated " << healthAdded << " health.\n";

            break;

        case 2 :

            attackDamage = user.getAttack(computer);

            cout << "" <<user.name <<" did " << attackDamage << " damage to the opponent!\n";

            break;

        case 3:

            cout<< ""<<user.name<<" got away!\n";

            break;

        default:
            cout<< "Please enter a valid choice!";

        } //end switch
        cout<<"Play again ? " << endl;
        
    }
    return 0;

}
