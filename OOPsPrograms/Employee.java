
public class Employee {
	int empid;
	String name;
	String address;
	int salary;
	int deptno;
	
	public void setData() {
		empid = 101;
		name = "Radha";
		address = "Pune";
		salary = 35000;
		deptno = 1903;
	}
	
	public void printData() {
		System.out.println("EmpId: "+empid);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
		System.out.println("DeptNo: "+deptno);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setData();
		e1.printData();

	}

}
