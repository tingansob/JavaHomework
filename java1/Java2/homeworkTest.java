import java.util.*;
public class homeworkTest {
    public static void main(String[] args) {
        ques1();
        /* quest2 for (int k=100;k>10;k++) {System.out.println(k*5);}*/
        ques3();
        

        ques4();

        for (int i=5;i<=18;i+=3)
            for (int j=10;j<=i;j+=2)
                System.out.println("Hello "+ i);
    }

    public static void ques1() {
        System.out.print(" Question One - ");
        int n=8,
            sum=5;
        for (int val=14;val>=n;val-=2)
        {
            sum +=val;
        }
        System.out.println(sum);
        System.out.println();

    }

    public static void ques3(){
        System.out.println(" Question Three - ");
        int j=10,
            k=40;
        while(j<k)
        {
            j+=k/10;
            System.out.println(j);
        }
    } // END question 3

    public static void ques4() {
        int i, j;
        for (i=1;i<=4;i++)
        {
            j=4;
            while(i != j && j > 1)
            {
                System.out.println(i+" " +j);
                j--;
            }
            System.out.println(i+" " +j);
        }
    }


} // END class homeworkTest
