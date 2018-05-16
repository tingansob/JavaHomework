#include<iostream>
#include<cmath>
#include<fstream>
#include<string>
using namespace std;


int main(){

    char filename[50];
    ifstream inputFile;
    getline(filename, 50);
    inputFile.open(filename);

    if(!inputFile.is_open()){
        exit(EXIT_FAILURE);

    }

    char word[50];
    inputFile >> word;
    while(inputFile.good()){
        cout << word << "\n";
        inputFile >> word;
    }
        inputFile.close();
}
