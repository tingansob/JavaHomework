import java.util.*;
public class Item{
    Util make = new Util();

    // Instance Variables
    private String name;
    private String vendor;
    private double salePrice;
    private double costPrice;
    private double weight;
    private boolean taxable;

    // Constructor
    
    Item(Scanner in){
        make.space();
        in.nextLine();
        System.out.print("What is the item name?\t");
        name = in.nextLine();
        System.out.print("Who is the Vendor?\t");
        vendor = in.nextLine();
        System.out.print("What is the Sale Price?\t");
        salePrice = in.nextDouble();
        System.out.print("What is the item cost?\t");
        costPrice = in.nextDouble();
        System.out.print("What is the weight?\t");
        weight = in.nextDouble();
        System.out.print("Is this taxable? (y/n)\t");
        String isTaxable = in.next();
        isTaxable = isTaxable.toLowerCase();
        char ans = isTaxable.charAt(0);
        if (ans == 'y'){
            taxable = true; }
        System.out.println("Done.\nThank You");

    }
    

    Item(String productName, String productVendor, double itemCost, double sellingPrice){
        name = productName;
        vendor = productVendor;

        costPrice = itemCost;
        salePrice = sellingPrice;
        weight = 1;
        taxable = false;
    }
    

    // toString Method
    public String toString() {
        String ITEM = "\n----------";
        ITEM += "\n-> Item: "+name;
        ITEM += "\n-> Vendor: "+vendor;
        ITEM += "\n-> Price: "+salePrice;
        ITEM += "\n-> Weight: "+weight;
        ITEM += "\n-> Profit: "+profit();
        if (taxable){ ITEM += "\n-> Taxable"; }
        ITEM +="\n----------\n";
        
            return ITEM;

    }

    // Getters & Setters
    public void setName(String n){ name = n; }
    public String getName(){ return name; }

    public void setVendor(String v){ vendor = v; }
    public String getVendor(){ return vendor; }

    public void setSalePrice(double s){ salePrice = s; }
    public double getSalePrice(){ return salePrice; }

    public void setWeight(double w){ weight = w; }
    public double getWeight(){ return weight; }

    public void setTaxable(boolean t){ taxable = t; }
    public boolean getTaxable(){ return taxable; }
    
    // Methods

    public void increaseCost(){
        costPrice++;

    }

    // Mutuators
    public void changeWeight(double w){
        weight = w;
    }

    public void changeTaxable(boolean x){
        taxable = x;
    }


    public double profit(){
        return salePrice - costPrice;
    }

}
