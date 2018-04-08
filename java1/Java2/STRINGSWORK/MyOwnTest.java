import java.util.*;
public class MyOwnTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ans = 'a';

        do{
            System.out.print("Do you want to continue? ");
            String ansString = in.nextLine();
            ansString = ansString.toLowerCase();
            ans = ansString.charAt(0);

        } while (ans =='y');
        System.out.println("Program is ending.");
    }
}
