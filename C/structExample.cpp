#include<iostream>
using namespace std;
int main() {
    int x=437;
    int * p;
    p = &x ;
    *p = 12;
    cout<<"\nx= "<<x
        <<"\n&x= "<<&x
        <<"\np= "<<p
        <<"\n*p= "<<*p;

    cout <<"\n\n";
    return 0;
        
}
