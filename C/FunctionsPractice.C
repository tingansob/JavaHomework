// FUNCTIONS practice
#include<iostream>
using namespace std;

void NothingPassedOrReturned() ;

void NothingReturned(int) ;

int PassedAndReturned(int);

int main()
{
 int choice;
 do{cout<<"\n\n\nMENU\n----\n"
        <<"\n1.Print Stuff"
        <<"\n2.Square a number, print in function"
        <<"\n3.Square a number, print in main"
        <<"\n4.Quit\n\nYour choice? ";
    cin>>choice;
	if(choice==1) NothingPassedOrReturned() ;
	if(choice==2)
	     {int x;
	      cout<<"what number? ";
		  cin>>x;    
          NothingReturned(x) ;
         }
   if(choice==3)
	     {int x;
	      cout<<"what number? ";
		  cin>>x;    
          cout<<"\n\n"<<x<<" squared is "
		      <<PassedAndReturned(x);
         }    
    }while(choice!=4);
 cout<<"\n\n";
 return 0;
}

void NothingPassedOrReturned() 
     {
      for(int x = 1 ; x<=10 ; x++)
	     cout<<"This function just prints this message repeatedly\t";	
     }

void NothingReturned(int a) 
     {
     cout<<"\n\n"<<a<<" squared is "<<a*a;	
     }

int PassedAndReturned(int a)
     {
      return a*a;	
     }
     
