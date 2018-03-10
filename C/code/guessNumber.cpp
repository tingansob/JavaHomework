// Keivin George Rusty
#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main()
{
    srand(time(0));
    int sn=6, tally=0, guess;
    sn=rand()%100+1;

    do{
        cout << "\n\nWhat's your guess? ";
        cin >> guess;
        if (guess<sn) cout <<"\nHigher!!";
        if (guess>sn) cout <<"\nLower!!";
        tally++;
    }while(guess!=sn);

    cout << "\n\nYou got it";
    cout << "\n\nIt only took you "<<tally<<" guess(es) to figure it out.";
    cout << "\n\n";
    return 0;
}
