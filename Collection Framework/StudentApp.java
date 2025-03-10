import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentApp {
	static Scanner sc;
	static ArrayList<Student> studentlist ;
	public static void addstudent() {
		int r,f,p;
		String n,a,e,m,c,s;
		
		System.out.println("Enter the Student Roll No.");
		r=sc.nextInt();
		
		System.out.println("Enter the Student Name");
		n=sc.next();
		
		System.out.println("Enter the Student Address:");
		a=sc.next();
		
		//sc.nextLine();
		System.out.println("Enter the Mobile No.:");
		m=sc.next();
		
		System.out.println("Enter the student Email:");
		e=sc.next();
		
		System.out.println("Enter the Student Course:");
		c=sc.next();
		
		System.out.println("Enter the Course Fees: ");
		f=sc.nextInt();
		
		System.out.println("Enter the student pandingfees: ");
		p=sc.nextInt();
		
		System.out.println("Enter the course status:");
		s=sc.next();
		
		Student s1 = new Student(r,n,a,e,m,c,s,f,p);
		
		studentlist.add(s1);
			
	}
	public static void main(String[] args) {
		int opt = 0;
		studentlist = new ArrayList();
		sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Add a new student");
			System.out.println("2. Show all student");
			System.out.println("3. Delete any student");
			System.out.println("4. Update student details");
			System.out.println("5. Show students whose fees pending ");
			System.out.println("6. Show all students whose fees paid");
			System.out.println("7. 'Java' course students list");
			System.out.println("8. Show all students living in 'Pune'");
			System.out.println("9. Show all students whose course completed");
			System.out.println("10. Exit");
			System.out.println("Enter your option:");
			opt=sc.nextInt();
			switch(opt) {
			case 1: addstudent();
					break;
			case 2: showstudent();
					break;
			case 3: deletestudent();
					break;
			case 4: updatedetail();
					break;
			case 5: feespending();
				    break;
			case 6: feespaid();
					break;
			case 7: javacoursestud();
					break;
			case 8: punelivingcity();
					break;
			case 9: coursecompleted();
					break;
			}
		}while(opt!=10) ;
	}
	
	public static void coursecompleted() {
		for(Student s1 : studentlist) {
			if(s1.getCoursestatus().equalsIgnoreCase("completed")) {
//				System.out.println(s1);
				System.out.println(s1.getRoll()+ " "+s1.getName());
				 System.out.printf("%d5%s10%s20%s20%s20%s10%.2f\t%.2f\t%s%n", 
			                s1.getRoll(), s1.getName(), s1.getAddress(), s1.getMobile(), 
			                s1.getEmail(), s1.getCourse(), s1.getFees(), s1.getPendingfees(), 
			                s1.getCoursestatus());			}
		}
	}
	public static void punelivingcity() {
		for(Student s1 : studentlist) {
			if(s1.getAddress().equalsIgnoreCase("pune")) {
				System.out.println(s1);
			}
		}
	}
	public static void javacoursestud() {
	   for(Student s1 : studentlist) {
		   if(s1.getCourse().contains("java")) {
		    System.out.println(s1);
		   }
	   }
	}
	public static void feespaid() {
		for(Student s1 : studentlist) {
				if(s1.getPendingfees() == 0) {
					System.out.println(s1);
				}  
		}	
	}
	public static void feespending() {
		for(Student s1 : studentlist) {
			if(s1.getPendingfees() != 0) {
				System.out.println(s1);
			}
		}
	}
	public static void updatedetail() {
		System.out.println("Enter the Roll No. of Student:");
		int r = sc.nextInt();
		sc.nextLine();
		int f,p;
		String n,a,e,m,c;
		for(Student s : studentlist) {
			if(s.getRoll() == r) {
				System.out.println("Enter the Student updated Name");
				s.setName(sc.next());
				
				System.out.println("Enter the Student updated Address:");
				s.setAdd(sc.next());
				
				System.out.println("Enter the  updated Mobile No.:");
				m=sc.next();
				s.setMobile(m);
				
				System.out.println("Enter the student updated Email:");
				e=sc.next();
				s.setEmail(e);
				
				System.out.println("Enter the Student updated Course:");
				c=sc.next();
				s.setCourse(c);
				
				System.out.println("Enter the Course updated Fees");
				f=sc.nextInt();
				s.setFees(f);
				
				System.out.println("Enter the student updated pandingfees");
				p=sc.nextInt();
				s.setPendingfees(p);
			}
		}
		
	}
	
	public static void deletestudent() {
		System.out.println("Enter the Roll No. of Student:");
		int r = sc.nextInt();
//		Iterator <Student> i1 = studentlist.iterator();
//		while(i1.hasNext()) {
//			Student s1 = i1.next();
//			if(s1.roll == r) {
//				i1.remove();
//				System.out.println("The Student details deleted successfully !!!");
//			}
//		}
		
		for(Student s : studentlist) {
			if(s.getRoll() == r) {
				studentlist.remove(s);
				System.out.println("The student is deleted !!!");
			}
		}
	}
	
	public static void showstudent() {
		System.out.println("Details filled Successfully !!");
		System.out.println("\n Roll     Name     Address       Email     Mobile     Course    Fees     PendingFees");
		System.out.println("\n ----------------------------------------------------------------------------------");
		Iterator <Student>i1 = studentlist.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
//		for(Student s1 : studentlist) {
//			System.out.println(s1);
//		}
			
		
	}
}
