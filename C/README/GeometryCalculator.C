//geometry solver
#include<iostream>
using namespace std;

void squares();
void rectangles();
void circles();

int main()
{
 int choice;
 do{
    cout<<"\n\nGEOMETRY\n---------\n"
        <<"\n1.Squares\n2.Rectangles"
        <<"\n3.Circles\n4.QUIT"
        <<"\n\nYour Selection? ";
    cin>>choice;
    if(choice==1) squares() ;
    if(choice==2) rectangles() ;
    if(choice==3) circles() ;
   }while(choice !=4);
 cout<<"\n\n";
 return 0;
}

void squares()
   {double s ;
    cout<<"\n\nSQUARES\n\nside length? ";
    cin>>s;
    cout<<"\nperimeter: "<<s*4
        <<"\narea: "<<s*s<<"\n\n";
   }
   
void rectangles()
   {double l,w;
    cout<<"\n\nRECTANGLES\n\nlength? ";
    cin>>l;
    cout<<"\nwidth? ";
    cin>>w;
    cout<<"\nperimeter: "<<l+l+w+w
        <<"\narea: "<<l*w<<"\n\n";
   }
   
void circles()
   {double r , pi=3.14159 ;
    cout<<"\n\nCIRCLES\n\nradius? ";
    cin>>r;
    cout<<"\ndiameter: "<<r*2
	    <<"\ncircumference "<<pi*r*2
        <<"\narea: "<<pi*(r*r)<<"\n\n";
   }
   
   
   
   
   
 
