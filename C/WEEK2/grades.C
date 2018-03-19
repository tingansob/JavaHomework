//Kevin George Rusty
#include<iostream>
using namespace std;
int main()
{
    int grade;
    do {
        cout << "\nPlease enter student grade or 101 to exit : ";
        cin >> grade;

    if (grade == 101) {cout<<"\n"; return 0; }
    if (grade < 65) { cout << "F\n"; } 
    else if (grade >=65 && grade <= 69) { cout << "D\n"; } 
    else if (grade >=70 && grade <=79) { cout << "C\n"; } 
    else if (grade >=80 && grade <= 89) { cout << "B\n"; } 
    else if (grade >=90 && grade <=100) cout << "A\n"; } 
    
    while (grade !=0);


    cout<<"\n\n";
    return 0;
}
