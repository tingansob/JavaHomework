#include<iostream>
#include<string>
using namespace std;
int main()
{
 struct employee
        { string name;
          int    id ;
          char   gender;
        };
 struct contractor
        { string name;
          int    id ;
          char   gender;
        };

 int choice , count=0 ;
 char t;
 employee fullTime[1000];
 employee contractor[1000];
 do{cout<<"\n\nHR Database\n-----------"
        <<"\n1)Add new employee"
        <<"\n2)Print Employee Database"
        <<"\n3)Go to All Contract employees"
        <<"\n4)Quit\n\nYour selection? ";
    cin>>choice;

	if(choice==1)
	   {count++;
	    cout<<"\nEmployee "<<count<<" name? ";
        cin.ignore();
        getline(cin,fullTime[count].name);
		//cin>> fullTime[count].name;
		cout<<"\nEmployee "<<count<<" ID ? ";
		cin>> fullTime[count].id;
		cout<<"\nEmployee "<<count<<" gender ? ";
		cin>> fullTime[count].gender;
		cout<<"\n\nDATABASE UPDATED \n\n";
	   }

	if(choice==2) {
        cout<<"Full Time (f) or Contractors (c) ";
        cin>>t;
        if (t=='f') { 
            cout<<"\n\n--FULL TIME-------------------------";
            cout<<"\n\nID\tgender\tName\n--\t------\t----";
            for(int i=1 ; i<=count ; i++)   
                cout<<"\n"<<fullTime[i].id
                    <<"\t"<<fullTime[i].gender
                    <<"\t"<<fullTime[i].name;
            cout<<"\n\n------------------------------------"; }

        if (t=='c') {
        cout<<"\n\n--CONTRACTORS----------------------";
	    cout<<"\n\nID\tgender\tName\n--\t------\t----";
	    for(int i=1 ; i<=count ; i++)   
		 cout<<"\n"<<contractor[i].id
		     <<"\t"<<contractor[i].gender
		     <<"\t"<<contractor[i].name;
		 cout<<"\n\n------------------------------------"; }

	   }

    if(choice==3)
    {
        cout<<"Transferring all Full Time Employees to contractors. ";
        for (int i=1;i<=count; i++ ){ contractor[i].name = fullTime[i].name; contractor[i].id = fullTime[i].id;
            contractor[i].gender = fullTime[i].gender;
            cout<<"\nClearing Full Time Records";
            fullTime[i].name = " ";
            fullTime[i].id = 0;
            fullTime[i].gender = ' ';
            cout<<"\nDone\n";
           

        }

    }
   }while(choice!=4);

 cout<<"\n\n";
 return 0;
}
