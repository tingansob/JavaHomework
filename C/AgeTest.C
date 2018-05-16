#include<iostream>
using namespace std;
int main(){

    int age;

    cout<<"What is your age? ";
    cin>>age;

    /*
    if (age>=18){
        cout<<"You have 0 years left to vote.";
    } else cout<<"You have "<<(18-age)<<" years left to vote";
    */

    int toVote = (age>=18 ? 0 : 18-age );
    cout<<"Wait "<<toVote<<" year(s) to vote";

    cout<<"\n\n";
    return 0;
}
