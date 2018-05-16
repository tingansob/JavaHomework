/* Copyright (c) 2018 by arif mohammed  omar cortes*/ 


#include <iostream>
#include<cstring>
using namespace std ;
void west();
void east();
int main()
{ string name ;
 char play,cont,choose;
  cout <<" hello type your name to start the game : ";
  cin >> name;
  
	  do 
	    {
			  	cout <<" hello  "<< name <<" Press y to start : ";
			  cin >> play ;
	    }while (play != 'y');
  cout<<"\n\n you are alone in  abandond \n"
      <<"asylum in hope to communicate to dead relative \n"
      <<"through a ouija board \n"
      <<"the asylum was abandond 30 years ago \n"
      <<"and only thing that runs there  are \n"
      <<"spirits of the relatives \n";
   cout << "Press c to continue :  ";
  cin >> cont ;
  cout <<"\n\n"<< name <<"  enter the facility \n";
  cout <<"there are two sector you can explore \n"
       <<"west and east \n"
       <<"please choose one E OR W: ";
  cin >> choose ;
  if (choose == 'E' || choose == 'e') east();
  if (choose == 'W' || choose == 'w') west();
	
}
void east()

{ char var ;
cout<<"walks in and start exploring the sector \n"
      <<" he goes to 6 floor \n"
      <<" the 6 floor is full of lunatics\n"
      << "are you gonna run or face the lunatics \n"
      <<" chose run R or fight F \n";
  cin >> var;
  if (var == 'r') cout <<" you survived the lunatic ";
  if(var == 'f') cout << "you died !!";
}

void west ()

{
char var ;
cout <<"walks in and start explore the sector \n"
       <<"he encounter  lunatics and he get chase by them \n" 
       <<"hide or run ?   ";
 cin >> var ;
 if (var == 'h') cout << "he survived";
 if (var == 'r') cout << "he falls from building ";
 
}

