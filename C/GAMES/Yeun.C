//Copyright (c) 2018 by Kai Yuen Kennith Chan, HuaBin.Liang, Jiajin Lao
#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

void a();
void b();
void c();

int main()
{  
    char choose1;
    srand(time(0));
    double rolll;
    cout<<"\n Yor are on the way to KBCC.";
//------------------------------------------------------------------------  
do{
	rolll=rand()%4+1;
    if(rolll==1)cout<<"\n A professor ";
    if(rolll==2)cout<<"\n A police ";
    if(rolll==3)cout<<"\n A beggar ";
    if(rolll==4)cout<<"\n A beggar ";
    cout<<"attacks you!";
    if(rolll==1)a();
    if(rolll==2)b();
    if(rolll==3)c();
    if(rolll==4)c();
    
    }while(true); 
}
/////////////////////////////////////////////////////////
    void a(){
    char choose1;
    double roll;
    char o;
    srand(time(0));
    roll=rand()%100;
    cout<<"\n Fight(F) or run(Z)";
    cin >>choose1;
    if(choose1 =='f') {cout <<"\n You have "
                            <<roll
					     	<<" % to win!"
                            <<"\n continue? Y/N";
    cin>>o;
    if(o=='n') cout<<"\n you survived!\n\n";
    if(roll>=60&&o=='y') cout<<"\n you win!\n\n";
    if(roll<=60&&o=='y') cout     <<"\n you died!\n\n";}								  
	if(choose1 =='z') {cout  <<"\n You have "
                             <<roll
						     <<" % to run!"
                             <<"\n continue? Y/N";
    cin>>o;
    if(o=='n')           cout<<"\n you died!\n\n";
    if(roll>=50&&o=='y') cout<<"\n you survived!\n\n";
    if(roll<=50&&o=='y') cout<<"\n you died!\n\n";}
}
    void c(){
	int food;
    char choice , feed , donate ;
    cout << "\n What do you want to do ?\n Feed(f) or donate(d) ?";
    cin  >> choice ;
    if(choice=='f') 
    cout << "\n You have only one piece of your favorite chocolate, and you gave him, he appreciated it.\n";
    if(choice=='d'){
    cout << "\n You have only one dollar in your pocket, do you want to donate?(Yes/No)";
    cin  >> choice;
    if(choice=='y') cout << "\nThe begger return you a big smile and wish you have a good day.\n";
    else cout <<"\n The begger kicked you and robbed your one dollar!!!\n";
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void b(){
	char b;
    double k;
    char x; 
    double roll;
    char l;
    srand(time(0));
	roll=rand()%100 +1;
    cout<<" police arrest you!!";
    cout<<"\n Struggle against police(a) or stand compliantly (s)\n";
    cin>>x;
    if(x=='a'){cout<<"\nYou have"
	               <<roll
				   <<" % to get killed"
                   <<"\n continue? y/n";
    cin>>b;
    
    if(roll>=70&&b=='y') cout<<"\n you died\n\n";
    if(roll<=70&&b=='y') k++ ;}
    
    if(x=='s'){cout <<"\n You have "
	                <<roll
					<<" % to jail"
	                <<"\n continue? y/n";
	cout<<"\n";
    cin>>l;
    if(roll>=60&&l=='y') cout<<"\n You are arrested\n\n";
    if(roll<=60&&l=='y') l++ ;}
    if(l=='n') cout<<"Do you want to run away? Y/N"; 
    if(l=='y'){cout <<"\n You have "
	                <<roll
					<<" % to save your life"
	                <<"\n continue? y/n";}
    cin>>l;
    if(roll>=50&&l=='y')
    cout<<" You save your life!\n";
    else cout<<" Police killed you..\n";
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


