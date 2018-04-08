import java.util.*;
public class testScores {
    public static void main(String[] args){
        int count=0;
        int [] grades = new int[5];

        Scanner in = new Scanner(System.in);
            for (int i=0; i<=grades.length-1;i++){
                System.out.print("Please enter grade "+(i+1)+" : ");
                grades[i]=in.nextInt();
            }
            for (int i=0;i<=grades.length-1;i++){
                if (grades[i]<0){
                    count++;
                    System.out.println("Score "+i+" = "+grades[i]);
                }
            }
                    System.out.println("That's "+count+" negative grades");



    }
}
