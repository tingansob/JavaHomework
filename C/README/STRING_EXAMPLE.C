#include<iostream>
#include<cstring>
using namespace std;
int main()
{string thing;
 cout<<"\nType any word ";
 cin>>thing;
 
 cout<<"\n\nThere are "<<thing.length()
     <<" letters in "<<thing;
     
 cout<<"\nFirst letter is "<<thing[0]    
     <<"\nLast letter is "
     <<thing[thing.length()-1];
cout<<"\nBackwards : ";

 for(int c=thing.length()-1 ; c>=0 ; c--)
    cout<<thing[c]; 

 cout<<"\n\n";
 return 0;
}
