
public class Student {
	private int roll;
	private String name;
	private String address;
	private String mobile;
	private String email;
	private String course;
	private String coursestatus;
	private int fees;
	private int pendingfees;
	
	
	public String getCoursestatus() {
		return coursestatus;
	}
	public void setCoursestatus(String coursestatus) {
		this.coursestatus = coursestatus;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public void setAdd(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getPendingfees() {
		return pendingfees;
	}
	public void setPendingfees(int pendingfees) {
		this.pendingfees = pendingfees;
	}
	
	public Student(int roll, String name, String address, String mobile, String email, String course,String coursestatus, int fees,
			int pendingfees) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.course = course;
		this.fees = fees;
		this.pendingfees = pendingfees;
		this.coursestatus = coursestatus;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return  roll + "\t" + name + "\t"+ address + "\t"+ mobile + "\t" + email + "\t" + course + "\t" + fees + "\t" + pendingfees + "\t" + coursestatus ;
	}
	
	
}
