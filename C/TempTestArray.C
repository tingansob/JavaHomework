#include<iostream>
using namespace std;
int main(){
    char again = 'y';
    int choice;
    int count;
    int daysTemp;
    int runningTotal=0;
    int min = 999;
    int max = 0;
    int maxX=0; 
    int minX = 0;

    do{

        cout<<"Days to track? ";
        cin>>count;
        int temps [count];
        for (int i=1; i<=count; i++){
            cout<<"Day "<<i<<"? ";
            cin>>daysTemp; 
            runningTotal += daysTemp;
            if (daysTemp > max){ max = daysTemp; maxX=i; }
            if (daysTemp < min){ min = daysTemp; minX=i; }
        }
        cout << "\nAverage Temp "<<runningTotal/count<<".\n";

        cout << "Min temp of "<<min<<" on "<<minX<<" day.\n";
        cout << "Max temp of "<<max<<" on "<<maxX<<" day.\n";

        cout<<"Go again? ";
        cin>>again;

    }while (again=='y');





    cout<<"\n\n";
    return 0;
}
