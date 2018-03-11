import java.util.*;
public class Input2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,m;
        double a,b;
        String s1,s2;
        System.out.print("Enter an integer: ");
        n=in.nextInt();
        System.out.print("Enter an integer: ");
        m=in.nextInt();
        System.out.println("n= "+n+" m= "+m);
        System.out.print("Enter a real number: ");
        a=in.nextDouble();
        System.out.println("a= "+a);
        in.nextLine();
        System.out.print("Enter an string: ");
        s1=in.nextLine();
        System.out.println("s1= "+s1);
        in.nextLine();
        System.out.print("Enter an string: ");
        s2=in.nextLine();
        System.out.println("s2= "+s2);
    }
}
