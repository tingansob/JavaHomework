#include<iostream>
using namespace std;

int main(){

    /*

int a[5]={12,3, 96,67,1};
int * ptr;
ptr = a ;

 cout <<*(ptr+3);

*/ 

    do {
 int x, y;
 cout<<"\nWhat is X? ";
 cin>>x;
 cout<<"\nWhat is Y? ";
 cin>>y;




 ((x==0)&&(y==0))?
     cout<<"\n("<<x<<","<<y<<")"<<" is at the Origin ":
     cout<<"\n("<<x<<","<<y<<")"<<" is not at the origin";
 
 ((x<0)&&(y<0))?
     cout<<"\n("<<x<<","<<y<<")"<<" is in quadrant III":
     cout<<"\n("<<x<<","<<y<<")"<<" is in quadrant I";
 ((x>0)&&(y<0))?
     cout<<"\n("<<x<<","<<y<<")"<<" is in quadrant II":
     cout<<"\n("<<x<<","<<y<<")"<<" is in quadrant IV";

}while (true);

 cout<<"\n\n";
 return 0;
 }
