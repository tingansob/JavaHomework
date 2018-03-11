import java.util.*;
/*
 * byte     (number, 1 byte)
 * short    (number, 2 bytes)
 * int      (number, 4 bytes)
 * long     (number, 8 bytes)
 * float    (float number, 4 bytes)
 * double   (float number, 8 bytes)
 * char     (a single character, 2 bytes)
 * string   (a atring of characters, ??? bytes)
 * boolean  (true or false, 1 byte)
*/

public class GPACalculator
{
    public static void main(String[] args)
    {
        char his = '\u2642', hers = '\u2640', loves = '\u2764';

        // System.out.println("\n\t Chart name goes here");
        // System.out.println("\n\t "+loves+" "+his+" "+loves+" "+hers+" "+loves);
        /*
         * assign variables for 
         *  - grades 
         *          Figure out how to convert and calculate class hours to points
         *  - hours
         *   total amount of grade points/total amount of credit hours attempted
         *  
         *  add all converted decimal grades together - this is my sum
         *  Count the number of classes I've taken
         *  Divide the sum by the number of classes and that's the unweighted GPA
         *
         */
        Scanner get_name = new Scanner(System.in);
        System.out.println("What's your first name? ");
        String fname = get_name.nextLine();
        System.out.println("Nice to meet you "+fname);

        Scanner scan = new Scanner (System.in);
        System.out.print("How many male students are there? ");
        int male_students = scan.nextInt();
        Scanner scan1 = new Scanner (System.in);
        System.out.print("How many female students are there? ");
        int female_students = scan.nextInt();

        
        int total = male_students + female_students;
        System.out.println("\n\t "+loves+" "+his+" "+loves+" "+hers+" "+loves);
        System.out.println("There are "+male_students+" "+his);
        System.out.println("There are "+female_students+" "+hers);
        System.out.println("And in total there are "+loves+" "+total+" "+loves+" students");



        /*
        int girls, boys, total;
        girls = 11;
        boys = 3;
        total = girls + boys;
        System.out.println("\t"+his+" - boys\t"+boys);
        System.out.println("\t"+hers+" - girls\t"+girls);
        System.out.println("\t"+loves+" - total\t"+total);
        // trying different primitive java data types
        //

        double a = 12, b = 3442, c;
        c = b % a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        byte q = 127;
        System.out.println("The original value of q is "+q);
        System.out.println(q++);
        System.out.println(q);
        System.out.println(q++);
        System.out.println(q);
        // System.out.println(user_input_number++);
        //System.out.println(user_input_number++);
        */
    }
}

