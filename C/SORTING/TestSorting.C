#include<iostream>
using namespace std;
int main()
{
    int data[10] = {10, 9, 83, 27, 16, 50, 42, 93, 12, 120};
    int tempData = 0;

    cout<<"\n";
    for (int i = 0; i<=9; i++)
        cout<<data[i]<<" ";


    cout<<"\n\n";
    for (int loop = 0; loop<=8; loop++)
        for (int x=0; x<=8; x++)
            if(data[x] > data[x+1])
            {
                tempData = data[x];
                data[x] = data[x+1];
                data[x+1] = tempData;
            }

    for (int i = 0; i<=9; i++)
        cout<<data[i]<<" ";




    cout<<"\n\n";
    return 0;
}
