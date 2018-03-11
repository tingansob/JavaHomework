import java.util.*;
public class evote
{public static void main(String[] args)
  {int clinton=0,trump=0,obama=0,iTrump=0,total=0,vote,max=0;
  Scanner in=new Scanner(System.in);
  System.out.println("2020 EVOTE STSTEM\n================\n");
  
  vote=ballot(in);
  while(vote !=5)
    {if(vote>=1&&vote<=4)
       {total++;
       System.out.println("\nVOTED\n");
       if(vote==1)
           {clinton++;
           if(clinton>max)
               max=clinton;
           }
        else if(vote==2)
            {trump++;
            if(trump>max)
               max=trump;
            }
        else if(vote==3)
            {obama++;
             if(obama>max)
                 max=obama;
            }
        else 
            {iTrump++;
            if(iTrump>max)
                max=iTrump;
            }
        }
     else
         System.out.println("***ERROR***invalid entry");
     vote=ballot(in);
    }
  summary(clinton, trump, obama, iTrump, total,max);
  
  }
  public static void summary(int clinton,int trump,int obama,int iTrump, int total,int max)
  {
  int maxes;
  System.out.println("\n==================================");
  System.out.println("FINAL TALLY: ["+total+" total votes cast]");
  System.out.println("Hillary Clinton-  \t"+clinton);
  System.out.println("Donald Trump-     \t"+trump);
  System.out.println("Barack Obama-     \t"+obama);
  System.out.println("Ivanka Trump-     \t"+iTrump);
  maxes=countMax(clinton, trump, obama, iTrump,max);
  if(maxes>1)
     reportTie(clinton, trump, obama, iTrump,max,maxes);
  else
     reportWinner(clinton, trump, obama, iTrump,max);

  }
  public static int countMax(int clinton,int trump,int obama,int iTrump, int max)
  {int maxes=0;
  if(clinton==max)
      maxes++;
  if(trump==max)
      maxes++;
  if(obama==max)
      maxes++;
  if(iTrump==max)
      maxes++;
  return maxes;
  }
  public static void reportTie(int clinton,int trump,int obama,int iTrump,int max,int high)
  {System.out.println("The vote is tied between "+high+" people\nThey are");
  output(clinton, trump, obama, iTrump,max);
  }
  public static void output(int clinton,int trump,int obama,int iTrump,int max)
  {if(clinton==max)
      System.out.println("Hillary Clinton");
  if(trump==max)
       System.out.println("Donald Trump");
  if(obama==max)
      System.out.println("Barack Obama");
  if(iTrump==max)
      System.out.println("Ivanka Trump");
  }
 public static void reportWinner(int clinton,int trump,int obama,int iTrump,int max)
  {System.out.print("The Winner is ");
  output(clinton, trump, obama, iTrump,max);
    }

  public static int ballot(Scanner in)
  {int vote;
  System.out.println("Electronic Voting System\n------------------------\n");
  System.out.println("1)Hillary Clinton");
  System.out.println("2)Donald Trump");
  System.out.println("3)Barack Obama");
  System.out.println("4)Ivanka Trump");
  System.out.print("Cast your ballot for? (1, 2, 3, or 4)");
  vote=in.nextInt();
   return vote;
  }
  }
