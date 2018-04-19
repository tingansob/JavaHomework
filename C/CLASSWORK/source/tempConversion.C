#include<iostream>
using namespace std;
int main(){

    void askUser(double&, char&);
    void FtoC(double);
    void CtoF(double);

    double temp;
    char choice;
    do{
        askUser(temp, choice);
        if ((choice == 'f')||(choice == 'F')){FtoC(temp);}
        if ((choice == 'c')||(choice == 'C')){CtoF(temp);}
        cout<<"\n\n";

    } while (true);

    cout<<"\n\n";
    return 0;
}

void askUser(double& temp, char& choice){
        cout<<"\nDegrees? ";
        cin>>temp;
        cout<<"\nIs that 'c' or 'f'? ";
        cin>>choice;

}


void FtoC(double temp){ cout<<"\n"<<temp<<" F = "<<(temp-32)*.5556<<" C."; }

void CtoF(double temp){ cout<<"\n"<<temp<<" C = "<<temp*1.8+32<<" F."; }
