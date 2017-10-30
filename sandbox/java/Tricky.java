public class Tricky {
    public static void main(String [] args) {
        message1();
        message2();
        System.out.println("Done withm ain.");
        }

        public static void message1() {
            System.out.println("This is message1.");
        }

        public static void message2() {
            System.out.println("This is message2.");
            message1();
            System.out.println("Done with message2.");
            }
}
