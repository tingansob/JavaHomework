import java.util.*;
public class input
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n,m;
		double a,b;
		String s1,s2;
		System.out.print("Enter an integer: ");   //get 2 integers
		n=in.nextInt();
		System.out.print("Enter an integer: ");
		m=in.nextInt();
		System.out.println("n= "+n+" m= "+m);     //and output them
		System.out.print("Enter a real number: "); //get a real
		a=in.nextDouble();
		System.out.println("a= "+a);              //and outputit
		in.nextLine();                            //since each of the above inputs until it gets to a whitespace
											  //I have to get rid of the enter before I use nextLine(), because nextLine does read the enter
											  //not before next() since that also reads until a whitespace and therefore doesn't read the enter
		System.out.print("Enter a string: ");
		s2=in.nextLine();
		System.out.println("s2= "+s2);
		System.out.print("Enter a string: ");
		s1=in.nextLine();
		System.out.println("s1= "+s1);

	}

}
