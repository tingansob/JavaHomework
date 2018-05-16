#include<iostream>
#include<ctime>
#include<cmath>
using namespace std;

int main()
{
    int secretNum;
    int yourGuess;
    srand(time(0));
    secretNum=(rand()%100);

    do
    {
        cout << "\n\nWhat is your guess? ";
        cin >> yourGuess ;
        if(yourGuess<secretNum) cout << "\nHigher! " ;
        if(yourGuess>secretNum) cout << "\nLower! " ;
    } while (yourGuess != secretNum);
    cout << "\n\nYou finally got it!!";
    cout << "\n\n";
    return 0;
}
