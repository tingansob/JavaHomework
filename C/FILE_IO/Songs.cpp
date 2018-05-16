// CS13 Fall 2013 - File Operations techniques demonstration

#include <iostream>
#include <fstream>
#include <cstring>
#include <cstdlib>
using namespace std;


void addSong(void);
void listSong(void);
void searchSong(void);
void deleteSong(void);


int main()
{
    int x = 0;
    
    while (x < 5) {
    cout << "My Music Database\n"
        << "-----------------\n\n"
          << "Options\n"
          << "-------\n"
          << "1. Add a new song.\n"
          << "2. Display my song list.\n"
          << "3. Search for a song.\n"
          << "4. Delete a song.\n"
          << "5. Quit.\n\n"
          << "Enter choice: ";
         
    cin >> x;
        cin.ignore();


    switch (x) 
{
    case 1: 
{
            addSong();
            break;
        }
              
        case 2: 
{
            listSong(); 
            break;
        }
            
            case 3: 
{
  searchSong();
  break;
}
            
            case 4: 
{
            deleteSong();
            break;
            }             
        }
        cout << "\n\n\n";
    }
    cout << "\n\n\n";
    
    
    return 0;
}


void addSong (void) 
{
    ofstream SongListIn ("mysongs.txt", ios::app);
    string line;
    int x;
    
    cout << "How many songs? ";
    cin >> x;
    
    cin.ignore();
    
    for (int songNum = 1 ; songNum <= x ; songNum++)
    {
        cout << "\nSong name? ";
        getline (cin, line); //gets entire line instead of one word
        SongListIn << line << "\n"; //delimiter default is \n
    }
    SongListIn.close();
}


void listSong (void) 
{
    ifstream SongListOut ("mysongs.txt");
    string line;
            
    if (SongListOut.is_open())
    {
        while (SongListOut.good()) //true until end of file
        {
            getline (SongListOut, line);
            cout << "\n" << line;
        }
    }
    
    else cout << "\nUnable to open file"; 
    SongListOut.close();
}


void searchSong (void) 
{
  ifstream SongListSearch ("mysongs.txt");
  string search, line;
  
  if (SongListSearch.is_open())
  {
  cout << "Song name? ";
  getline (cin, search);
  
  while (SongListSearch.good())
  {
  getline (SongListSearch, line);
  
  if (line.find (search) != string::npos) //As a return value, it is usually used to indicate no matches.
  {
  cout << "\nSong found.";
break;
}
  
  if (!SongListSearch.good())
  cout << "\nSong not found.";
  }
  }
  
  else cout << "\nUnable to open file."; 
  SongListSearch.close();
}


void deleteSong (void)
{
ifstream SongListDelete ("mysongs.txt");
    ofstream temp ("temp.txt");
    string del, line, deleted;
    bool flag = false;
    
    cout << "Song name? ";
    getline (cin, del);
    
    if (SongListDelete.is_open())
    {
    while (getline(SongListDelete,line))
    {
        if (line != del) //reads every line to a new file except the one entered
        temp << line << "\n";
        
        else 
{
flag = true;
deleted = line;
}
    }
    
    if (flag) cout << "\nSong \"" << deleted << "\" found and deleted.";
        else cout << "\nSong not found.";
}
    else cout << "\nUnable to open file.";
    
    SongListDelete.close();
    temp.close();
    
    remove("mysongs.txt");
    rename("temp.txt","mysongs.txt");
}
