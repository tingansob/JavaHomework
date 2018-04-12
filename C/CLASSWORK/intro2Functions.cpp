// Functions practice
#include<iostream>
using namespace std;


void squared(int);
void space(int x){for(int i=1;i<=x;i++) cout<<"\n"; }


int main(){
    int a;
    cout <<"\nWhat is x? ";
    cin  >>a;
    squared(a);


    space(4);
    return 0;
}// END main

/* @squared --- square value */
void squared(int value){
    cout <<"\n"<<value<<" squared is "<<value*value; 
} //END squared
