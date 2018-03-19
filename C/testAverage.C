#include<iostream>
using namespace std;

int main() {
    int counter, grades[100], average=0;

    cout << "\nHow many exams were there? ";
    cin >> counter;
    cout << "\nPlease enter the grades below \n\n";
    for (int i=1; i<=counter;i++)
    { 
        cout << " - Exam "<<i<<" grade: ";
        cin >> grades[i]; 
        average += grades[i];
    }

    cout << "\nYour test average is "<<average/counter;
    cout << "\nTest 2 grade was "<<grades[2];


    cout << "\n\n";
    return 0;
}
