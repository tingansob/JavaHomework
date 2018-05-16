// Kevin George Rusty
import java.util.*;
   public class BankAccount{

   //Instance Variables for Bank Account Class
   
   protected int acctNum;   
   protected double currBalance;
// MAIN 
public static void main(String[] args){
   
   BankAccount[] accounts = new BankAccount[3];
   accounts[0] = new BankAccount();
   accounts[1] = new SavingsAccount();
   accounts[2] = new CheckingAccount();

   for (int i=0;i<3; i++){
      System.out.println(accounts[i]);
      }

} // END main

   //constructors
   BankAccount(){
      this(1110, 0.00);
      }
    
   BankAccount(int a, double b){
      acctNum=a;
      currBalance=b;
      }   
   // Accessors
   
   public int getAcctNum(){return acctNum;}
   public double getAcctBal(){return currBalance;}
   
   // Setters
   
   public void setAcctNum(int a){
      acctNum = a;
      }
   
   public void setBalance(double newBal){
      currBalance = newBal;
      }
   
   // toString
   public String toString(){
   return "The primary Bank Account has a current balance of "+currBalance+", For account # "+acctNum;
   }

   // equals 
   public boolean equals(BankAccount x){
    return (x.currBalance == currBalance) && (x.acctNum == acctNum);
   }

}
