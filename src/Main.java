import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        String name;

        Scanner console = new Scanner(System.in);
        Util make = new Util();
        make.space();
        name = make.getName(console);

        System.out.println("Hello, "+name);
        make.space(3);


    }
}

