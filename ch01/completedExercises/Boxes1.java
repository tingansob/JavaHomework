import java.util.*;
/*
 * Author: Kevin George Rusty
 * Situation
 * 	Redundantly repeating code is inefficient and not a
 * 	very good use of the technology. There must be a way
 * 	to consolidate the code into more useful relative parts.
 * Purpose   
 * 	Explore the idea of "Procedural Decomposition
 * Road Map    
 * 	Create a fundamental java app
 * 	Create static method called drawBox that prints 
 * 	the box on the screen	
 * 	Experiment with various ways that methods can be used 
 * 	to break a large problem into smaller parts
 * Project Goals   
 * 	To create a java program that will compile
 * 	explore various ways to use print* statements
 * Expected Results   
 * 	I should be able to manipulate methods using proper flow control
 * Success Criteria
 * 	App will compile
 * 	Output will present as desired
 * 	App is properly commented
 * 	App is presented to professor for review
 *
 * Professor
 * Class 	Intro to Programming (CP5)
 * Text		Building Java Programs (4th Edition) CH1
*/
// App name 	Boxes1
// Date Started - Oct 19
// Date Laast Touched 
public class Boxes1
{
 public static void main(String[] args)
 {
  // Runtime.getRuntime().exec("clear");
  drawBox();
  System.out.println();
  drawBox();
  }
 // Static method drawBox defined below
 public static void drawBox()
 {
  System.out.println("+------+");
  System.out.println("|      |");
  System.out.println("|      |");
  System.out.println("+------+");
 }
}

// email: tingansob@gmail.com
// irc:
//
// Any additional information goes below 
