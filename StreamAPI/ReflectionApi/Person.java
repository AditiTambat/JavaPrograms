package ReflectionAPI;

public class Person {
	
	String name;
	private double salary;
	
	Person(){
		
	}
	
//	private double getSalary(double salary) {
//		return salary;
//	}
	
	private void getSalary() {
		System.out.println("salary is "+this.salary);
	}
}
