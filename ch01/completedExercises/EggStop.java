import java.util.*; 

/*
 * Author: Kevin George Rusty
 * Professor: Eileen Lichtenthal
 * Class: CP 500 02[3995] Introduction to Computer Programming
 * Text: Building Java Programs: A Back to Basics Approach. 4th Edition
 *
 * Briefing - See Appendix 1
 * Name of Project
 *	- Situation
 *	- Purpose
 *	- Road Map
 *	- Project Goals
 *	- Expected Results
 *	- Success Criteria
 *
 *	Date Started
 *	Date Last Touched 
*/

public class EggStop
{ 
	public static void main(String[] args)
	{
		drawEgg();
        drawBottom();
        drawCrack();
        drawEggStop();
        drawTopHalf();
	}

	public static void drawEgg()
	{
		drawTop();
		drawBottom();
	}

	public static void drawCrackedEgg()
	{
		drawTop();
		drawCrack();
		drawBottom();
	}

	public static void drawBottomHalf()
	{
		drawCrack();
		drawBottom();
	}

	public static void drawTopHalf()
	{
		drawTop();
		drawCrack();
	}

    public static void drawEggStop()
    {
        drawTop();
        drawStop();
        drawBottom();
    }

	public static void drawTop()
	{
		System.out.println("  ---------");
		System.out.println(" /         \\");
		System.out.println("/           \\");
	}	

	public static void drawBottom()
	{
		System.out.println("\\           /");
		System.out.println(" \\         /");
		System.out.println("  ---------\n");
	}

	public static void drawCrack()
	{
		System.out.println("+-----------+");
	}
	
	public static void drawStop()
	{
		System.out.println("|   STOP    |");
	}
	
}

/*
 * APPENDIX 1
 *
 * Briefing 
 * Situation
 * 	Relevant facts and figures. Wikipedia style: who, when, what.
 * Purpose
 * 	What is the customer's purpose? Why is the customer doing what they're doing?
 * 	The why. The reason. The driver. The focus.
 * Road Map
 * 	What initiatives are planned to pursue the purpose?
 * 	What is planned now, what comes then, what comes later, What comes maybe?
 * Project Goals
 * 	Why is the customer coming to you?
 * 	Try to keep this simple. Only one topic!
 * Expected Results
 * 	What are the expected results?
 * 	What would the customer like to take home? Define the minimal scope.
 * 	It's better to exceed the minimal scope than to promise a lot and not keep your promise.
 * 	What resources (money, manpower, tools) is the customer ready to make available?
 * 	By when would the customer like the results?
 * Success Criteria
 * 	How do we measure the projects success?
 * Source: http://www.brainstore.com 
*/
// email: tingansob@gmail.com
// kevin.rusty33@students.kingsborough.cuny.edu
// www.practiceit.com
