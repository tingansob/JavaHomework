//Copyright (c) 2018 by KagnaKellyPatapauAnas
//Dmitriy Kagno
//Jon-Paul Kelly
//Yauheni Patapau
//Mirza Anas
#include<iostream>
#include<stdlib.h>
#include<stdio.h>
#include<ctime>
using namespace std;

double hp = 100; //att = 5+rand()%5 , def = 5+rand()%5; 
int moved = 0;
char input[256];

bool gameOver();
void getEvent(int,int);

void getFruit(int);
void getTree(int);
void getDeer(int);
void getCougar(int);
void getBear(int);
void getStream(int);
void getCabin(int);
void getTrap(int);
void getCamp(int);
void getSnake(int);
void getMan(int);
void getPond(int);

int main(){
	srand(time(0));

	cout << "\nYou find yourself at the entrance of a forest.";
	while ( true ){
		cout << "\n\nHP:  " << hp; //<< "\nAtt: " << att << "\nDef: " << def;
		cout << "    Distance:  " << moved;
		cout << "\nMove forward?(y/n) ";
		cin >> input;

		if (input[0] == 'y' || input[0] == 'Y'){
			getEvent(rand()%6+1,rand()%6+1);
		} else if (input[0] == 'n' || input[0] == 'N'){
			if (gameOver()) continue;
			break;
		} else {
			cout << "Invalid input";
		}
		
		if(hp <= 0){
			if (gameOver()) continue;
			break;
		}
	}	
	return 0;
}

void getEvent(int fDice, int sDice){
	cout << "\n\nDice Roll:  " << fDice << "  " << sDice 
		 << "\nYou move " << fDice+sDice << " spaces.";
 	moved = moved + fDice + sDice;

	cout << "\n\n\nYou walk for half a day....";
 	int randChance = rand()%3;
 	int rEvent = fDice+sDice+randChance;
	if (rEvent == 2) 		getCougar(randChance); //Cougar
	else if (rEvent == 3)	getCabin(randChance); //Cabin
	else if (rEvent == 4)	getPond(randChance); //pond
	else if (rEvent == 5)	getSnake(randChance); //snake
	else if (rEvent == 6)	getCamp(randChance); //Campsite
	else if (rEvent == 7)	getTree(randChance); //Fallen Tree
	else if (rEvent == 8 || rEvent == 9)
							cout << "\nBut nothing happened\n";
	else if (rEvent == 10)getFruit(randChance); //Fruit
	else if (rEvent == 11)getStream(randChance); //Stream
	else if (rEvent == 12)getDeer(randChance); //Deer
	else if (rEvent == 13)getTrap(randChance); //Trap
	else if (rEvent == 14)getMan(randChance); //Deadman
	else if (rEvent == 15)getBear(randChance); //Bear

}

bool gameOver(){
	system("cls"); //on windows
//	system("clear"); //on linux
	cout << "\nYou travelled "<< moved << " space(s)."
		 << "\nTry Again?(y/n) ";
	cin >> input;
	if (input[0] == 'y' || input[0] == 'Y') {
		hp = 100;
		//att = 5+rand()%5;
		//def = 5+rand()%5; 
		moved = 0;
		system("cls"); //on windows
//		system("clear"); //on linux
		cout << "\nYou find yourself at the entrance of a forest.";
		return true;
	} else {
		return false;
	}
}

void getFruit(int randChance){
	cout << "\nYou've found some berries, ";
	if(randChance == 0){
		cout << "they're edible.\t+10 hp";
		hp+=10;
	} else if(randChance == 1){
		cout << "they're poisonous.\t-10 hp";
		hp-=10;
	} else {
		cout << "but nothing happened.";
	}
}

void getTree(int randChance){
	cout <<"\nYou find a fallen tree, ";
	if(randChance == 0){
		cout <<"you make a shield from its bark!\nYou feel stronger!";
	} else if(randChance == 1){
		cout <<"you use it to cross a chasm!";
		moved=moved+5;
	} else {
		cout <<"nothing interesting happens.";
	}
}

