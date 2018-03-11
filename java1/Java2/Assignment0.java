// Kevin George Rusty
public class Assignment0 {
    public static void main(String[] args){
        double item1=15.00, item2=3.00, item3=8.00, tip10=0.1, tip12=0.12, tip15=0.15, total=(item1+item2+item3);
        greeting();
        space(1);
        System.out.println("Your Order");
        System.out.println(" - Chicken & Waffles\t$15.00");
        System.out.println(" - Half & Half\t\t$ 3.00");
        System.out.println(" - Peach Cobbler\t$ 8.00");
        System.out.printf("\tTotal: "+total);
        space(1);

        // calculate tip for 10%, 12% and 15%
        System.out.println("Not sure how much to tip? Here's a handy guide to help:");
        System.out.printf("10%% gratuity = $%.2f\n",(total*tip10));
        System.out.printf("12%% gratuity = $%.2f\n",(total*tip12));
        System.out.printf("15%% gratuity = $%.2f\n",(total*tip15));
        space(1);
        System.out.println("Thank you for your order.\nCome again soon.");
    }
    
    public static void greeting() {
        space(1);
        System.out.println("Welcome to the Rusty Skpper");
        System.out.println("Voted the best pesudo meal at Kingsborough 2018");
    }


    public static void space(int a){
        for (int i=0;i<=a;i++) 
            System.out.println();
    }
}
