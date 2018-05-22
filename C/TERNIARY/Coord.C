#include<iostream>
using namespace std;
int main(){

    int x, y;
    do {
    cout<<"Enter an X coord => ";
    cin>>x;
    cout<<"Enter a Y coord => ";
    cin>>y;


    ((x!=0)&&(x!=y))?

        cout<<"("<<x<<", "<<y<<") is not at the origin":
        cout<<"("<<x<<", "<<y<<") is at the origin";

    /*
    if ((x==0)&&(y==0)) {cout<<"At the origin";}
    else if (x==0) {cout<<"On the Y axis";}
    else if (y==0) {cout<<"On the X axis";}
    else if ((x>0)&&(y>0)) {cout<<"In quadrant I\n\n";}
    else if ((x<0)&&(y>0)) {cout<<"In quadrant II\n\n";}
    else if ((x<0)&&(y<0)) {cout<<"In quadrant III\n\n";}
    else if ((x>0)&&(y<0)) {cout<<"In quadrant IV\n\n";}
    */
    cout<<"\n";
    
} while (true);

    cout<<"\n\n";
    return 0;
}
