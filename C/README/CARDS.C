#include<iostream>
#include<cstring>
#include<cstdlib>
#include<ctime>
using namespace std;
int main()
{int suit , card;
 char draw ;
 srand(time(0));
 
 while(true)
  {
   do{
   	 cout<<"\n\nready to draw a card? (y/n) ";
 	 cin >> draw ;
     }while(draw!='y');
   cout<<"\n\n";
   card=rand()%13+1;
   if((card>=2)&&(card<=10)) cout<< card;
   else if(card==1) cout<<" ace ";
   else if(card==11) cout<<" jack ";
   else if(card==12) cout<<" queen ";
   else if(card==13) cout<<" king ";  
   suit = rand()%4 ;
   if(suit==0)cout<<" of hearts";
   if(suit==1)cout<<" of clubs";
   if(suit==2)cout<<" of spades";
   if(suit==3)cout<<" of diamonds"; 
  }
 cout<<"\n\n";
 return 0;
}
