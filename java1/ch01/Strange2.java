import java.util.*;
// Created by tingansob on 10/29/2017 at 12:17:15 AM
public class Strange2
{
    public static void main(String[] args)
    {
        first();
        third();
        second();
        third();
        test();
    }

    public static void first() {
        System.out.println("Inside first method.");
    }

    public static void second() {
        System.out.println("Inside second method.");
        first();
    }
    
    public static void third() {
        first();
        second();
        System.out.println("Inside third method.");
    }
    public static void test()
    {
        System.out.println("\n\tTesting Self Check 2.17 maxMin");
        int max;
        int min = 10;
        max = 17 - 4 / 10;
        max = max + 6;
        min = max - min;
        System.out.println(max * 2);
        System.out.println(max + min);
        System.out.println(max);
        System.out.println(min);
    }
        
}

