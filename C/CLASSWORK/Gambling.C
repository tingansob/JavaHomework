#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
    int roll, n, ones, twos, threes, fours, fives, sixes;
    srand(time(0));
    do { ones=twos=threes=fours=fives=sixes=0;
        cout<<"How many times to roll? ";
        cin>>n;
        for (int i=1;i<=n;i++){
            roll = rand()%6+1; 

        if (roll == 1){ones++;}
        if (roll == 2){twos++;}
        if (roll == 3){threes++;}
        if (roll == 4){fours++;}
        if (roll == 5){fives++;}
        if (roll == 6){sixes++;}
        

        cout<<"\n\nTally:\n\n"
            <<"\nOnes   : "<<ones
            <<"\nTwos   : "<<twos
            <<"\nThrees : "<<threes
            <<"\nFours  : "<<fours
            <<"\nFives  : "<<fives
            <<"\nSixes  : "<<sixes;
        }
    }while (true);



    cout<<"\n\n";
    return 0;
}
