#include<iostream>
using namespace std;
int main()
{int n , data[100] , temp , swap;
 cout<<"\ndata points? ";
 cin>> n;
 for(int i=1;i<=n;i++)
   {cout<<"\ndata "<<i<<" ? ";
       cin>>data[i];}
 cout<<"\nUNSORTED: ";
 for(int i=1;i<=n;i++) cout<<data[i]<<" ";
 
 cout<<"\n . . . sorting now . . .\n";
 for(int pass=1;pass<=(n-1);pass++)
 {
       swap = 0;    
         for(int x=1;x<=(n-1);x++)
         {
                cout<<"\nPASS= "<<pass<<" index= "<<x
                           <<" data["<<x<<"] ("<<data[x]
                               <<") compared with data["<<x+1
                                   <<"] ("<<data[x+1]<< ")  ";  
                   if(data[x]>data[x+1])
                           {cout<<"SWAP needed!";
                                swap = 1 ;
                             temp=data[x];
                                data[x]=data[x+1];
                                data[x+1]=temp;
                            } //ending the if
                      
         }  // inner loop (each individual pass)
            if(swap==0) break;
              
 }  // repeat the process
 
 cout<<"\nSORTED: ";
 for(int i=1;i<=n;i++) cout<<data[i]<<" ";
 
 cout<<"\n\n";
 return 0;
}
