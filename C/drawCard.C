#include<iostream>
#include<cstring>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
    while(true) {
        int suit, value, card;
        char draw;
        srand(time(0));
        //for (int x=1;x<=100;x++) cout<<rand()%4<<" ";
        do{

            cout <<"\nReady to draw a card? ";
            cin >> draw;

        } while (draw!='y');
        cout << "\n\n";

        card=rand()%13+1;
        if((card>=2)&&(card<10)) cout << card;
        else if(card==1)cout<<" Ace ";
        else if(card==11)cout<<" Jack  ";
        else if(card==12)cout<<" Queen ";
        else if(card==13)cout<<" King ";



        suit = rand()%4;
        if(suit == 0 )cout<<" of hearts";
        if(suit == 1 )cout<<" of clubs";
        if(suit == 2 )cout<<" of spades";
        if(suit == 3 )cout<<" of diamonds";





    }

    cout << "\n\n";
    return 0;
}

