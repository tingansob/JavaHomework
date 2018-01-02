public class drawboxes2
{public static void main(String[] args)
   { drawBox();
     drawBox();
     drawRectangle();
   }
public static void drawRectangle()
   {drawEdge();
    drawRectangleCenter();
    drawEdge();
   }
   
public static void drawBox()
   {drawEdge();
    drawCenter();
    drawEdge();
   }
public static void drawCenter()
   {draw3Empty();
    }
public static void drawRectangleCenter()
   {draw3Empty();
    draw2Empty();
   }
public static void draw2Empty()
   {drawEmpty();
    drawEmpty();
    }     
public static void draw3Empty()
   {draw2Empty();
    drawEmpty();
   }   
public static void drawEmpty()
   {System.out.println("|        |");
   }
public static void drawEdge()
   {System.out.println(" --------");
   }  
}