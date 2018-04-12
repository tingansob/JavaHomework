#include<iostream>
using namespace std;
int main(){

    void askUser(int&, char&);
    void FtoC(int);
    void CtoF(int);

    int temp;
    char sys;
    askUser(temp, sys);

    if (sys == 'f'){FtoC(temp);}
    if (sys == 'c'){CtoF(temp);}


    cout<<"\n\n";
    return 0;
}

void askUser(int& temp, char& sys){
    //do {
        cout<<"\nDegrees? ";
        cin>>temp;
        cout<<"\nIs that 'c' or 'f'? ";
        cin>>sys;
    //} while ((sys != 'c')&&(sys != 'f'));
}


void FtoC(int temp){ cout<<"\n"<<temp<<" F = "<<(temp-32)*.5556<<" C."; }

void CtoF(int temp){ cout<<"\n"<<temp<<" C = "<<temp*1.8+32<<" F."; }
