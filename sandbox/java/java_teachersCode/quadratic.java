//import java.util.*;
public class quadratic
{public static void main(String[] args)
  {Scanner in=new Scanner(System.in);
  double sol1,sol2,a,b,c,den,disc;
  a=getValue(in);
  b=getValue(in);
  c=getValue(in);
  den=denominator(a);
  disc=discriminant(a,b,c);
  sol1=solution(b,den,disc);
  sol2=solution(b,den,-disc);
  output(sol1,sol2);
  }
public static double getValue(Scanner in)
  {double num;
   System.out.print("enter a value: ");
   num=in.nextDouble();
   return num;
  }
public static double denominator(double a)
  {return 2*a;
  }
public static double discriminant(double a, double b, double c)
  {double disc;
   disc=Math.pow(b,2)-4*a*c;
   disc=Math.sqrt(disc);
   return disc;
  }
 public static double solution( double b, double den,double disc)
   {return (-b+disc)/den;
   }
public static void output(double sol1, double sol2)
   {System.out.println("the solutions are "+sol1+" and "+sol2);
   }   
}