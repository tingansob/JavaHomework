public class Boat{
    String type;
    private int length;
    public int draft; 
    
    public void sound(){
        System.out.println("------");
    }
    
    public Boat() {
        type = "Generic";
        length = 100; // put random generator here
        draft = 3; // put random generator here
    }
    public Boat(String n, int l, int d){
        type = n;
        length = l;
        draft = d;
    }
    
}

