
public class Student {
	int roll;
	String name;
	int marks;
	
	public void setData() {
		roll = 1;
		name = "Aditi Tambat";
		marks = 70;
	}
	
	public void printData() {
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData();
		s1.printData();
	}

}
