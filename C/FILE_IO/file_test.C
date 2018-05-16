#include<iostream>
#include<fstream>
using namespace std;

int main(){
    string song;
    int choice;
    ofstream x;
    x.open("songlist.txt", ios::app);
    do{
        cout<<"\n1. Add new song to song list file"
            <<"\n2. Print Out my complete song list."
            <<"\n3. Quit"<<"\n\nYour selection? ";
        cin>>choice;

        if(choice==1){
            cout<<"What is the name of your song?";
            cin>>song;
            x << song;
        }
    }while(choice!=3);






    /*
    x.open ("Rusty.txt", ios::app);
    x << "\n";
    for (int i=1; i<=100;i++){
        x << i<<" ";
    }
  

    x << "\n\n";

    x.close();
    */




    cout<<"\n\n";
    return 0;
}
