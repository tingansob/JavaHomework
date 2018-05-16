/*
 Kevin George Rusty


After student enters information present testing options
6 bug boxes

at Start of test all bug boxes illuminate red
User has option of saving work and returning later - save data and state
All tests marked red = incomplete

 for choice select appropriate test

 Display 9 possible solutions for bug
Have user select an answer and check for validity
IF selection is wrong incremet bug counter and display message.

*** FIND OUT what are the alternative teaching methods for distance/online learning that can augment the error checking portion of the app.



 IF bug was correctly fixed stop timer and make mark of correct answer and flip bug fix swithces to green.
 Offer user list of more bugs. 

*/
#include<iostream>
#include<fstream>
#include<cstring>

using namespace std;

bool bilge(string);
int main()
{
    string fname, lname, idNum;
    char takeTest = false;
    ofstream saveResults;
   // string fl;
    string StudentID(string, string, string);


    int choice = -1;
    cout<<"\n\n   Bug Boxes Main\n--------------------\n";
    cout<<"\n\n***TEST INSTRUCTIONS***\n\n"
        <<"\nAre you ready to begin? (y/n) => ";
    string again;
    getline(cin,again);
    takeTest = again.at(0);

    if (takeTest=='Y'||takeTest=='y'){
        cout<<"\nFirst Name? "; 
        cin>>fname;
        cout<<"Last Name? "; 
        cin>>lname;
        cout<<"Last 2 of EmplID? "; 
        cin>>idNum; 

/*TODO
     it would be nice to also get the following:
     - class 
     - section 
     - professor 
     That info shoulc be added as a heading on the output file
     in the file.
     It would also be cool to have the users selection append to the file name.  */

        saveResults.open(StudentID(fname, lname, idNum)+".txt", ios::app);

        cout<<"\nTest Started\n"; //include a timer
    } else { cout<<"\n\nThank you.\fGood Bye for now\n"; }



        /*
        do {
            cout<<"\nBilge menu goes here"
                <<"\n--------------\n"
                <<"\nStudent Name"
                <<"\nLast 4 of Student ID#"
                <<"\nReady to begin...";
            cout<<"\n\tMake sure to include a timer";
            cin>>choice;
            if(choice ==1 ){
            }

            //cout<<"Hello "<<lname<<idNum;
            //cout<<"\n\nfirst initial "<<fname.at(0);
            //string fl = fname.at(0);
            //cout<<"\n\n\t first initial "<<fname.at(0);
            fl = fname.at(0);

            cout<<fl;
            //lname = lname.tolower();
            //string tester = fl+lname+idNum;

            //cout<<"Welcome "<<tester;
            // figure out the getLine() here to get user full name

            // Open unique file for student using name & ID# as filename args use append to open file
        }while (choice != 0);
        */



    cout<<"\n\n";
    return 0;
}

string StudentID(string f, string l, string id){
    //f = f.at(0);
    string testing = f.at(0)+l+id;
    return testing;

}


