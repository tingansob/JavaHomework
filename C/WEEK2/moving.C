//#include<windows.h>
#include<iostream>
#include<curses.h>
#include<cstdlib>
using namespace std;

void Coordinate(int x1,int y1)  
{
     COORD pos = {x1,y1};   
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), pos);   
    cout<<"X";
} 

int main()
{
    int x,y;
    
 l1: for(int x = 1 ; x<=10 ; x++)
        for(int y = 1 ; y <= 10; y++)
           {
           Coordinate(x,y);
           cout<<"X";
           for(int delay=1;delay<=10000000;delay++);
           }
    for(int x = 10 ; x>=1 ; x--)
        for(int y = 10 ; y >= 1; y--)
           {
           Coordinate(x,y);
           cout<<".";
           for(int delay=1;delay<=100000000;delay++);
           }
    goto l1;       
    return 0;
}
    
