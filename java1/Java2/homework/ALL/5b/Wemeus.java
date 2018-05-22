/*
Design a class that stores information about products that are sold in a store. Write a class named Item that has (at least) the following member variables:

name: a String that holds the name of the inventory item.
vendor: a String that stores the name of the vendor for the product.  
salePrice: a double that stores the current selling price of the item (how much the customer pays to buy it).
costPrice: a double that stores the current cost price of the item (how much the store pays to acquire it).
weight: a double that stores the weight of a single item of this type.
taxable: a boolean field that indicates whether or not tax is charged on the item. 
Make sure to choose appropriate access specifiers for the data members and methods in your Item class.

In addition, the class should have the following member methods:

Constructor. The constructor should accept the item’s name, cost price, and selling price as arguments and assign these values to the object's name, costPrice, and salePrice member variables. The constructor should initialize the weight to 1 and taxable to true.
Accessors. Appropriate accessor methods should be created to allow values to be retrieved from an object's name, vendor, salePrice, weight, and taxable member variables.
Mutators.  Appropriate mutator methods should be created to allow values to be changed in an object’s weight and taxable fields.
increaseCost.  This method should increase the cost price by 1 dollar.  This is a void method since it modifies the current state of the object.
profit.  This method should accept no parameters and return the profit on the item, which is calculated as the cost price subtracted from the selling price.
Demonstrate the class in a program that creates an Item object.  Then increase the cost 3 times by a dollar, calculate the profit and display it on the screen.  Call the mutator method that sets the weight to a number you specify.  Create several other Item objects and see that the fields have different values.

If your Item class is written properly, the following lines of code should be valid in your main method:

Item chair = new Item("Desk Chair", 30, 55);
//increase cost price by $3.

chair.increaseCost();

chair.increaseCost();

chair.increaseCost();

//display the profit

System.out.println("The chair’s profit is now $" + chair.profit());

//set the chair’s weight to 7 lb

chair.setWeight(7);

 

Item table = new Item("Picnic Table”, 70, 88);

System.out.println("The table’s profit is now $" + table.profit());
 */
import java.util.*;
public class Wemeus{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Util make = new Util();
        Item water = new Item();
        Item gum = new Item("Gum", .05, .6);

        String vendor;

        System.out.println("Initial Profit "+water.profit());
        water.increaseCost();
        water.increaseCost();
        water.increaseCost();
        System.out.println("Profit after cost increase "+water.profit());
        water.setSalePrice(5);
        System.out.println("Profit after cost increase "+water.profit());
        water.decreaseCost();
        System.out.println("Profit after cost increase "+water.profit());
        water.decreaseCost();
        water.decreaseCost();
        water.setSalePrice(1.5);
        System.out.println("Profit after cost increase "+water.profit()); 

        gum.setVendor("Doublemint");
        Item chair = new Item("Desk Chair", 30, 55);
        //increase cost price by $3.


        
        chair.increaseCost();
        chair.increaseCost();
        chair.increaseCost();

        //display the profit
        System.out.println("The chair’s profit is now $" + chair.profit()); 
        //set the chair’s weight to 7 lb 

        chair.setWeight(7);
        Item table = new Item("Picnic Table", 70, 88); 
        System.out.println("The table’s profit is now $" + table.profit());
        table.increaseCost();
        table.increaseCost();
        table.increaseCost();
        table.increaseCost();
        table.increaseCost();
        table.setSalePrice(95);
        System.out.println("The table’s profit is now $" + table.profit());
        
        System.out.println(water);
        System.out.println(chair);
        System.out.println(gum+" "+gum.profit());
        gum.setSalePrice(.10);
        System.out.println(gum+" "+gum.profit());
        System.out.println(table);

        make.space(2);
    } // END main
} // END Class
