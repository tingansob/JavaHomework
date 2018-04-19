#include<iostream>
using namespace std;
int main() {

    struct Patient{
        string name; 
        int patientNo;
        char gender;
        string condition;
    };

    int choice, Pindex = 0;

    Patient regPat[100];


    do{
        cout<<"\n\n\n Patients\n---------------"
            <<"\n1. Add New Record"
            <<"\n2. Print All Records"
            <<"\n3. Quit\n\nSelection? => ";
        cin>>choice;

        if(choice == 1){
            cout<<"\nPatient "<<Pindex<<" Name? ";
            cin>>regPat[Pindex].name;
            cout<<"\nPatient ID number? ";
            cin>>regPat[Pindex].patientNo;
            cout<<"\nPatient gender? ";
            cin>>regPat[Pindex].gender;
            cout<<"\nPatient Condition? ";
            cin>>regPat[Pindex].condition;
            Pindex++;
        }

        if (choice == 2){
            cout<<"\n\nPatient Database\n----------------";
            cout<<"\nNAME\tID NUM\tGENDER\tCONDITIONS\n----\t------\t------\t---------\n";
            for(int i=1; i,i<=Pindex; i++) {
                cout<<regPat[i].name<<"\t"
                    <<regPat[i].patientNo<<"\t"
                    <<regPat[i].gender<<"\t" 
                    <<regPat[i].condition<<"\t"; }


        }
    }while (choice != 3);






    cout<<"\n\n";
    return 0;
}

