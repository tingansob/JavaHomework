#include<iostream>
using namespace std;
int main(){
    int points [100];
    int data;
    //char bar = "\u25A0";

    cout<<"\nHow many data points? ";
    cin>>data;
    for (int i=0; i<data; i++)
    {
        cout<<"Data Point "<<i<<"? ";
        cin>>points[i];
    }
    

    cout<<"\n\nData Values\n-----------\n";
    for (int i=0; i<data; i ++)
    {
        cout<<i<<": ";
            for (int j =0; j<=points[i]; j++) {cout<<"\u25A0";}
            cout<<"\n\n";
    }



    cout<<"\n\n";
    return 0;
}
