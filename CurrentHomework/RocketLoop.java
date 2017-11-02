public class RocketLoop
{
// Constant declarations

    public static final int width = 8;
    public static final int height = 3;
    public static final int segments = 2;

    public static void main(String[] args)
    {
        drawCone();
        drawSections();
        drawCone();
    } // END main

// Create Rocket Sections

    public static void drawSections()
    {
        drawEdge();
        for (int i = 1; i <= segments; i++)
        {
        drawBox();
        }
    } // END drawSections 

// Draw box
    public static void drawBox()
    {
        for (int i = 1; i <= height; i++) {
            drawSides();
        }
        drawEdge();
    } // END drawBox

// Rocket Body Elements
    public static void drawEdge()
    {
        System.out.print("+");
        for (int i = 1; i <= width; i++) {
            System.out.print("-");
        } 
        System.out.println("+");
    } // END drawEdge

    public static void drawSides()
    {
        System.out.print("|");
        for (int i = 1; i <= width ; i++ ) {
            System.out.print(" ");
        }
        System.out.println("|");
    } // END drawSides

    public static void drawCone()
    {
        System.out.println("    /\\");
        System.out.println("   /  \\");
        System.out.println("  /    \\");
        System.out.println(" /      \\");
    } // END drawCone

} // END Main
