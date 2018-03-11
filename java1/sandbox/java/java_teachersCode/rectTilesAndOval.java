//http://www.chris.com/ascii/joan/www.geocities.com/SoHo/7373/design.html
public class rectTilesAndOval
{public static final int widthRect=4;
public static final int heightRect=5;
public static final int widthH=6;
public static final int heightH=2;
static int numTiles=4;
static int numRows=5;
static int widthT=6;
static int heightT=3;
public static void main(String[]args)
{rectangle();
honeycomb();
tiles();
}
public static void rectangle()
{System.out.println("Height of rectangle: "+heightH);
System.out.println("Width of rectangle: "+widthH);
top();
middle();
top();
}
public static void middle()
{int i;
open();
for(i=1;i<=heightRect;i++)
{space();
close();
open();
}
}
public static void space()
{System.out.print(" ");
}
public static void open()
{int i;
openParen();
for(i=1;i<=4*widthRect+1;i++)
   space();

closeParen();
System.out.println();
}
public static void close()
{int i;
closeParen();
for(i=1;i<=4*widthRect-1;i++)
   space();
openParen();
System.out.println();

}
public static void openParen()
{System.out.print("(");
}
public static void closeParen()
{System.out.print(")");
}

public static void top()
{int i;
space();
for( i=1;i<=widthRect;i++)
    System.out.print(".+\"+");
 System.out.println(".");  
}
//------------------------------------------------------
public static void honeycomb()
{int i,j;
System.out.println("Height of Honeycomb: "+heightH);
System.out.println("Width of honeycomb: "+widthH);
topedge();
for(i=0;i<heightH;i++)
   {hTop();
   bottom();
    }
}
public static void topedge()
{int j;
System.out.print(" ");
for(j=0;j<widthH;j++)
System.out.print("_   ");
System.out.println();
}
public static void hTop()
{int j;
 for(j=0;j<widthH;j++)
System.out.print("/ \\_");
System.out.println();
}
public static void bottom()
{int j;
for(j=0;j<widthH;j++)
   System.out.print("\\_/ ");
System.out.println();

}
//------------------------------------------------------
public static void tiles()
{System.out.println("Number of full tiles across: "+numTiles);
System.out.println("Number of full tiles down: "+numRows);
System.out.println("Width of tiles: "+widthT);
System.out.println("Height of tiles: "+heightT);

topT();
middleT();
topT();

}
public static void topT()
{int i;
for(i=0;i<2;i++)
    bars();
}


public static void middleT()
{int i,j;
for(i=0;i<numRows;i++)    
  {bot1();
   bot2();
   bot1();
   for(j=0;j<heightT-2;j++)
       bars();
   }
bot1();
bot2();
bot1(); 
}
public static void bars()
{int i,j;
System.out.print("|");
for(i=0;i<widthT/2+1;i++)
     System.out.print(" ");
for(i=0;i<numTiles;i++)
     {System.out.print("|");
     for(j=0;j<widthT+2;j++)     
         System.out.print(" ");
      }
System.out.print("|");
for(i=0;i<widthT/2+1;i++)
     System.out.print(" ");
System.out.println();     
}
public static void bot1()
{int i,j;
System.out.print("|");
for(i=0;i<widthT/2+1;i++)
     System.out.print(" ");
for(i=0;i<numTiles+1;i++)
     {System.out.print("\\");
     for(j=0;j<widthT+2;j++)     
         System.out.print(" ");
         
      }
System.out.println();     

}
public static void bot2()
{int i,j;
System.out.print("|");
for(i=0;i<widthT/2;i++)
     System.out.print("-");
for(i=0;i<numTiles;i++)
     {System.out.print("\\ \\");
     for(j=0;j<widthT;j++)     
         System.out.print("-");
      }
System.out.print("\\ \\");
for(i=0;i<widthT/2;i++)
     System.out.print("-");
System.out.println();     
}

}




 