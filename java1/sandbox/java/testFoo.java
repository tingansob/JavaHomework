import java.util.*;
public class testFoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        greeting(in);
    }

    public static void greeting(Scanner in) {
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello "+name);
    }

}
