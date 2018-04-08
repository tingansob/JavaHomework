/*
   Kevin George Rusty
*/
#include<iostream>
#include<iomanip>
using namespace std;

int main(){
    // Variabbles
    double burger=5.00,
           frank=3.00,
           fries=2.50,
           soda=1.25,
           total=0.00,
           taxes=0.08877, //taxes at 8.877%
           tip12=.12,
           tip15=.15,
           tip20=.2;

    int order=0, b=0, f=0, ff=0, s=0;
    bool done=(false);

    // set spacing for 2 decimal places.
    cout << fixed << setprecision(2);

    // start menu presentation
    while (done!=true) {
        cout<<"\n------------\n Lunch Menu\n------------\n";
        cout<<"1 - Burger\t$"<<burger<<"\n"
            <<"2 - Hot Dog\t$"<<frank<<"\n"
            <<"3 - Fries\t$"<<fries<<"\n"
            <<"4 - Soda\t$"<<soda<<"\n"
            <<"5 - Done\n"
            <<"\nPlease select an item from the menu: ";
        cin >> order; // get user order

        // increase count of item purchased and increase total
        if(order==1){
            total = total+burger;
            b++;
            cout<<"\n\tBurger added to order\n";}
        else if (order==2){
            total = total+frank;
            f++;
            cout<<"\n\tHot Dog added to order\n";}
        else if (order==3){
            total= total+fries;
            ff++;
            cout<<"\n\tFrench Fries added to order\n";}
        else if (order==4){
            total=total+soda;
            s++;
            cout<<"\n\tSoda added to order\n";}
        else if (order==5){
            done=true;
            cout << "\n\tThank you for your order!\n\n"; }
        else if ((order<1)||(order>5)){
            cout<<"Sorry, "<<order
                <<" is not on the menu.\nPlease select from the menu.\n"; }
    } // END while loop (Menu presentation)

    // presentation of itemized list
    cout<<"---------------------------------------"
        <<"\n"<<b+f+ff+s<<" Items Ready For Pickup\n";
    cout<<"---------------------------------------\n";

    // Display itemized list only of items ordered
    if (b>0) {cout<<b<<" Burgers "<<"\t @ $"<<burger<<" = $"<< b*burger<<"\n"; }
    if (f>0) {cout<<f<<" Hot Dogs"<<"\t @ $"<<frank<<" = $"<<f*frank<<"\n" ; }
    if (ff>0) {cout<<ff<<" French Fries"<<"\t @ $"<<fries<<" = $"<<ff*fries<<"\n"; }
    if (s>0) {cout<<s<<" Soda"<<"\t\t @ $"<<soda<<" = $"<<s*soda<<"\n"; }


    cout<<"---------------------------------------\n";
    cout<<" - Subtotal \t\t= $"<<total;                // Display the subtotal
    cout << "\n - Taxes 8.877% \t= $"<<taxes*total;   // Calculate taxes at 8.877%
    double grandTotal = total+(taxes*total);        // Calcuate grand total
    cout<<"\n---------------------------------------\n";
    cout << " - Total \t\t= $"<<grandTotal<<"\n";
    cout<<"---------------------------------------\n";
    cout<<"---------------------------------------\n";


    // Sugested Gratuity @ 12%, 15%, & 20%
    cout << "\nSuggested Gratuity\n------------------";
    cout << "\n+ 12% gratuity "<<"($"<<tip12*grandTotal<<") = total $"<<grandTotal+(tip12*grandTotal);
    cout << "\n+ 15% gratuity "<<"($"<<tip15*grandTotal<<") = total $"<<grandTotal+(tip15*grandTotal);
    cout << "\n+ 20% gratuity "<<"($"<<tip20*grandTotal<<") = total $"<<grandTotal+(tip20*grandTotal);


    cout<<"\n\n";
    return 0;
}


