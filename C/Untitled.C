// Kevin George Rusty
#include<iostream>
using namespace std;
int squares();
int rectangles();
double circles();
int main() {
    int choice=0;
    do {
        cout<< "\n\nGeometry Solver"
            <<"\n---------------"
            <<"\n1. Squares"
            <<"\n2. Rectangles"
            <<"\n3. Circles"
            <<"\n4. QUIT";
        cout<<"\n Please choose an option: ";
        cin>>choice;
        if (choice==1){squares();}
        if (choice==2){rectangles();}
        if (choice==3){circles();}

    }while (choice!=4);
    cout<<"\n";
    return 0;
}
int squares(){
    int side;
    cout<<"Please enter the length of a side => ";
    cin>>side;
    cout<<"\nThe perimeter is "<<side*4;
    cout<<"\nThe area is "<<side*side;
    cout<<"\n";
}
int rectangles() {
    int l, w;
    cout<<"\nPlease enter a length => ";
    cin>>l;
    cout<<"\nPlease enter a width => ";
    cin>>w;
    cout<<"\nThe perimeter is "<<l+l+w+w;
    cout<<"\nThe area is "<<l*w;
    cout<<"\n";

}
double circles() {
    int radius;
    cout<<"Please enter a radius => ";
    cin>>radius;
    cout<<"\nThe diameter is "<<2*radius;
    cout<<"\nThe circumference is "<<2*3.14159*radius;
    cout<<"\n";
}
