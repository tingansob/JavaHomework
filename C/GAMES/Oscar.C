//Text Adventure Copyright (c) 2018 by Oscar Martinez
#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;

int talk();
int fight();
int run();

int main() 
{
	char again;
	do 
	{
		char choice;
		cout<<"You are being mugged in a dark alley. What do you do?"
			<<endl<<"A. Talk"<<endl<<"B. Fight"<<endl<<"C. Run"<<endl;
		cin>>choice;
		cout<<endl;
		if (choice=='a' || choice=='A')talk(); 								//Starts 'talk' scenario
		if (choice=='b' || choice=='B')fight(); 							//Starts 'fight' scenario
		if (choice=='c' || choice=='C')run(); 								//Starts 'run' scenario
		cout<<endl<<"Play again? (Y/N)"<<endl;
		cin>>again;
	}while (again=='y' || again=='Y'); 										//Replay loop
}

int talk()		//Talk scenario. 
{
	int chance;
	char choice, choice2;
	srand (time(0));													//Random number generator for some choices.
	cout<<"Robber: Give me your money or else!"<<endl<<endl
		<<"A. Try to convice him it is not worth it."<<endl
		<<"B. Tell him you have no money."<<endl
		<<"C. Tell him you'll help him rob someone else."<<endl;
	cin>>choice;
	cout<<endl;
	if (choice=='a' || choice=='A')
	{
		chance=rand()%2+1;																											//Random number decides ending. Either 1 or 2 for this choice. Some choices have more randomness. 
		if (chance==1)cout<<"You: Listen, man. I've got no time for this. Let me go."<<endl<<"The mugger shoots you.";
		if (chance==2)cout<<"You: Is this what you want to do all your life? You're better than this."<<endl
						  <<"Robber: Y'know what, you right. I'm better than this."
						  <<"The robber leaves."<<endl;
	}
	if (choice=='b' || choice=='B')
	{
		cout<<"Robber: Okay then, give me your clothes."<<endl
			<<"A. No."<<endl
			<<"B. Okay."<<endl
			<<"C. How about I trade you my clothes?"<<endl;
		cin>>choice2;
		if (choice2=='a' || choice2=='A')cout<<"The robber shoots you and steals your clothes. He then washes the blood off when he gets home.";
		if (choice2=='b' || choice2=='B')cout<<"You strip and give the robber your clothes and he walks away. At least you didn't die, right?";
		if (choice2=='c' || choice2=='C')
		{
			chance=rand()%2+1;
			if (chance==1)cout<<"Robber: Hm... Okay."<<endl
							   <<"You and the robber part way with a new(?) set of clothes each.";
			if (chance==2)cout<<"Robber: How 'bout I shoot you and take your clothes?"<<endl
							  <<"You died AND lost your clothes";
		}
	}
	if (choice=='c' || choice=='C')
	{
		cout<<"Robber: Do you have any experience robbing people?"<<endl
			<<"You: My professor says I'm a fast learner."<<endl;
		chance=rand()%2+1;
		if (chance==1)cout<<"Robber: Fine, let's go, my protege."<<endl;
		if (chance==2)cout<<"Robber: Consider this your first and only lesson. Make your target listen to the guy the with the gun and give them no second chances."<<endl
					  	  <<endl<<"Your new professor demostrates what he means on you.";
	}
}

