//C++ ADVENTURE!   Copyright(c) 2018 by
//Yongkun Li, Mikalai kamyshnikau, Argenis Cabada, Weibin Zhang
//"Choose the door at the hallway each door has its own adventure.
#include<iostream>
#include<cstring>
#include<ctime>
#include<cstdlib>
using namespace std;
void oceanSwim();
void casino();
void blueDoor();
void rollingDice();
void slotMachine();
void mine();
void building();
int main ()
{
	srand(time(0));
	int choice;
	string color, red, green, blue;
do{	cout<<"\n\nYou at a hallway!"
		<<"\nThere are three doors\n"
		<<"which one to choose?\n\n"
		<<"Red door is in front of you\n\n"
		<<"Green door on the left\n\n"
		<<"Blue door on the right\n\n";  
	cin>>color;
	if(color=="red")oceanSwim();
	if(color=="green")casino();
	if(color=="blue")blueDoor(); 
}while(choice!=1);
	return 0;
}
void blueDoor()
{
	int game;
	char flag;
	do{cout<<"\n\nFortune test Game!\n Select? "
		<<"\n1)Mine"
		<<"\n2)Building\n";
	cin>>game;
	if(game==1) mine();
	if(game==2) building();
	cout<<"\nPlay again?(y/n)";
	cin>>flag;
	}while(flag=='y');
}
void oceanSwim()
{
	char answer;
	string yell;
	cout<<"Hello there!!!\n"
		<<"You have fallen into the Ocean!!!\n"
		<<"Good news: No sharks around!\n"
		<<"Hurry up! Swim to the shore, QUICKLY!!!\n"
		<<"Ohh, ..do you know how to swim?\n"
		<<"y/n?";
		cin>>answer;
		if(answer=='y'||answer=='Y')cout<<"Good for you!"; 
		if(answer=='n'||answer=='N'){
		cout<<"Yell \"HELP!!!\"\n";
		cin>>yell;
		if((yell=="HELP!!!")||(yell=="help!!!"))cout<<"\nGOOD!!! Lifeguards will help you soon!!!";}
		
		 
}
void casino()
{
	
	char choiceP;
	int choiceD;
	cout<<"Welcome to Casino!!!\n";
	cout<<"Do you want to play?\n";
	cout<<"Y/N?";
	cin>>choiceP;
	if(choiceP=='n'||choiceP=='N'){cout<<"If you change your mind, our door open for you 24/7!!!";}
	if(choiceP=='y'||choiceP=='Y'){cout<<" Rolling Dice(1) or Slot Machine(2)?\n";
		cin>>choiceD;
		if(choiceD==1)rollingDice();
		if(choiceD==2)slotMachine();}
			
	
}
void rollingDice()
{
int dice,n,choice;

srand(time(0));

do{
cout<<"Rolling dice how many times?";
cin>>n;
for(int x=1;x<=n;x++)
{dice=rand()%6+1;
cout<<"\nRolled: "<<dice<<" prize: ";
if(dice==1)cout<<"$1";
if(dice==2)cout<<"$2";
if(dice==3)cout<<"$3";
if(dice==4)cout<<"$4";
if(dice==5)cout<<"$5";
if(dice==6)cout<<"$6";}
	
}while(choice==1);	 
}
void slotMachine()
{
	string slotR1[100];
	string slotR2[100];
	string slotR3[100];
	int slot1,slot2,slot3,times;
	char answer;
	cout<<"How many times do you want to play?";
	cin>>times;	
	for(int i=0;i<times;i++){
	
	slot1=rand()%23+1;
	slot2=rand()%23+1;
	slot3=rand()%23+1;
	if(slot1==1){cout<<"BAR";slotR1[i]="BAR";}
	if(slot1>1&&slot1<=3){cout<<"777";slotR1[i]="777";}
	if(slot1>3&&slot1<=6){cout<<"Cherry";slotR1[i]="Cherry";}
	if(slot1>6&&slot1<=10){cout<<"Orange";slotR1[i]="Orange";}
	if(slot1>10&&slot1<=15){cout<<"Banana";slotR1[i]="Banana";}
	if(slot1>15&&slot1<=23){cout<<"Lemon";slotR1[i]="Lemon";}
	
	if(slot2==1){cout<<"BAR";slotR2[i]="BAR";}
	if(slot2>1&&slot2<=3){cout<<"777";slotR2[i]="777";}
	if(slot2>3&&slot2<=6){cout<<"Cherry";slotR2[i]="Cherry";}
	if(slot2>6&&slot2<=10){cout<<"Orange";slotR2[i]="Orange";}
	if(slot2>10&&slot2<=15){cout<<"Banana";slotR2[i]="Banana";}
	if(slot2>15&&slot2<=23){cout<<"Lemon";slotR2[i]="Lemon";}
	
	if(slot3==1){cout<<"BAR";slotR3[i]="BAR";}
	if(slot3>1&&slot3<=3){cout<<"777";slotR3[i]="777";}
	if(slot3>3&&slot3<=6){cout<<"Cherry";slotR3[i]="Cherry";}
	if(slot3>6&&slot3<=10){cout<<"Orange";slotR3[i]="Orange";}
	if(slot3>10&&slot3<=15){cout<<"Banana";slotR3[i]="Banana";}
	if(slot3>15&&slot3<=23){cout<<"Lemon";slotR3[i]="Lemon";}

	if((slotR1[i]=="BAR")&&(slotR2[i]=="BAR")&&(slotR3[i]=="BAR")){cout<<"You have won $1,000,000";}
	if((slotR1[i]=="777")&&(slotR2[i]=="777")&&(slotR3[i]=="777")){cout<<"You have won $10,000";}
	if((slotR1[i]=="Cherry")&&(slotR2[i]=="Cherry")&&(slotR3[i]=="Cherry")){cout<<"You have won $999";}
	if((slotR1[i]=="Orange")&&(slotR2[i]=="Orange")&&(slotR3[i]=="Orange")){cout<<"You have won $100";}
	if((slotR1[i]=="Banana")&&(slotR2[i]=="Banana")&&(slotR3[i]=="Banana")){cout<<"You have won $50";}
	if((slotR1[i]=="Lemon")&&(slotR2[i]=="Lemon")&&(slotR3[i]=="Lemon")){cout<<"You have won $5";} cout<<endl;}
}
void building()
 {
 	int floor;
 	char sel;
 	int chance;
 	floor=rand()%15+1;
 	cout<<"\nYou're on "<<floor<<" floor(s)!"
 		<<"\nDo you want to jump or go back?(j/b)";
 	cin>>sel;
 	if(sel=='j')
 	{
	 if(floor>3)
	 {
	 	chance=rand()%5;
	 	if(chance!=0) cout<<"\nYou're dead!";
	 	else cout<<"\nYou're lucky enough. ";
	 }
	 else 
	 {
	 	chance=rand()%5;
	 	if(chance!=0) cout<<"\nNot bad, you're survived";
	 	else cout<<"\nHead to the ground, you have been killed!";
	 }
	
		
	}
	if(sel=='b') 
	{chance=rand()%2;
		if(chance==0)
	 	{cout<<"\nOMG! ";
		 mine();
		}
		else cout<<"\nGood choice";
	}
 		
 }	
 void mine()
 {	
 	char sel;
 	int line;
 	int run;
 	cout<<"\nYou stepped on a mine.."
 		<<"Do you want to disassemble it or run away?(d/r): ";
 	cin>>sel;
 	if(sel=='d') 
	{cout<<"\nWhich line do you want to cut?(1/2): ";
	 cin>>line;
	 int chance=rand()%2+1;
	 if(line==chance) cout<<"\nYou have been killed!";
	 else cout<<"\nYou're lucky enough.";
	
	}
	if(sel=='r')
	{int chance=rand()%4;
	 if(chance==0) cout<<"\nYou're lucky enough. ";
	 else cout<<"\nYou have been killed!"; 
	}
		
 }



