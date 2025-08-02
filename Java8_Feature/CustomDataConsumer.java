import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CustomDataConsumer {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1,"Menal","menal@gmail.com",532.8));
		list.add(new Employee(2,"sonal","sonal@gmail.com",690.9));
		list.add(new Employee(3,"hetal","hetal@gmail.com",789.3));
		
		Consumer<List<Employee>> cons=(l1)->{
			for(Employee i:l1) {
				System.out.println(i.id*2);
				System.out.println("Hello "+i.name);
				System.out.println("My email id is "+i.email);
				System.out.println(i.salary-100.0);
				System.out.println(" *************************** ");
			}
		};
		cons.accept(list);
	}
}
class Employee{
	int id;
	String name;
	String email;
	double salary;
	
	public Employee(int id, String name, String email, double salary) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
}
