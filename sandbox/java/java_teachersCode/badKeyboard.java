import java.util.*;
public class badKeyboard
{public static void main(String [] args)
{int temp;
Scanner in = new Scanner(System.in);
System.out.print("Please enter temperature setting (0 to exit): ");
temp=in.nextInt();
while(temp!=0)
  {while(temp<0||temp>999)
       {System.out.print("INVALID TEMPERATURE \nPlease re-enter temperature setting: ");
        temp=in.nextInt();
       }
if(!goodDigits(temp))
    reportBad(temp);
else
    reportGood(temp);  
System.out.print("\nPlease enter temperature setting(0 to exit): ");
temp=in.nextInt();
}
}
public static boolean goodDigits(int temp)
{int d1,d2,d3;
d1=temp%10;
d2=temp/10%10;
d3=temp/100;
if(d1==1||d2==1||d3==1||d1==4||d2==4||d3==4||d1==7||d2==7||d3==7)
    return false;
else
    return true;
}
public static void reportBad(int temp)
  {int large,small;
   small=temp-1;
   while(!goodDigits(small))
       {small--;
       }
   large=temp+1;
   while(!goodDigits(large))
       {large++;
       }
   System.out.println("The keypad circuitry is not working properly.");
   System.out.println("The temperature setting of "+temp+" does not work.");
   System.out.println("The next smallest temperature is "+small+".");
   System.out.println("and the next largest temperature is "+large+".");

  }

public static void reportGood(int temp)
  {System.out.println("The temperature will be set to "+temp+".");
  }
}
