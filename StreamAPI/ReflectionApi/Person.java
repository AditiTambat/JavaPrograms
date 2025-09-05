package ReflectionApi;

public class Person {
	
	int birthdate;
	String name;
	private String email;
	protected String address;
	public String profession;
	
	 Person(String email) {
		
	}
	
	public Person(){
		
	}
	
	private Person(String email,String profession) {
		
	}
	
	
	public void addresschange() {
		System.out.println("address public method");
	}
	
	private void getName(String name) {
		
	}
	
	
	
	
}