void getTrap(int randChance){
	cout <<"\nSNAP!!! A trap goes off!\n";
	if(randChance == 0){
		cout <<"It crushes your leg!\t-25hp";
		hp=hp-25;
	} else if(randChance == 1){
		cout <<"It's broken, you live another day.";
	} else {
		cout <<"Through deft skill you avoid the trap, congratulations.";
	}
}

void getBear(int randChance){
	cout <<"\nYou turn around and a bear is standing in front of you!";
	if(randChance == 0){
		cout<<"\nThe bear doesn't notice you, lucky.";
	} else if(randChance == 1){
		cout<<"\nYou flee at top speed.";
		moved=moved-7;
	} else {
		cout<<"\nYou get slashed! -75hp";
		hp=hp-75;
	}
}

void getPond(int randChance){
	cout <<"\nYou come across a small pond, ";
	if(randChance == 0){
		cout <<"you decide to bathe, you feel clean";
	} else if(randChance == 1){
		cout <<"you catch some fish! +15hp";
	} else {
		cout <<"your longtime fear of sharks repels you from the body of water.";
		moved=moved-10;
	}
}

void getStream(int randChance){
	cout <<"\nYou hear a stream nearby, ";
	if(randChance == 0){
		cout <<"you hazard a dip, and the river pulls you downstream! You've moved 15 spaces back";
		moved = moved-15;
	} else if(randChance == 1){
		cout <<"you slip on some wet rocks. -25hp, and your dignity";
	} else {
		cout <<"you walk along the stream. You move 10 spaces forward.";
		moved = moved + 10;
	}
}

void getSnake(int randChance){
	cout <<"\nSnakes, why'd it have to be snakes!\nA snake blocks your path.";
	if(randChance == 0){
		cout <<"\nYou stare intensely at the snake, nothing happens";
	} else if(randChance == 1){
		cout <<"\nIt strikes! -40hp.";
		hp=hp-20;
	} else {
		cout <<"\nYou kill the snake, and consume it. +15hp";
		hp=hp+15;
	}
}

void getDeer(int randChance){
	cout <<"\nYou see a deer on the trail ahead of you, ";
	if(randChance == 0){
		cout <<"you run after it and kill it, moving 10 spaces forward and gaining 20hp";
		moved = moved + 15;
		hp = hp + 20;
	} else if(randChance == 1){
		cout <<"it flees!";
	} else {
		cout <<"you try to chase it down, but its long gone, you move 20 spaces forward";
		moved = moved + 20;
	}
}

void getMan(int randChance){
	cout <<"The corpse of a man who met a fate much worse than yours is on the trail ahead of you ";
	if(randChance == 0){
		cout <<"you ransack his corpse, finding some beef jerky. +10hp";
		hp = hp + 10;
	} else if(randChance == 1){
		cout <<"an eerie noise can be heard in the distance, it scares you back.";
		moved = moved - 10;
	} else {
		cout <<"you contemplate your own mortality";
	}
}

void getCougar(int randChance){
	cout <<"\nThe bushes near you shake, a cougar attacks!";
	if(randChance == 0){
		cout <<"\nYour years in scouts haven't prepared you for this, you die.";
		hp = 0;
	} else if(randChance == 1){
		cout <<"\nYou sprint as far as you can in the other direction, moving 40 spaces back";
		moved = moved - 40;
	} else {
		cout <<"\nIt strikes! You take heavy damage!";
		hp = hp - 50;
		if(hp>0)cout <<"You live another day.";
	}
}

void getCamp(int randChance){
	cout <<"\nYou come across an abondoned camp, ";
	if(randChance == 0){
		cout <<"and find some food. +10hp";
		hp=hp+10;
	} else if(randChance == 1){
		cout <<"and take some long deserved rest. +20hp";
		hp=hp+20;
	} else {
		cout <<"and eat some spoiled food. -15hp";
		hp=hp-15;
	}
}

void getCabin(int randChance){
	cout <<"\nYou find an old cabin, ";
	if(randChance == 0){
		cout <<"its empty.";
	} else if(randChance == 1){
		cout <<"there's some food in the pantry";
		hp=hp+10;
	} else {
		cout <<"someone's left a stew on, you steal some.";
		hp = hp+10;
	}
}


