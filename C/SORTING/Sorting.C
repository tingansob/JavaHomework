#include<iostream>
using namespace std;
int main(){
    int data[10] = {10, 9, 9, 7, 6, 5, 4, 3, 2, 1};
    int temp=0;

    cout<<"\nYour data is ";
    for (int i = 0; i<=9; i++){ cout<<data[i]<<" ";}

    // Bubble Sort
    for (int pass=0; pass <=8; pass++)
        for(int x=0; x<=8; x++)
            if(data[x]>data[x+1]) {
                temp = data[x];
                data[x]=data[x+1];
                data[x+1]= temp; }

    cout<<"\nYour sorted data is ";
    for (int i = 0; i<=9; i++){ cout<<data[i]<<" ";}





    cout<<"\n\n";
    return 0;
}
