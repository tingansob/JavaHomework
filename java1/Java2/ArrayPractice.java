import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        int [] scores = new int[12];
        int sum;
        scores[0]++;
        System.out.print("Scores: ");
        for (int i = 0; i<=11; i++)
            System.out.print(scores[i]+" ");
        System.out.print("\n");
        
        int [] numbers = {-3, 45, 32, 17, 82, -97};
        int x = 3;
        x++;
        numbers[x]++;
        System.out.println("x="+x);
        for (int i=0; i< numbers.length; i++)
            System.out.print(numbers[i]+" ");
        int y = numbers[x++];
        System.out.println("\ny="+y+" x="+x);
        y = numbers[x]--;
        System.out.println("\ny="+y);


        // ------------------------
        
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) 
        {
            System.out.println("Enter a score ");
            scores[i] = in.nextInt();
        }
        for (int i=0; i<scores.length;i++)
            System.out.print(scores[i]+" ");
    }
}
