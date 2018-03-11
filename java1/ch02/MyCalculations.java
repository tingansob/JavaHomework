import java.util.*; // Import java utilities 

/*
 * Author:      Kevin George Rusty
 * Professor:   Eileen Lichtenthal
 * Class:       CP 500 - Introduction To Programming @ KBCC 
 * Textbook:    Building Java Programs - 4th Edition
 * Date::       Sat Oct 28 17:28:25 EDT 2017
 * 
 * Assignment:  Self study to learn more about 
 *                  - variables
 *                  - primal data types
 *                  - operators
 *                  - order of operations.
 *              I'll also be buidding upon the previous chapter's knowledge.
 *
*/

public class MyCalculations   // Application name
{ 
    public static void main(String[] args) // Beginning of main method
    {
        // welcomeMessage();
        System.out.println("\nLet us begin.\fChapter 2 - Self-Check Problems\n\n");
        selfCheckProblem01();
        selfCheckProblem02();
        selfCheckProblem03();
	} // END main


/*
    public static void welcomeMessage() // Beginning of the welcomeMessage method
    {
        Scanner nameInput = new Scanner(System.in);
        System.out.print("\nHello there, please tell me your name... ");
        String name = nameInput.nextLine();
        System.out.println("\nHello, "+name+"!");

    } // END helloWorld
*/

    public static void selfCheckProblem01()
    {
        System.out.println("Which of the following are legal int literals");
        System.out.println("22\t1.5\t-1\t2.3\t10.0\t5.\t-6875309\t\'7\'");
        System.out.println();
    }

    public static void selfCheckProblem02()
    {
        System.out.println("What is the result of the following expression?");
        System.out.print("1 + 2 * 3 + 7 * 2 % 5 = ");
        System.out.println(1+2*3+7*2%5);
        System.out.println();
    }

    public static void selfCheckProblem03()
    {
        System.out.println("Trace the evaluation of the following expressions and tive their resulting values:");
        System.out.println(89%10/4*2.0/5+(1.5+1.0/2)*2);
        System.out.println();
        System.out.println();
        System.out.println((1.5+1.0/2)*2);
        System.out.println(89%10/4*2.0/5);
        System.out.println();
        System.out.println(89%10/4*2.0/5+(1.5+1.0/2)*2);
        System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3);
        System.out.println("1" + 2 + 3 + "4" + 5 * 6 + "7");
    }


} // End of application

/*
 * email:
 *
*/
