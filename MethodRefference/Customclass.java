package Methodref;

import java.util.ArrayList;
import java.util.List;

public class Customclass {
	
	public static int compareage(Person per1,Person per2) {
		if(per1.age > per2.age) {
			return -1;
		}else if(per1.age < per2.age) {
			 return 1;
		}
		return 0;
	}
	
	public static boolean filterAddress(Person p) {
		return "Maiyapur".equals(p.getAddress());			
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("Tom","Maiyapur",39,"Male");
		Person p2 = new Person("Jerry","Maiyapur",30,"Male");
		Person p3 = new Person("Moana","Ramwadi",29,"Female");
		Person p4 = new Person("Swarts Little","Gitapur",23,"Male");
		Person p5 = new Person("Cindrela","Ramwadi",25,"Male");
		
		List<Person> l1 = new ArrayList<Person>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.add(p5);
		
		l1.stream().sorted(Customclass::compareage).forEach((i)->System.out.println(i));
		
		System.out.println("********* filterAddress ******");
		l1.stream().filter(Customclass::filterAddress).forEach((i)->System.out.println(i));
	}
}

class Person{
	String name;
	String address;
	int age;
	String gender;
	public Person(String name, String address, int age, String gender) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
