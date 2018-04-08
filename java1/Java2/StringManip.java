import java.util.*;
public class StringManip{
    public static void main(String[] args){
        String name1 = "JohN dOe";
        String name2 = "JohN joE dOe";
        System.out.println(fixName(name1));

    }
    public static String fixName(String name){
        name = name.toLowerCase();
        //name.substring(0,1);
        (name.substring(0,1));
        return name;
    }

}
