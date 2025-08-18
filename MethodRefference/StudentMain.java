package Methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StudentMain {
	public static void main(String[] args) {
//		Supplier<Integer> supplier = Student::display;
//		System.out.println(supplier.get());
		
		Student.id=100;
		Supplier<Integer> ids=Student::displayid;
		
		Supplier<Student> students = Student::create;
		
		Supplier<List<Student>> a1 = Student::createlist;
		
		System.out.println(ids.get());
		System.out.println(students.get());
		
		System.out.println(a1.get());
	}

}

class Student{
	static int id;
	String name;
	
	public Student() {
		System.out.println("Object created..");
	}
	
	public static int displayid() {
		return id;
	}
	
	public static Student create() {
		return new Student();
	}
	
	public String toString() {
		return "printing something";
	}
	
	public static List<Student> createlist(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		
		return list;
	}
}
