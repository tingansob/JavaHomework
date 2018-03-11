
/*
 *                                                                      
 * Author:          Kevin George Rusty                                  
 * Class:           CP 500 - Intro to Computer Programming              
 * Assignment:      Using 'for' loop on print rocket on screen          
 * Date:            Thu Nov 1 2017                                      
 *                                                                      
 */
public class RocketLoop2
{
//                            
// Declaration of Constants   
//                            

    public static final int width = 6;
    public static final int height = 2;
    public static final int segments = 2;



    public static void main(String[] args)
    {
        System.out.println();
        drawCone();                             //  TODO                            
        drawSections();                         //  Figure out how to loop cone     
        drawCone();                             //                                  
        System.out.println();
    } // END main

//                          
// Create Rocket Elements   
//                          

    public static void drawSections()           // Draw the individual rocket segments
    {                                           // First Draw the box which includes  
        drawEdge();                             // the sides, edges and base.         
        for (int i = 1; i <= segments; i++)     //                                    
        {                                       // segments = number of boxes         
        drawBox();                              // height = number of box sections    
        }                                       //                                    
    } 

// Draw box
    public static void drawBox()
    {
        for (int i = 1; i <= height; i++) {
            drawSides();
        }
        drawEdge();
    } // END drawBox

//                          
// Rocket Body Elements     
//                          

    public static void drawEdge()                   //                          
    {                                               //  Create top and bottom   
        System.out.print("+");                      //  of box shapes.          
        for (int i = 1; i <= width; i++) {          //  width defines number of 
            System.out.print("-");                  //  '-' between the  '+'    
        }                                           //                          
        System.out.println("+");                    //  I also draw the sides   
    } // END drawEdge                               //  of the box using '\' &  
                                                    //  ' ' also using width    
    public static void drawSides()                  //                          
    {
        System.out.print("|");
        for (int i = 1; i <= width ; i++ ) {
            System.out.print(" ");
        }
        System.out.println("|");
    } // END drawSides

    public static void drawCone()
    {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
   //     System.out.println(" /      \\");
    } // END drawCone


} // END Main
