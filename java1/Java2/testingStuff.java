import java.util.*;
import javax.swing.JOptionPane;
public class testingStuff {
    public static void main(String[] args) {
        int numberOfStore = 5;
        String userStringInput;
        double storeSales;
        int numOfHunDivisions;



        for (int store=1;store<=numberOfStore;store++ ) {
            userStringInput=JOptionPane.showInputDialog("Enter Toays Sales "+store); 
            storeSales=Double.parseDouble(userStringInput); 
            numOfHunDivisions=storeSales/100;
            for(int printAsterisk=1;printAsterisk<=numOfHunDivisions;printAsterisk++)
                System.out.println("hello World");

        }


    }
}
