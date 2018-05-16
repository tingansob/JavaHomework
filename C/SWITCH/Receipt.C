#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int choice ;
 double pizza=3 , icecream=2.25 , soda=1 ;
 double cost = 0 , tip , tax , service ;
 cout<<fixed<<setprecision(2);
 do{
 	cout<<"\n\n\nMENU\n----\n1)Pizza $"<<pizza
 	    <<"\n2)Ice Cream $"<<icecream
 	    <<"\n3)Soda $"<<soda<<"\n4)ORDER DONE"
 	    <<"\n\nSelection? ";
 	cin>>choice;
	
	switch(choice) {
        case 1:
            cost = cost + pizza;
            cout<<"\n*************Pizza $"<<pizza
                <<"\n*************(total:"<<cost<<")\n";
            break;

        case 2:
            cost = cost + icecream;
            cout<<"\n*************Ice Cream $"<<icecream
                <<"\n*************(total:"<<cost<<")\n";
            break;
        case 3:
            cost = cost + soda ;
            cout<<"\n*************Soda $"<<soda
                <<"\n*************(total:"<<cost<<")\n";
            break;
    }
 
 }while(choice!=4);

 cout<<"\n\nTotal: $"<<cost;
 
 tax=cost*.08;
 cout<<"\nTax: $"<<tax;
 
 cout<<"\nTip ?  %";
 cin>>service;
 tip= cost*(service/100);
 cout<<"\nTip: $"<<tip;
 
 cout<<"\n\n*************SUBTOTAL: $"<<cost+tax+tip;  
 	
 cout<<"\n\n";
 return 0;
}
