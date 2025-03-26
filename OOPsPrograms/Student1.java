
public class Student1 {
	int roll;
	String name;
	
	static String schoolname;
	
	public void show() {
		System.out.println("Roll : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Schoolname :"+schoolname);
	}
	
	public static void test() {
		System.out.println("Schoolname :"+schoolname);
	}
	
	public static void main(String[] args) {
		Student1 s1 = new Student1 ();
		s1.roll = 1;
		s1.name = "Gita";
		s1.schoolname = "MIT";
		s1.show();
		System.out.println();
		System.out.println("using static keyword.");
		Student1.test();
	}
}
