#include<iostream>
#include<cstring>
using namespace std;
int main() {
    string name;
    cout << "\n\n";
    cout << "\nWhat is your name? ";
    cin >> name;
    cout << "\n\nHi "<<name<<" !!! ";
    cout << "\nInitial is: "<<name[0];
    cout << "\n";

    cout << "Reversed ";
    for(int i=name.length()-1;i>=0;i--){cout<< name[i];}


    cout << "\n\n";
    return 0;
}
