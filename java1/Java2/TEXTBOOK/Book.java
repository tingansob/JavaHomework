import java.util.*;
public class Book{
    public static void main(String[] args){

        Util make = new Util();
        Scanner console = new Scanner(System.in);
        Chapter01 ch1 = new Chapter01();
        RedundantlessRocket zoom = new RedundantlessRocket();


        boolean finished = false;

        make.space();
        System.out.println("Put the name and info of book here");
        do {
            make.space(2);
            System.out.print(ch1.chInfo());
            System.out.println(" 1 - Draw Rocket");            
            
            //int choice = console.nextInt();
            int choice = make.choice(console);

            if (choice == 1){
                make.space();
                zoom.drawRocket(); 
                make.space();
            }

            if (choice == -1){
                finished = false;
            }
        } while (finished);



    }
}

