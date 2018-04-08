import java.util.* ;
 public class CpsixtyTwo
 {
  public static void main(String[] args) 
 {
  Scanner x = new Scanner(System.in) ;
   double hourlyRate ;
   double hourlyWorked ;
   double grossPay ;
   double federalTax ;
   double stateTax ;
   double taxdeduction;
   double netPay; 
     
   System.out.print("EmploysName: ");
   String EmploysName = x.nextLine() ;
  
  System.out.print("hourlyRate:  ");
   hourlyRate = x.nextDouble();
   
  System.out.print("hourlyWorked:  ");
   hourlyWorked = x.nextDouble() ;
  
   grossPay = hourlyRate * hourlyWorked;
   System.out.print(" total grossPay income of "+ EmploysName +" is:  ");
   System.out.println();
   
   federalTax = grossPay * 0.6 ;
    System.out.print("federalTax of "+ EmploysName + "is:  ") ;
    System.out.println();
     
   stateTax = grossPay * 0.13 ;
    System.out.print("stateTax of "+ EmploysName+ "is:  ");
    System.out.println();
    
    taxdeduction = grossPay * 0.05 ;
    System.out.print("tax deduction:  ") ;
    System.out.println();
    
    netPay = grossPay - taxdeduction ;
     System.out.print("netPay:  ") ;
     System.out.println();
     
  } 
   }
