//Copyright (c) 2018 by Jacob Khovov, Thomas Joy II, Patrick Ormerod
#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
void pulledover();
void license();
void comply();
void ticket();
void stepout();
void illegal();
void search();
main()
    {srand(time(0));
    char choice;
    cout<<"\nWelcome to Every Monday Morning\n-------------------------------";
    cout<<"\nYou are running late to work."
    <<"You are on the your last warning from your boss about tardiness."
	<<"\nYou can make on time if you speed while driving,"
	<<" but run the risk of being pulled over by the police. "
	<<"\nDo you speed? (y/n)";
	cin>>choice;
	if(choice=='y')pulledover();
	if(choice=='n')cout<<"\n\nYou get to work late. ";
	cout<<"\n\n";
	return 0;
    }
    void pulledover()
    {int p;
    p=rand()%4;
    if(p==0)cout<<"\n\nCongradulations! You lucked out and didn't get pulled over.\nYou made it to work just in time! ";
    if(p!=0){cout<<"\nYou got pulled over by the Police. ";license();}
    }
    void license()
    {char choice;
    cout<<"\n\nThe Officer asks you for your license and registration. Do you have them on you? (y/n) ";
    cin>>choice;
    if(choice=='y')comply();
    if(choice=='n')cout<<"\nSorry but you're going to have to tell your boss that you're not making it in to work\nbecause you're going jail. ";
    }
    void comply()
    {char choice;
    cout<<"\nDo you comply with the Officer? (y/n) ";
    cin>>choice;
    if(choice=='y')ticket();
    if(choice=='n'){cout<<"\nYou decide to tell the Officer to F**K Off. ";stepout();}
    }
    void stepout()
    {char choice;
    cout<<"\n\nThe Officer tells you to step out of your vehicle.\n Do you do so? (y/n) ";
    cin>>choice;
    if(choice=='n')cout<<"\nThe Officer tases you, then arrrests you and brings you to jail."
	<<"\nBetter call your boss because you're not making it to work today... ";
    if(choice=='y'){cout<<"\nYou are detained and searched. ";illegal();}
    }
    void ticket()
    {int t;
    t=rand()%2;
    if(t==0)cout<<"\nYou lucked out.\nThe Officer was in a good mood and let you off with only a warning."
    <<"\nHowever, you are now getting to work really late. ";
    if(t==1)cout<<"\nYou're not so lucky.\nIt's the end of the month and the Officer has to fill his Quota."
    <<"\nYou get a ticket for speeding AND are running really late to work. ";
    }
    void illegal()
    {char choice;
    cout<<"\nDo you have anything illegal on you? (y/n)";
    cin>>choice;
    if(choice=='y')search();
    if(choice=='n')cout<<"\nOfficer gives you a speeding ticket AND a summons for obstruction of justice.\nYou get to work really late. ";
    }
    void search()
    {int d;
    d=rand()%4;
    if(d==0)cout<<"\nYou lucked out and the Officer didn't check under the seat."
	<<"\nYou still are getting a ticket and a summons for obstruction of justice.\nAND you are now extremely late to work..."
	<<"\nBut hey, at least you still have your pot.";
	if(d!=0)cout<<"\nNot only are you getting a speeding ticket.\nBut your also getting a summons for obstruction of justice and going to jail."
    <<"Oh and you better call your boss, because you're not going to make it to work today...and maybe the rest of the week.";
    }
