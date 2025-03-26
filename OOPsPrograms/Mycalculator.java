public class Mycalculator {
	public void add(int a, int b) {
		System.out.println("Addition of two ints "+ (a+b));
	}
	
	public void add(float a, float b) {
		System.out.println("Addition of two floats "+ (a+b));
	}
	public static void main(String [] args) {
		Mycalculator m1 = new Mycalculator();
		m1.add(20,25);
		m1.add(30.5f, 45.5f);

	}

}
