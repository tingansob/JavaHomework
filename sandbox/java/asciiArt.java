public class asciiArt {

   public static final int Height = 9, Width = 4;

      public static void main(String[] args) {

        System.out.println("\nHeight of the rectangle = 5\n\nWidth of the rectangle = 4\n\n");

        UniversalStadium();  /* The first part of wall to enter */

        WorldStadium();

        

     }

           

   public static void UniversalStadium() {   /* The header of entrance. The front gate of Universe */

         gateoneTone();

     }

     

   public static void gateoneTone() {

        System.out.print(" ");

          for (int i=1; i<=4; i++) {

        System.out.print(".");

        System.out.print("+\"+");}

        System.out.println(".");

     }   

                      

   public static void WorldStadium() {    /* The height of the tower which builts up the entrance */

         for(int i=1; i<=5; i++) {

              Sector1();

              Sector2();         } 

              Sector1();         

              Sector12();

     }

    public static void Sector1() {

                { System.out.print("(");

                for (int j=1; j<=4*4+1; j++) {

                  System.out.print(" "); }

                System.out.println(")");

         }

    }

    

    

         

     public static void Sector2() {

           System.out.print(" )"); {

         for (int j=1; j<=4*4-1; j++) {

               System.out.print(" "); }

             System.out.println("(");

          }

          

 }                                                                          

     public static void Sector12() {       /*  Same as the tower but ending of the height */

       System.out.print(" ");

          for (int i=1; i<=4; i++) {

       System.out.print(".");

       System.out.print("+\"+"); }

       System.out.println(".");

    }

  

           

     

}


