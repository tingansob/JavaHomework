// Kevin George Rusty

#include<iostream>
using namespace std;
int main() {
    int sn = 6, guess , tally = 0;

    do {
        cout << "\n\nWhat's your guess? ";
        cin >> guess;
        if (guess<sn) cout << "\nHigher!! ";
        if (guess>sn) cout << "\nLower!! ";
        tally++;
    } while(guess!=sn);

    cout << "\n\nYou got it!";
    cout << "\n\nAnd it only took you "<< tally <<" tries to figure it out.";
    cout << "\n\n";
    return 0;
}
