import java.util.*;
public class homework {
    public static void main(String[] args){

/*
 int [] array = {20, 8, 6, 2, 15, 10};
      for (int i = 0; i < array.length; i++)
      {
         array[i] = array[i] / array[0];
      }
      
      for(int i = 0; i < array.length; i++)
         System.out.print(array[i]+" ");

      int [] array = {20, 8, 6, 2, 15, 10};
      int sum = 0;
      
      for (int i = 0; i < array.length; i++)
         sum += array[i];
              
     for (int i = 0; i < array.length; i++)
          array[i] = (int)(((double)array[i]) / sum * 100);
      
      for(int i = 0; i < array.length; i++)
        System.out.print(array[i]+" ");
*/


      String str1 = "Java Programming";
      String str2 = "Arrays are fun!";
      String str3 = "Hello";

      System.out.println(str3.substring(2)+str1.substring(10, 11)+str2.substring(3, 6)+str1.substring(13, 16)); 
      System.out.println(str2.indexOf("!"));
              str2.replace("are","is");
      System.out.println(str2);


String s1="my name is khan my name is java";  
String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
System.out.println(replaceString);  


    }
}
