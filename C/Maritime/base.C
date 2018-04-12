/* Kevin George Rusty */
        
 /******************************
        Maritime Requirements  
 *******************************
 *
 *
 * Prolonged Blast      - 4 to 6 seconds    (-----)
 * Short Blast          - 1 Second          (-)
 *******************************
        SOUND DEVICE TYPES
 *******************************
 * * Whistle
 * * Gong
 * * Bell
 * * Horn
 *
 *
 * Whistle details
 *      length          Hertz               Decibles        Range
 *      12 <= 20m       280-700(250-525)    120             0.5nm
 *      20 <= 75m       280-700(250-525)    130             1.0nm
 *
 * Requirements for sound equipment
 * * International
 *      length          Any Means   Whistle     Bell    Gong
 *
 *      < 12 m              X
 *      12 to < 20 m                   X
 *      20 to < 100 m                  X          X
 *      >= 100 m                       X          X       X
 *
 * * Local
 *      length          Any Means   Whistle     Bell    Gong
 *
 *      < 12 m              X
 *      12 to < 100 m                  X          X
 *      >= 100 m                       X          X       X
 *
 *
 *******************************
         LIGHTING
 *******************************
 * => colors  
 *
 * * Red 
 * * Green 
 * * White 
 * * Yellow 
 * * Blue
 *
 *
 * => range/location  
 *
 * * side lights 
 * * stern light 
 * * Masthead Light 
 * * Deck Lights
 *
 *
 * => Arc of Coverage
 *
 * * Side light abc degrees
 * * Stern light abc degrees
 * * Masthead light abc degrees
 * * all around lilght 
 *
 *******************************
        SHAPES
 *******************************
 * * Day Shapes
 * Diamond
 * Ball
 * Triangle UP
 * Triangle Down
 * Basket
 * Cilinder 
 *
 * TO DEFINE
 *  Meter vs feet
 *  Fathom
 *  Nautical Mile
 *  True North
 *  Magenetic North
 *  Boat Sizes
 *
 * local rules
 * international rules
 * rules for clear visibiity situations
 * rules for reduced visibility
 *  
 *
 *******************************
 *
 */



#include<iostream>
#include<string>

using namespace std;

//-Constants
const int CAPACITY = 25;

//-Main
int main() {

    //-Function prototypes
    void space();
    void space(int);


    //
    string colors[] = {"red","green","white","yellow","blue"};
    space();

    cout<<" The color of the port light is? _\t"<<colors[0]<<"\n";
    cout<<" The color of the starbord light is? _\t"<<colors[1]<<"\n";

    /* */
    space(2);
    return 0;
} // END main

/* Utility */
void space(){cout<<"\n";}
void space(int x){ for (int i=1;i<=x;i++) cout<<"\n"; }
