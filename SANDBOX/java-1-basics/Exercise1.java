import java.util.*;
public class Exercise1{
    public static void main(String[] args){
        String[] nums = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println("*************");

        for (int i = 0; i<=nums.length-1; i++){
            System.out.println("* "+(i+1)+" * "+nums[i]+" *");
            //System.out.println(nums[i]);
        }
            System.out.println("*************");
    }
}
