class FindArea{
 	public static void main(String [] args){
		double r = 5.0;
		double side = 8.0;
		double length = 8.0, breadth = 4.0;
		double rad = 5.0; 
		System.out.println("Area of circle : " +Math.PI * r * r );
		System.out.println("Area of Square : " +side*side );
		System.out.println("Rectangle perimeter : " +(2*(length + breadth)));
	        System.out.println("Volume of sphere : " +(4.0 / 3.0) * Math.PI * Math.pow(rad, 3));

		// cube of num
		int num = 8;
		System.out.println("Cube of this number is : " +(Math.pow(num, 3)));
                System.out.println("Square root of this num is : " +(Math.sqrt(num)));
             
		// absolute value
		int number = -50;
		System.out.println("Absolute value is : " + Math.abs(number));

		//area of triangle
		double base = 5, height = 10;
		System.out.println("Area of triangle : "+(base * height) / 2);

		// perimeter of circle
		double radius = 7;
		System.out.println("Perimeter of circle : "+(2*Math.PI * radius));

		//volume of cylinder
		double radi = 3, hei = 10;
		System.out.println("Volume of sphere : "+(Math.PI * radi * radi * hei));

		// volume of cone 
		double rd = 3, ht = 5 ;
		System.out.println("Volume of a cone : " +(1.0/3) * Math.PI * rd * rd * ht);

	}
}