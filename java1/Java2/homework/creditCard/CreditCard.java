public class CreditCard{

/*---Instance Variables-------------------------------------------------------------------- */
    private String name;
    private int cardNumber;
    private int balance;
    private int cvc;
    private int memberPoints;
    private double spendingLimit;
    private double interestRate;


/*---Constructors--------------------------------------------------------------------------- */
    CreditCard(){
        cardNumber = 10000000;
        spendingLimit = 2000;
        balance = 0;

    }

    CreditCard(String n, int mp, double i){
        this();
        name = n;
        memberPoints = mp;
        interestRate = i;
        cardNumber++;
        // include a way for random secure cvc assignment

    }
    

/*---Accessors--------------------------------------------------------------------------- */

    public String getName() { return name; }

    public int getCardNumber() { return cardNumber; }

    public int getBalance() { return balance; }

    public int getMemberPoints() { return memberPoints; }

    public double getSpendingLimit() { return spendingLimit; }

    public double getInterestRate() { return interestRate; }

/*---Modifiers--------------------------------------------------------------------------- */
    
    public void setName(String n) { name = n; }

    public void setMemberPoints(int p) { memberPoints = p; }

    public void setSpendingLimit(double nl) { spendingLimit =nl; } 

    public void setInterestRate(double ir) {interestRate = ir; }



/*---Methods--------------------------------------------------------------------------- */

    public double increaseMemberPoints(int points) {
        // increase member points with purchases
        memberPoints += points;
        return memberPoints;
    }

    public double buyItem(Scanner in, Item[] thing , int x){
        System.out.println("Got it");
        for (int i=0; i<=x; i++) 
        {
            thing[i] = new Item(in);
        }
        balance += thing[i].getSalePrice();
        
        /*Pass array for creation of shopping cart.
         * TODO
         * make shopping cart do the foloowing
         *     add item to cart/array
         *     increase balance by purchase amount
         *     calculate tax
         *     present bill
         *     update shopping cart
         *     increase member points */
        return balance;
    }




/*---ToString--------------------------------------------------------------------------- */
    public String toString(){
        return "Card Info"+"\n"+"---------"+"\n"+
               "-> Name On Card\t\t"+name+"\n"+
               "-> Card Number\t\t"+cardNumber+"\n"+
               "-> Balance\t\t"+balance+"\n"+
               "-> Spendign Limit\t"+spendingLimit+"\n"+
               "-> Interest Rate\t"+interestRate+"\n"+
               "-> Memeber Points\t"+memberPoints+"\n";
    } //END toString

} // END CreditCard class
