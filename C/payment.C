#include<iostream>
using namespace std;

int main()
{
    // Variable Declarations
    double hrlyRate , hrsWorked=0, otHrs=0 ,paycheck ;

    cout << "\nHello Kevin\n\n";
    // get user input # of hours worked and hourly rate
    cout << "How many hours? ";
    cin >> hrsWorked;
    cout << "What is the hourly rate: ";
    cin >> hrlyRate;

    // calcuate paycheck taking into account ot hours over 40
    if (hrsWorked <= 40) {
        paycheck=(hrsWorked*hrlyRate);
    } else { 
        double otRate=(hrlyRate+(hrlyRate/2));
        otHrs=(hrsWorked-40);
        cout << "The overtime rate is "<<otRate<<"\n";
        paycheck=(hrsWorked*hrlyRate)+(otHrs*otRate);
    }
    cout << "You made "<<paycheck;



    cout << "\n\n";
    return 0;
}
