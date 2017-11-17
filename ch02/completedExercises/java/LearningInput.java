import java.util.*; 

/*
 * Author: Kevin George Rusty
 * Professor: Eileen Lichtenthal
 * Class: CP 500 02[3995] Introduction to Computer Programming
 * Text: Building Java Programs: A Back to Basics Approach. 4th Edition
 *
 * Purpose - learning printf
*/


public class LearningInput
{ 
	public static void main(String[] args)
	{
        /*
        System.out.printf("Welcome, %s\n\n", "Kevin");
        Scanner zokpe = new Scanner(System.in);

        System.out.print("Please enter a number with decimals __");
        double num1 = zokpe.nextDouble();

        int num2 = zokpe.nextInt();

        System.out.printf("Your first number is %f and the second is %d\f", num1, num2);
        System.out.printf("You entered %.2f float  %d integer which equals %.2f\n", num1, num2, num1 * num2);
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some number ");
        int zokpe = scan.nextInt();

        System.out.println("You entered " + zokpe);
        // System.out.println(zokpe +  "\n");
        //
        // Now let's try to capture a first name.
        //

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Hello, What is your name? \n");
        String name = scan2.nextLine();

        System.out.println("\nNice to meet you " + name);
        //System.out.println((user_input_string + " you entered " + zokpe);
        
	}
}

/*
 * email: tingansob@gmail.com
 * kevin.rusty33@students.kingsborough.cuny.edu
*/
