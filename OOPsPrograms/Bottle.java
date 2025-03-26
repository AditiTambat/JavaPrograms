public class Bottle {
	String color;
	String size;
	float price;
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	public void setSize(String s) {
		size = s;
	}
	public String getSize() {
		return size;
	}
	
	public void setPrice(float p) {
		price = p;
	}
	public float getPrice() {
		return price;
	}
	
	//constoctor
	public Bottle() {
		System.out.println(" I am inside constuctor");
		color = "white";
		price = 50;
		size = "small";
	}
	
	public Bottle(String s, String c, float p) {
		size = s;
		color = c;
		price = p;
	}
	public static void main(String[] args) {
		Bottle b1 = new Bottle();
		Bottle b2 = new Bottle("Large", "Black", 60);
		System.out.println(b1.getColor());
		
		System.out.println(b2.getColor());
		

	}

}
