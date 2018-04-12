/* Kevin George Rusty */
//temperature Converstion
#include<iostream>
using namespace std;

int main() {
    // function prototypes
    void CtoF();
    // @reference int - value of C
    void FtoC();
    // @reference int - value of F

    // variable declarations
    int choice =0;

    do { 
        cout<<"\n\nTemperature Conversion\n----------------------\n"
            <<"1) Fahrenheit to Celcius\n" 
            <<"2) Celcius to Fahrenheit\n"
            <<"3) Quit\n\n"
            <<"Your Choice => ";
        cin>>choice;


        if (choice==1){
            FtoC(); } 
        if (choice==2){
            CtoF();}


    } while (choice!=3);


    cout<<"\n\n";
    return 0;
}


void CtoF() {
    double temp, tempConverted;
    cout<<"\nDegrees C => ";
    cin>>temp;
    tempConverted=temp*1.8+32;
    cout<<"\n"<<temp<<" Celcius = "<<tempConverted<<" Fahrenheit.";
    cout<<"\n\n";
}

void FtoC() {
    double temp, tempConverted;
    cout<<"\nDegrees F => ";
    cin>>temp;
    tempConverted=(temp-32)*.5556;
    cout<<"\n"<<temp<<" Fahrenheit = "<<tempConverted<<" Celcius.";
    cout<<"\n\n";
}
