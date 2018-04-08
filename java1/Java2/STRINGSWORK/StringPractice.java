import java.util.Scanner;

public class StringPractice 
{
   public static void main(String [] args) 
   {

      char ans = 'a';

      do{
         //how to get char input from user
         System.out.println("Do you want to continue? ");
         Scanner input = new Scanner(System.in);
         //ans = input.next(); //invalid
         //ans = ansString[0];
         //ans = ansString.substring(0, 1);
         String ansString = input.next();
         
         //this is valid
         //char [] ansArray = ansString.toCharArray();
         //ans = ansArray[0];
         ans = ansString.charAt(0);
      
      }while(ans == 'y' || ans == 'Y');
      

      System.out.println("Program is ending.");         
            
      
   }

}
