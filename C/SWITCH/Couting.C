#include<iostream>
using namespace std;
int main(){

    int count;
    int sum = 0;
    int factorial = 0;

    cout<<"Enter an ending number => ";
    
    cin >>count;

    for (int i = 0 ; i <= count; i++) { sum += i; }
    //for (int i = 0 ; i <= count; i++) { factorial *= i; }
    cout<<"The sum of all numbers from 1 to "<<count<<" is "<<sum;
    //cout<<"The sum of all numbers from 1 to "<<count<<" is "<<factorial;

    cout<<"\n\n";
    return 0;
}
