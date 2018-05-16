//Copyright (c) 2018 by haohua feng,fatmire kalila,ali zaka
#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
void loss();

int main()
{
	int hp=100,rt,s1,s2,s3;
	int i=0,num,guess,tries=0;
	char x;
	cout<<"\nYou wake up in a forest. You don't know what is going on.\nYou try to find a way out of the forest and keep walking on the path." 
	    <<"\nUnfortunately, you are surround by wolves!\nYou only have two chooses!\n1)Fight or 2)Flight\n";
	cin>>s1;
	if(s1==1) loss();
	if(s1==2)
	    {rt=hp-15;
		 cout<<"\nYour made it. Break through the siege of wolves. But you lost 15 hp.\nThe wolves are still chasing you. You come to the edge of the cliff."
	         <<"\nThere is a woodeb hut near by."
	         <<"\n  Cliff                Wooden hut"
			 <<"\n   (1)                     (2)\nYour Choose?";
		  cin>>s2;
		  if(s2==1){cout<<"\nYou try to jump to the other side, but fall in to the cliff";rt=0;}
		  if(s2==2){
		      {cout<<"\n\nHp remain"<<rt<<"\nYou come in front of the wooden hut.\n**(Hint:Make the right chooce to avoid the attack from the wolves!)**";
		       cout<<"\nWhat should you do?\n1)Check the door\n2)Check the windows\n";
		        cin>>s3;
			   if(s3==1)
			   {cout<<"\nThe door is locked,but you bust down the door";i=i++;rt=rt-15;}
		       if(s3==2){cout<<"\nThe window is not lock. You open the windows and jump into the hut.";i=i++;rt=rt-0;}
		        
		      }
    cout<<"\n\nHp remain" <<rt;
    cout<<"\n\nYou get in the hut but you are bleeding. You need bandage. There are 10 First aid kits on the wall.\n**(There are 9 of them are empty)**";
    cout<<"\n**(Every one wrong selection will let you lost 20hp!)**";
    cout<<"\nSelection(1-10)";
    srand(time(0));
    num=rand()%10+1;
    do{
    do{
    	cin>>guess;
    	if(num<guess)cout<<"\nThis one is empty.Select another one\n";
    	if(num>guess)cout<<"\nThis one is empty.Select another one\n";
    	tries++;
		}while(guess!=num);
		cout<<"\nYou found it.\n"<<tries<<"tries";
		cout<<"\nYou lost "<<tries*20<<" hp";
		rt=rt-20*tries;
		cout<<"\nhp remain "<<rt;
		}while(hp<=0);
	}
		
		if(rt<=0)loss();
		if(rt>0)cout<<"\n\nYou Survived! End!"; }
 	                
	
return 0;
}
	
	
	
	void loss(){
	cout<<"\n You Lost\tGame Over!";

	}
