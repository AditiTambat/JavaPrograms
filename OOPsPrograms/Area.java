
public class Area {
	public float area(float r) {
		//System.out.println("Area of circle "+(3.14*r*r));
		return 3.14f * r* r; //if replace float instead of float
	}
	public void area(int l, int b) {
		System.out.println("Area of rectangle "+(l*b));
	}
	public void area(float hei, float base) {
		System.out.println("Area of triangle "+(0.5 * hei* base));
	}
	public void area(int side) {
		System.out.println("Area of square "+(side*side));
	}

	public static void main(String[] args) {
		Area a1 = new Area();
		System.out.println("area of circle "+ (a1.area(3.5f)));
		//a1.area(3.4f);
		a1.area(35);
		a1.area(45,50);
		a1.area(75.0f, 35.0f);

	}

}
