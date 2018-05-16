#include<iostream>
using namespace std;
int main()
{
    int choice = 0;
    int total=0;
    do{
        cout<<"\n\n   KBCC Bookstore\n-------------------"
            <<"\n\n(1) Notebook\t$1"
            <<"\n(2) Pen\t\t$5"
            <<"\n(3) Mug\t\t$3"
            <<"\n(4) Quit"
            <<"\n\nYour Selection => ";
        cin>>choice;
        
        if(choice == 1)total = total+1;
        if(choice == 2)total = total+5;
        if(choice == 3)total = total+3;

    }while (choice != 4);
    cout<<"Total = "<<total;



    cout<<"\n\n";
    
    return 0;
}
