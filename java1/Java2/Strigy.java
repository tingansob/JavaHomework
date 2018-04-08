import java.util.*;
public class Strigy{
    public static void main(String[] args){
        String name="Kevin George Rusty";
        String answer='y';

        while (answer!='n'){

            /*
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.substring(6,12));
        System.out.println(name.toLowerCase());
        int x=name.indexOf("Rusty");
        System.out.println(x);
        String lName=name.substring(x,x+5);
        System.out.println(lName);
        */
        Scanner in = new Scanner(System.in);
        System.out.print("Continue? Y/n ");
        answer = in.nextLine();
        answer = answer.toLowerCase();
        answer = answer.charAt(0);
        System.out.println(answer);
        

        }



    } //END main
} //END class