int fight() 	//Fight scenario
{
	int chance;
	char choice, choice2, choice3;
	srand (time(0));
	cout<<"Robber: Give me your money or else!"<<endl<<endl
		<<"A. 'Else what?' "<<endl
		<<"B. Punch him."<<endl;
	cin>>choice;
	cout<<endl;
	if (choice=='a' || choice=='A')
	{
		cout<<"Robber: What do you mean 'else what'? I have a gun, idiot."<<endl
			<<"A. 'So? I got these two!' (Kiss your biceps)"<<endl
			<<"B. Try to take his gun."<<endl;
		cin>>choice2;
		if (choice2=='a' || choice2=='A')
			{
			cout<<"Robber: You ain't gonna do anyth--"<<endl
				<<"A. Punch him"<<endl
				<<"B. Kick him"<<endl
				<<"C. Let him finish"<<endl;
			cin>>choice3;
			if (choice3=='a' || choice3=='A')cout<<"You caught him off guard and knocked him out. Nice.";
			if (choice3=='b' || choice3=='B')cout<<"You kick him in the groin and knocked him down."<<endl
												<<"You: I also got these two! (You kiss your legs and walk away from him"<<endl;
			if (choice3=='c' || choice3=='C')cout<<"Robber:...thing against a gun."<<endl
												<<"(The robber shoots you since you did nothing)"<<endl
												<<"Robber:See?"<<endl;
			}
		if (choice2=='b' || choice2=='B')
		{
			chance=rand()%2+1;
			if (chance==1)
			{
				cout<<"You manage to take his gun. What do you do now?"<<endl
					<<"A. Rob him."<<endl
					<<"B. Tell him to run away."<<endl;
				cin>>choice3;
				if(choice3=='a' || choice3=='A')cout<<"You robbed him and now you have $20. Dick move.";		
				if(choice3=='b' || choice3=='B')cout<<"The robber runs away and now you have a brand new gun.";
			}
			if (chance==2)cout<<"While wrestling him, the gun went off and hit both of you after ricocheting off the walls. What poor luck.";
		}				
		
	}
	if (choice=='b' || choice=='B')
	{
		chance=rand()%2+1;
		if (chance==1)cout<<"You catch the robber off guard and knock him out. Nice one.";
		if (chance==2)cout<<"You sucker punch the robber causing him to drop his gun. However, the gun goes off and hits you. At least you tried.";
	}
	
}

int run() //Run scenario
{
	int chance;
	char choice, choice2, choice3;
	srand (time(0));
	cout<<"Robber: Give me your money or else!"<<endl<<endl
		<<"A. Run away now."<<endl
		<<"B. Distract him."<<endl;
	cin>>choice;
	cout<<endl;
	if (choice=='a' || choice=='A')
	{
		chance=rand()%2+1;
		if (chance==1)cout<<"You managed to run away without getting shot.";
		if (chance==2)cout<<"While running away the robber shoots you in the leg and then robs you."<<endl
						  <<"Robber: You tried.";
	}
	if (choice=='b' || choice=='B')
	{
		cout<<"How do you distract him?"<<endl
			<<"A. 'The cops are behind you!'"<<endl
			<<"B. 'There's another robber behind you!'"<<endl
			<<"C. Sneeze on him."<<endl;
		cin>>choice2;
		if (choice2=='a' || choice2=='A')
		{
			chance=rand()%3+1;
			if (chance==1)cout<<"Robber: Nice try, idiot. I'm not fall--"<<endl
							  <<"A cop quietly rushes up behind him and knocks him out. Looks like you don't have to run away now.";
			if (chance==2)cout<<"Robber: Nice try, idiot. I'm not falling for that!"<<endl
							  <<"The robber shoots you. Dead end.";
			if (chance==3)cout<<"Robber: Huh?"<<endl
							  <<"The robber spots the cops and takes you hostage. Let's just say it doesn't end well for you.";
		}
		if (choice2=='b' || choice2=='B')
		{
			chance=rand()%4+1;
			if (chance==1)cout<<"A second robber comes up behind your robber and robs him."<<endl
							  <<"2nd Robber: You owe me one. Get outta here."<<endl;
			if (chance==2)cout<<"Your rubber spots the second robber and shoots him. You take this opportunity to run away."<<endl;
			if (chance==3)cout<<"A second robber comes up behind your robber and robs him."<<endl
							  <<"He then tries to rob you, but you're already long gone."<<endl;
			if (chance==4)cout<<"A second robber comes up behind your robber and robs him."<<endl
							  <<"He then robs you because you stood there watching."<<endl;
		}
		if (choice2=='c' || choice2=='C')
		{
			cout<<"Robber: What the hell?!"<<endl;
			chance=rand()%2+1;
			if (chance==1)cout<<"You sneezed on his gun and he dropped in disgust. You take the opportunity to run away. Gross. Nice, but gross.";
			if (chance==2)cout<<"You sneezed on his shirt and the robber shoots you in disgust."<<endl
				 			  <<"Robber: Ew!";
		}
	}				
}




