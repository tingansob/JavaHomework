#include<iostream>
using namespace std;
int main() {
    int x=12;
    int * j;
    j=&x;
    x = 12;

    *j = 300;

    cout<<"x= "<<x<<"\n"
        <<"&x= "<<&x<<"\n"
        <<"j= "<<j<<"\n"
        <<"*j= "<< *j;


    //cout <<" &x="<<&x<<" &y="<<&y;





    cout<<"\n\n";
    return 0;
}
