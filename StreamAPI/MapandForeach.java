package IntermediatoryOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MapandForeach {
	public static void main(String[] args) {
		List<Person> p1 = new ArrayList<Person>();
		
		p1.add(new Person("Chutki","dholakpur","making laddoos.."));
		p1.add(new Person("Bheem","dholakpur","to give justice everyone.."));
		p1.add(new Person("Kaliya","dholakpur","enoying people.."));
		
		Consumer<Person> con =(i)->{
			System.out.println("Hi, I'm "+i.name);
			System.out.println("I am from "+i.address);
			System.out.println("My hobby is "+i.hobby);
			System.out.println();
		};
		
		p1.stream().forEach(con);
	}
}

class Person{
	String name;
	String address;
	String hobby;
	
	public Person(String name, String address,String hobby) {
		this.name=name;
		this.address=address;
		this.hobby=hobby;
	}
}
