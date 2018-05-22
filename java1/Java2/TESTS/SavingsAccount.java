// Kevin George Rusty

public class SavingsAccount extends BankAccount{
   
     protected double interestRate;
     
   //constructors

SavingsAccount(){
   this(.4);
}
SavingsAccount(double rate){
   interestRate = rate;
   super.currBalance = 500.00;
   }
   
   // Accessors
   
   public double getIRate(){
   return interestRate;
   }
   
   
   
   // toString
public String toString(){
   int num = getAcctNum();
   double bal = getAcctBal();
   return "This is the Savings Account # " +num+ "\nBalance = "+bal;

}

}
