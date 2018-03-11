import java.util.*;
public class triangleHEC
{public static void main(String[] args)
{Scanner in=new Scanner(System.in);
int a,b,c,asq,bsq,csq;
double s,area;
System.out.print("Enter side 1: ");
a=in.nextInt();
System.out.print("Enter side 2: ");
b=in.nextInt();
System.out.print("Enter side 3: ");
c=in.nextInt();
if(a<=0||b<=0||c<=0)
      System.out.println("Invalid data entered.  This data will be ignored");
else if( b+c>a&& a+c>b&& a+b>c)
     {if(a==b&&b==c)
	       {System.out.println("all sides equal-equilateral");
			  draw(a);
			 }
      else if(a==b||a==c||b==c)
		    {System.out.println("2 sides equal-isosceles"); 
			 if(a==b||a==c)
			     draw(a);
			 else 
			     draw(b);
			 }
		else
		    System.out.println("no sides equal-scalene"); 
		asq=a*a;
		bsq=b*b;
		csq=c*c;		
		if(asq+bsq==csq||asq+csq==bsq||bsq+csq==asq)
       		System.out.println("It is a right triangle triangle");
		else
     			  System.out.println("It is not a right triangle triangle");

	 
	  s=(a+b+c)/2.;
     area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
     System.out.println("Area="+area);
	  }
else
     System.out.println("Not sides of a triangle");
}
public static void draw(int a)
{int i,j;
for(i=1;i<=a;i++)
     {for(j=1;j<=i;j++) 
	     System.out.print("*");
	   System.out.println();
		}
}
}