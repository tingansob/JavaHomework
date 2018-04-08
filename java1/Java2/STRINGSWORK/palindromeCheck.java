public class palindromeCheck
{
   public static void main(String [] args)
   {
         String word = "adfefda"; //"racecar"; //"dad"; //"stars"; //"sorts"; //"kayak";
         int s, e = word.length()-1;
         boolean isPal = true;
         
         for(s = 0; s<e && isPal; s++, e--)
         {
            if(word.charAt(s) != word.charAt(e))
               isPal = false;
         }
   
         if(isPal)
            System.out.println(word + " is a palindrome");
         else
            System.out.println(word + " is NOT a palindrome");
   }
}
