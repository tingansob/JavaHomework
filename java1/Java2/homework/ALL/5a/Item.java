/*  Kevin George Rusty
 *
 *
Design a class that stores information about products that are sold in a store. 

Write a class named Item that has (at least) the following member variables:

name: a String that holds the name of the inventory item.
vendor: a String that stores the name of the vendor for the product.  
salePrice: a double that stores the current selling price of the item (how much the customer pays to buy it).
costPrice: a double that stores the current cost price of the item (how much the store pays to acquire it).
weight: a double that stores the weight of a single item of this type.
taxable: a boolean field that indicates whether or not tax is charged on the item. 
*** Make sure to choose appropriate access specifiers for the data members and methods in your Item class.

In addition, the class should have the following member methods:

- Constructor 
    The constructor should accept the 
        item’s name, 
        cost price, and 
        selling price as arguments and 
    assign these values to the object's name, costPrice, and salePrice member variables. 
    The constructor should initialize the weight to 1 and taxable to true.

- Accessors 
    Appropriate accessor methods should be created to allow values to be retrieved from an object's 
        name, 
        vendor, 
        salePrice, 
        weight, and 
        taxable member variables.

- Mutators
    Appropriate mutator methods should be created to allow values to be changed in an object’s 
        weight and 
        taxable fields.

- increaseCost.  
    This method should 
        increase the cost price by 1 dollar.  
    This is a void method since it modifies the current state of the object.

- profit  
    This method should 
    accept no parameters and 
    return the 
        profit on the item, which is calculated as the 
        cost price subtracted from the selling price.

        
Demonstrate the class in a program that creates an Item object.  
    Then increase the cost 3 times by a dollar, 
    calculate the profit and 
    display it on the screen.  
    Call the mutator method that 
    sets the weight to
        a number you specify.  
    Create several other Item objects and see that the fields have different values.

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
public class Item{
    // instance variables
    private String name;
    private String vendor;
    private double salePrice;
    private double costPrice;
    private double weight;
    private boolean taxable;

    Item(){
        this("Water", "WEMEUS", 1, .15, .9, false);
    }

    Item(String name, String vendor, double salePrice, double costPrice, double weight, boolean taxable){
        this.name = name;
        this.vendor = vendor;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
        this.weight = weight;
        this.taxable = taxable;
    }

    Item(String name, double costPrice, double salePrice){
        this.name = name;
        this.vendor = "Affiliate";
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.weight = 1;
        this.taxable = true;
    }


    /**
     * Accessors
     */

    public String getName(){ return name; }
    public String getVendor(){ return vendor; }
    public double getSalePrice(){ return salePrice; }
    public double getCostPrice(){ return costPrice; }
    public double getWeight(){ return weight; }
    public boolean getTaxable(){ return taxable; }

    /**
     * Mutators
     */

    public void setName(String newName){ this.name = newName; } 
    public void setVendor(String newVendor){ this.vendor = newVendor; } 
    public void setSalePrice(double newPrice){ this.salePrice = newPrice; } 
    public void setWeight(double newWeight){ this.weight = newWeight; } 
    public void setTaxable(boolean isTaxible){ this.taxable = isTaxible; } 

    /**
     * toString
     */
    public String toString(){
        return "=> "+name+" brought to you by "+vendor;
    }

    /**
     * Methods
     */
    public void increaseCost(){
        this.costPrice++;
    }
    public void decreaseCost(){
        this.costPrice--;
    }

    public double profit(){
        return salePrice - costPrice;
    }

    

}

