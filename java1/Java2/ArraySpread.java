// print out list of doubles from 0 to 100
import java.util.*;
public class ArraySpread{
    public static void main(String[] args) {
        double [] spread = new double[100];
        for (int i=0;i<=spread.length-1;i++)
            spread[i]=i+1;

    for (int i=0;i<=spread.length-1;i++)
        System.out.print(spread[i]+" ");
    System.out.println();
    }

}
