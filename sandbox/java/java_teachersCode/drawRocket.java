public class drawRocket
//draw a rocket
{public static void main(String[] args)
   {/*the rocket is a trianle on top
    with a rectangle divided in 2
    in the middle
    */
     drawTriangle();           //triangle               
     line();                   //top of rectangle(includes line on the bottom
     drawbox();                //top half of rectangle  
     drawbox();                //bottom half of rectangle
     drawTriangle();           //triangle
   }
public static void drawTriangle()        //draw the triangle
   {System.out.println("     /\\");
    System.out.println("    /  \\");
    System.out.println("   /    \\");
    System.out.println("  /      \\"); 
    System.out.println(" /        \\");
   }
   
public static void drawbox()      //a box is 5 middle lines, followed by a bottom line
    {
     draw3Lines();
     draw2Lines();
     line();  
    }
public static void draw2Lines()
    {centerLine();
     centerLine();
    }
    
public static void draw3Lines()
    {draw2Lines();
     centerLine();
    }

public static void centerLine()
    {System.out.println("|          |");

    }
public static void line()
    {System.out.println(" ----------");

    }
    
} 
 