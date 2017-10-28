// Import the entire java.utilities - We're not using this now but it's a good habit to get into for the future.
import java.util.*;
/*
  This is the start of my application called ESCAPE. This is my homework/testing of the print & println commands with the use of escape sequences and characters. I have a few questions for the professor so I'll ask her in class today.

*/
public class TextManipulation
{
  public static void main(String[] args)
  {
    // the basic "Hello World" line
    System.out.println("Hello World!\n");
    // expanding on yesterday's work.
    System.out.println("Today's lesson was about the difference between \"print\" and \"println\".\n");
    System.out.println("For Instance:\n");
    System.out.println("\tPRINT\f");
    System.out.print("This is an example of a line using the \"print\" command which does not have a natural carriage return at the end. Hence the cursor would naturally stop here.");
    System.out.println(" ----- This is just the next line in the program but it will be appended to the previous line because of the \"print\" command from the previous line.\n");
    System.out.println("As a result, if you wanted to get a new line but didn't want to use \"println\" you could use a \"\\n\" newline escape sequence.\n");
    System.out.println("So in my research I've found the following excape sequences:\n\n");
    System.out.println("\\b backspace \t \\f formfeed \t \\n linefeed \t \\r carriage return \t \\t horizontal tab \t \\' \\\" single and double quotes as well as the \t \\ backslash\f\f");
    // The formatting above is horrible. I figured I could do better. I wonder if there's a way to number or bullet the lines.
    // TODO Find out how to format lists
    System.out.println("I could format that better:");
    System.out.println("\t\\b backspace");
    System.out.println("\t\\f formfeed");
    System.out.println("\t\\n linefeed");
    System.out.println("\t\\r carriage return");
    System.out.println("\t\\t horizontal tab");
    System.out.println("\t\\' single quotes");
    System.out.println("\t\\\" double quotes");
    System.out.println("\t\\\\ backslash\f");
    // QUESTION discuss the following issues in class...as well as research them on my own
    // NOTE the \f line feed escape produces strange - often unpredictable results. I have to figure out what that's about. 
    System.out.println("Things to discuss with the teacher:");
    System.out.println("\tWhat if we want to print a list?");
    System.out.println("\tWhat is the PrintStream method?");
    System.out.println("\tHow do we see all the options/args in a method?");
    System.out.println("\tRegarding the \"printf\" command, how does it work?");
    System.out.println("\tWhat is the difference between printf and format commands?");
  }
}
