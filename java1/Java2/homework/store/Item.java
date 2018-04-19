public class Item{

    // Instance Variables
    private String name;
    private String vendor;
    private double salePrice;
    private double costPrice;
    private double weight;
    private boolean taxable;
    private double GProfit;

    // Constructor
    Item(String productName, double itemCost, double sellingPrice){
        name = productName;
        costPrice = itemCost;
        salePrice = sellingPrice;
        weight = 1;
        taxable = true;
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


    public double grossProfit(){
        GProfit = profit()*2;
        return GProfit;
    }

    public void Profit(){
        System.out.println(GProfit);
    }
}
