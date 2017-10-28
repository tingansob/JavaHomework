import java.util.*;
/*
 * Author: 	Kevin George Rusty
 * Professor	Prof. Eileen ?????
 * Class 	CP5 Intro to Programming (Java)
 * Text		Creating Java Programms
 *
 * Briefing - See Appendix 1
 * No More Redundancy
 *	- Situation
 *		Computers are particularly good at doing repetative tasks quickly and efficiently.
 *		To create a program that has redundant code is an inefficient use of the technology.
 *		Cutting an application into smaller pieces is always desirable for various reasons.
 *		Putting code into managable blocks (methods) that can be debuged and analyzed easily 
 *		is to our benefit.
 *	- Purpose
 *		To practice creating applications using print commands where we remove as 
 *		much redundancy as possible.
 *	- Road Map
 *		First I will identify all of the examples in the book to focus on this weekend.
 *		I will then code each example
 *		Then, if I am unable to figure anything out I'll msg the instructor.
 *		Perhaps I'll share the code on github.
 *	- Project Goalsa
 *		To gain an understanding of the use of methods in java programming.
 *	- Expected Results
 *		I will have created a series of applications that print out to the display
 *		that work conssitently but have no redundancy beyond what we've learned thus far.
 *	- Success Criteria
 *		A working application (It will compile)
 *		Results are as expected
 *		The application has as little redundant code as possible
 *
 *	Date Started October 19, 2017
 *	Date Laast Touched 
*/
public class DrawBoxes2
{
 public static void main(String[] args)
 {
	 drawSquare();
	 System.out.println();
	 drawRectangle();
	 drawSquare();
  }
 // method to draw a square on the screen
 public static void drawSquare()
 {
	 drawEdge();
	 drawSquareSides();
	 drawEdge();
 }
 // method to draw a rectangle on the screen
 public static void drawRectangle()
 {
	 drawEdge();
	 drawRectangleSides();
	 drawEdge();
 }
 // method to draw the sides of the square
 public static void drawSquareSides()
 {
	 drawSides();
	 drawSides();
 }
 // method to draw the sides of the rectangle
 public static void drawRectangleSides()
 {
	 drawSides();
	 drawSides();
	 drawSides();
	 drawSides();
 }
 // method to draw the top and bottom edges of the shape
 public static void drawEdge()
 {
	 System.out.println("+------+");
 }
 // method to draw the sides of the shapes from methods draw*
 public static void drawSides()
 {
	 System.out.println("|      |");
 }
}


/* 
 *  NOTES
 *
 * It would be much easier to achieve our goals using loops or some other construct, however, 
 * we are only in Chapter 1 which doesn't include that so there will be some redundancy in our application.
 *
*/

/*
 * APPENDIX
 *
 * Briefing 
 * Situation
 * 	Relevant facts and figures. Wikipedia style: who, when, what.
 * Purpose
 * 	What is the customer's purpose? Why is the customer doing what they're doing?
 * 	The why. The reason. The driver. The focus.
 * Road Map
 * 	What initiatives are planned to persue the purpose?
 * 	What is planned now, what comes then, what comes later, What comes maybe?
 * Project Goals
 * 	Why is the customer coming to you?
 * 	Try to keep this simple. Only one topic!
 * Expected Results
 * 	What are the expedted results?
 * 	What would the customer like to take home? Define the minimal scope.
 * 	It's better to exceed the minimal scope than to promise a lot and not keep your promise.
 * 	What resources (money, manpower, tools) is the customer ready to make available?
 * 	By when would the customer like the results?
 * Success Criteria
 * 	How do we measure the projects success?
 * Source: http://www.brainstore.com 
 *
*/

// personal email: 	tingansob@gmail.com
// school email:	kevin.rusty33@students.kingsborough.cuny.edu
