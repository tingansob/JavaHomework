#include<iostream>
#include<ctime>
#include<string>

using namespace std;
int main(){
    int alive=25;
    char choice;
    srand(time(0));

    struct player{

        string name;
        int speed;
        int strength;
        int charisma;
    };

    player self;
    self.speed = rand()%10+1;
    self.strength = rand()%10+1;
    self.charisma = rand()%10+1;


    player 
    cout<<self.speed<<" "<<self.strength<<" "<<self.charisma;
    cout<<"\n\n";
    return 0;
}

