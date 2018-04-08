public class longestCommonPrefix
{
   public static void main(String [] args)
   {
      String s1 = "surprise"; //"distance";
      String s2 = "showcase"; //"dislike"; //"disinfect";
      String LCP="";
      
      for(int i=0; i<s1.length()&& i<s2.length() ; i++)
      {
         if(s1.charAt(i) == s2.charAt(i))
            LCP += s1.charAt(i);
         else
            break;
      }
      
      System.out.println("longest common prefix of "+s1+" and "+s2+" is "+LCP);
   }
}
