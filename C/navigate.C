#include<iostream>
#include<cstring>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
    while(true){
        int ftHrs=40, hrsW, oTime, numD;
        bool dep=(false), otH;
        double rate=18.28,
               ot=rate+(rate/2),
               ss=.06,
               fed=.13,
               state=.05,
               uDue=11.00,
               grossPay,
               netPay,
               ftPay=ftHrs*rate;



        cout << "How many hours worked? ";
        cin >> hrsW;
        
        if (hrsW>ftHrs)
        {
            oTime=hrsW-ftHrs ;
            double overTimePay=oTime*ot;
            grossPay=ftPay+overTimePay;
            cout << "Gross Pay of "<<grossPay<<" : "<<ftHrs<<" hours @ "<<rate<<"/hr\n";
            cout << "Including "<<overTimePay<<" : "<<oTime<<" hours @ "<<ot<<"/hr\n";
        } else if (hrsW<1) {
            cout << "That is not a valid answer, please try again.\n";
        } else if (hrsW<=ftHrs){ 
            grossPay=hrsW*rate;
            break;
            cout << "Gross Pay of "<<grossPay<<" for "<<hrsW<<" hours worked.\n";
        }



        cout << "How many dependents? ";
        cin >> numD;
    


 
    }
    cout<<"\n\n";
    return 0;
}

