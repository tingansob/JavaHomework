import java.util.*;
public class Testing {
    public static void main(String[] args) {
      int [] a1 = {1, 2, 3, 4, 5, 6};
      int [] a2 = {5, 10, 15, 20, 25};
      
      for(int i = 0; i < a1.length; i++)
         a1[i] = a1[i] + a2[i % (a2.length)]; 
   
      for(int i = 0; i < a1.length; i++)
         System.out.print(a1[i]+" ");
    }
}
