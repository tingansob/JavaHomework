public class Dog {
	
	private String breed;
	private double weight;	
	
	Dog(){
		breed = "Mixed";
		weight = convertWeight(-1);
		}
	
	Dog(String type, int w){
		breed = type;
		weight = convertWeight(w);
		}

	
	private double convertWeight(double a) {
		return a * 0.45;
	}

	public void growl() {
		System.out.println("I am fragile.");
	}
	
	public void bark() {
		if (breed == "Mixed") {
			System.out.println("I'm a "+breed+" breed dog.");}
		else {
			System.out.println("I am a "+breed+".");}
		
		
		if (weight>0) {
			System.out.println("I am a healthy "+weight+" kilo dog.");}
		else {
			growl();}
		
		System.out.println();
	}
	
	
}
