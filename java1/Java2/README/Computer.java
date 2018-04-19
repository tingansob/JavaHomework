public class Computer
{
   //data members 
   double memorySize; //Gb
   String location;
   double storageCapacity; //Tb
   double processorSpeed; //Ghz
   String processorType;
   boolean networkConnectivity; //is there network connectivity on the device?
   boolean hasPrinter;
   boolean hasMonitor;
   //inputDevices
   //outputDevices
   int numPorts;
   //typesOfPorts //String array
   double temperature;
   //UI
   String operatingSystem;
   //applicationPrograms  
   //sound 
   //color
   
   void connectMonitor()
   {
      hasMonitor = true;
   }
   
   void disconnectMonitor()
   {
      hasMonitor = false;
   }
   
   void addMemory(double memToAdd)
   {
      if(memToAdd > 0)
         memorySize += memToAdd;
   
   }
   
   
   public static void main(String [] args)
   {
      Computer officeComputer;
      officeComputer = new Computer();
      officeComputer.location = "F324";
      officeComputer.storageCapacity = 5;
      officeComputer.connectMonitor();
      officeComputer.addMemory(4);
      
      Computer laptopComputer = new Computer();
      laptopComputer.location = "car";
      laptopComputer.storageCapacity = .5;
      
      System.out.println("my office computer is located in "+officeComputer.location +" has "+officeComputer.storageCapacity +" TB");
      System.out.println("my laptop computer is located in "+laptopComputer.location +" has " +laptopComputer.storageCapacity+" TB");
      
      
   }
   
}
