
public class NoteBook {
	int pages;
	float price;
	String brand;
	String size;
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	// parametrised constructor
	public NoteBook(int pages, float price, String brand, String size) {
		this.pages = pages;
		this.price = price;
		this.brand = brand;
		this.size = size;
	}
	//default constructor
	public NoteBook() {
		
	}
	public String toString() {
		return "NoteBook company: " +this.brand 
				+ "\nprice: "+ this.price 
				+ "\npages : " + this.pages
				+ "\nsize: " +this.size;
	}
	
}
//main method is test notebook.java
