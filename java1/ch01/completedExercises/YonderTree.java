import java.util.*; // Import java utilities 

/*
 * Author:      Kevin George Rusty
 * Professor:   Eileen Lichtenthal
 * Class:       Introduction to Computer Programming - CP 500 02[3995]
 * Textbook:    Building Java Programs: A Back to Basics Approach. 4th Edition
 * Date:        Tue Oct 24 2017
 * 
 * Assignment:  Chapter 1, Programming Projects, Example 6 (Extra Credit)
 *              Write application to print poem to screen. Poem must not contain redundant code
 *              and must only have 5 calls in the main method.
 *
*/

public class YonderTree {   // Application name 

    public static void main(String[] args) { // Beginning of main 
        verse1Cat();
        verse2Hen();
        verse3Duck();
        verse4Goose();
        verse5Sheep();
	} // END main

// Verses

    public static void verse1Cat() {
        System.out.println("Bought me a cat and the cat pleased me,\nI fed my cat under yonder tree.");
        theCatGoes();

    } // END verse1 Cat

    public static void verse2Hen() {
        System.out.println("Bought me a hen and the hen pleased me,\nI fed my hen under yonder tree.");
        theHenGoes();

    } // END verse2 Hen

    public static void verse3Duck() {
        System.out.println("Bought me a duck and the duck pleased me,\nI fed my duck under yonder tree.");
        theDuckGoes();
    } // END verse3 Duck

    public static void verse4Goose() {
        System.out.println("Bought me a goose and the goose pleased me,\nI fed my goose under yonder tree.");
        theGooseGoes();
    } // END verse4 Goose

    public static void verse5Sheep() {
        System.out.println("Bought me a sheep and the sheep pleased me,\nI fed my sheep under yonder tree.");
        theSheepGoes();
    } // END verse5 Sheep


// What does the animal say?


    public static void theCatGoes() {
        System.out.println("Cat goes fiddle-i-fee.");
        System.out.println();
    } // END theCatGoes

    public static void theHenGoes() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
        theCatGoes();
    } // END theHenGoes

    public static void theDuckGoes() {
        System.out.println("Duck goes quack, quack,");
        theHenGoes();
    }  // END theDuckGoes

    public static void theGooseGoes() {
        System.out.println("Goose goes hissy, hissy,");
        theDuckGoes();
    }  // END theGooseGoes

    public static void theSheepGoes() {
        System.out.println("Sheep goes baa, baa,");
        theGooseGoes();
    } // END theSheepGoes

} // End of app
