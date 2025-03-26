
public class Test {
	public static void main(String[] args) {
		CivilEngineer c1 = new CivilEngineer();
		System.out.println("Enter the details of civil Engineer");
		c1.setData();
		c1.showData();
		c1.survey();
		
		MecanicalEngineer m1 = new MecanicalEngineer();
		System.out.println("Enter the details of mechanical engineer");
		m1.setData();
		m1.showData();
		m1.motorDesign();
	}
}
