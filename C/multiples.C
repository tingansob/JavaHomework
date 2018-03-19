#include<iostream>
using namespace std;
int main(){

    cout << "\nX\tX*X\tX*X*X\n-\t---\t-----";
    for (int i=4;i<=9;i++) {
        cout << "\n"<<i<<"\t"<<i*i<<"\t"<<i*i*i;
    }
    cout << "\n";
    return 0;

}
