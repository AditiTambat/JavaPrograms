package Methodref;

public class Laptop {
	
	public static String lapCompany(String name) {
		return name;
	}

	public static void main(String[] args) {
		
		LaptopInterface<String> lap = Laptop::lapCompany;
		System.out.println(lap.lapCompany("Lenovo"));
		
	}

}

@FunctionalInterface
interface LaptopInterface<T>{
	public T lapCompany(T t);
			
}