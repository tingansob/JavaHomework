#include<iostream>
using namespace std;
int main(){
    int castVote, tally=0, AE=0, IT=0, MO=0; 
    bool again;


    while (again){
        cout<<"\nEVOTE\n-----\n";
        cout << "1 - Michelle Obama\n2 - Ivanka Trump\n3 - Anyone Else\n4 - EXIT\n\nPlease Cast Your Vote  => ";
        cin >> castVote;
        if (castVote<1||castVote>4){ 
            cout << "\nINVALID ENTRY\fPlease limit selections to the candidates on the ballot\n "; 
        } else if (castVote==4) {
            again==false;
        } else if (castVote==1) { 
            MO++;tally++; 
        } else if (castVote==2) { 
            IT++;tally++; 
        } else if (castVote==3) { 
            AE++;tally++; 
        } 



    cout <<"1 = "<<MO<<"\n";
    cout <<"2 = "<<IT<<"\n";
    cout <<"3 = "<<AE<<"\n";
    cout <<"Total Votes Cast = "<<tally<<"\n";

    if (MO<)

    } //END while
    cout<<"\n\n";
    return 0;

}
