public class Book {
	int bookid;
	String title;
	String author;
	float price;
	
	//book getter and setter
	public void setBookId(int b) {
		bookid = b;
	}
	public int getBookId() {
		return bookid;
	}
	//title getter and setter
	public void setTiltle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	//author getter and setter
	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
	//price getter and setter
	public void setPrice(float p) {
		price = p;
	}
	public float getPrice() {
		return price;
	}
	
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBookId(1001);
		b1.setTiltle("Head First Java");
		b1.setAuthor("Bert BatesBert Bates and Kathy SierraKathy Sierra");
		b1.setPrice(694);
		
		System.out.println(b1.getBookId());
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());

	}

}
