/*
 * Loops * Created by tingansob on 11/06/2017 at 06:00:44 PM
 * Assignment:  Master Loops
 *
*/
//  loops MAIN
import java.util.*;
public class Loops {
    // variables & constants
    public static final int COUNT = 5;
    public static final char ALPHA1 = 'A';
    public static final char ALPHA2 = 'E';

    public static void main(String[] args) {
        intro();
        loopSquares();
        loopTri01(); // right triangles - low to high 
        loopTri02();
        loopTri03();

} // END main
// METHODS
public static void intro() {
    System.out.println("\nUsing a '#' char I want to print some ascii art...let's see how this goes.\n");
}
// SQUARE LOOPS 
public static void loopSquares()
{
        loop01();
        loop02();
        loop03();
        loop04();
        loop05();
        loop06();
        loop07();
        loop08();
        dottedDiagnal();
    
}
public static void loop01() {
    System.out.println("Single loop, i=1, i<=5; i++; # ");
    for (int i = 1; i <= COUNT; i++){
            System.out.print("# ");
    }
    System.out.println();
} // END loop01
public static void loop02() {
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=COUNT; j++) {
            System.out.print("* "); }
        System.out.println(); }
}
public static void loop03() 
{
    System.out.println();
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=COUNT; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println(); 
    }
}
public static void loop04()
{
    System.out.println();
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=COUNT; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
public static void loop05() 
{
    System.out.println();
    for (char i=ALPHA1; i<=ALPHA2; i++)
    {
        for (char j=ALPHA1; j<=ALPHA2; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println(); 
    }
}
public static void loop06()
{
    System.out.println();
    for (char i=ALPHA1; i<=ALPHA2; i++)
    {
        for (char j=ALPHA1; j<=ALPHA2; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
public static void loop07()
{
    System.out.println();
    for (int i=COUNT;i>=1;i--)
    {
        for (int j=COUNT;j>=1;j--)
        {
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
public static void loop08()
{
    System.out.println();
    for (int i=COUNT;i>=1;i--)
    {
        for (int j=COUNT;j>=1;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void dottedDiagnal ()
{
    int z = 1;
    System.out.println();
    for (int i=1; i<=5; i++) {
        for (int j=5; j>i; j--) 
        {
            System.out.print(". "); 
        }
        System.out.print(i);
        for (int j=1; j<i ;j++)
        {
            System.out.print(" .");
        }
        z++;
        System.out.println();
    }
}

 
// TRIANGLE LOOPS 01
// image
// *
// * *
// * * *
// * * * * 
// * * * * * 
public static void loopTri01()
{
    tri01Reference();
    tri02();
    tri03();
    tri04();
    tri05();
}
public static void tri01Reference()
{
    System.out.println();
    for (int i=1; i <= COUNT; i++)
    {
        for (int j=1; j <=i; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void tri02()
{
    System.out.println();
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=i; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public static void tri03()
{
    System.out.println();
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=1; j<=i; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void tri04()
{
    System.out.println();
    for (char i=ALPHA1; i<=ALPHA2; i++)
    {
        for (char j=ALPHA1; j<=i; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public static void tri05()
{
    System.out.println();
    for (char i=ALPHA1; i<=ALPHA2; i++)
    {
        for (char j=ALPHA1; j<=i; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}


// TRIANGLE LOOPS 02
// reference image
//
// * * * * * 
// * * * * 
// * * *
// * *
// *
//
public static void loopTri02()
{
    tri02Reference();
    tri02_1();
    tri02_2();
    tri02_3();
    tri02_4();
    tri02_5();
    tri02_6();
    tri02_7();
    tri02_8();
}
public static void tri02Reference()
{
    System.out.println();
    System.out.println("Reference Image");
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=COUNT; j>=i; j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void tri02_1() 
{
    System.out.println();
    System.out.println("Img 1");
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=COUNT; j>=i; j--)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
public static void tri02_2() 
{
    System.out.println();
    System.out.println("Img 2");
    for (int i=COUNT; i>=1; i--)
    {
        for (int j=1; j<=i; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
public static void tri02_3() 
{
    System.out.println();
    System.out.println("Img 3");
    for (char i=ALPHA1; i<=ALPHA2; i++)
    {
        for (char j=ALPHA2; j>=i; j--)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
public static void tri02_4() 
{
    System.out.println();
    System.out.println("Img 4");
    for (char i=ALPHA2; i>=ALPHA1; i--)
    {
        for (char j=ALPHA1; j<=i; j++)
        {
            System.out.print(j+" ");
        }
    System.out.println();
    }
}
public static void tri02_5() 
{
    System.out.println();
    System.out.println("Img 5");
    for (int i=COUNT; i>=1; i--)
    {
        for (int j=1; j<=i; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public static void tri02_6() 
{
    System.out.println();
    System.out.println("Img 6");
    for (int i=1; i<=COUNT; i++)
    {
        for (int j=COUNT; j>=i; j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}
public static void tri02_7() 
{
    System.out.println();
    System.out.println("Img 7");
    for (char i=ALPHA2; i>=ALPHA1; i--)
    {
        for (char j=ALPHA1; j<=i; j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
public static void tri02_8() 
{
    System.out.println();
    System.out.println("Img 8");
    for (char i=ALPHA1; i<=ALPHA2; i++)
    {
        for (char j=ALPHA2; j>= i; j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }

}

// TRIANGLE LOOPS 03
public static void loopTri03()
{
    System.out.println();
    System.out.println("LOOP SERIES 3");
    tri03Reference();
    tri03_1();
    tri03_2();
    tri03_3();
    tri03_4();

}

public static void tri03Reference()
{
    System.out.println("Triange 3 Reference image");
    System.out.println();
    for (int i=1; i<=COUNT; i++)
    {
        System.out.println(i+". Hello world");
    }
}

public static void tri03_1() {System.out.println("Hello");}
public static void tri03_2() {System.out.println("Hello");}
public static void tri03_3() {System.out.println("Hello");}
public static void tri03_4() {System.out.println("Hello");}

} // loops _EOF_ 

/*
 * 
 */
