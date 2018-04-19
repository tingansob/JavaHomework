#include<iostream>
using namespace std;

int a = 10, b = 20;
void Thing1 (int, int);

int main(){



    /*
    int x;
    int * y;
    x = 4;
    y = &x;
    *y = 7814;

    cout<<"\n x= "<<x
        <<"\n &x= "<< &x
        <<"\n y= "<< y  // set what's at *y addy to the mem address of 
        <<"\n *y= "<< *y
        ;
        */

    int b = 0 ;
    int e = 0 ;
    int r = 1 ;

    cout    <<  "\nBase? ";
    cin     >>b ;
    cout    <<  "\nExponent? ";
    cin     >>  e;

    for(int i=1;i<=e;i++) r=r*b;
    
    cout<<"\n\n"<<b<<" to the "<<e<<" is "<<r;




    cout<<"\n\n";
    return 0;
}

void Thing1 (int a, int b)
{}
