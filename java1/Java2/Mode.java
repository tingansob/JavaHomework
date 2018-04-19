import java.util.*;
 
public class Mode 
{
    static int N = 20;
    static int[] sequence = new int[N];
 
    public static int mode() 
    {
        int maxValue = 0, maxCount = 0;
 
        for (int i = 0; i < sequence.length; ++i) 
        {
            int count = 0;
            for (int j = 0; j < sequence.length; ++j) 
            {
                if (sequence[j] == sequence[i])
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = sequence[i];
            }
        }
 
        return maxValue;
    }
 
    public static void main(String args[]) 
    {
        Random random = new Random();
 
        for (int i = 0; i < N; i++)
            sequence[i] = Math.abs(random.nextInt(100));
 
        System.out.println("The set of numbers are: ");
        for (int i = 0; i < N; i++)
            System.out.print(sequence[i] + " ");
 
        System.out.println("\nThe mode of the set is: " + mode());
    }
}
