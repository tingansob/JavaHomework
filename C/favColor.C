#include<iostream>
#include<cstring>
using namespace std;
int main() {
    do {
    string favColor;
    cout << "\n\nWhat is your favorite color? ";
    cin >> favColor;

    for (int i=0;i<=favColor.length()-1;i++)
        cout <<"\n color["<<i<<"] = "<<favColor[i];

    cout <<"\n";

    cout <<"\n"<<favColor<<" Well, "<<favColor<<" backwards is: ";
    for (int i=favColor.length()-1;i>=0;i--)cout<<favColor[i];


    } while (true);
    cout <<"\n\n";
    return 0;


}
