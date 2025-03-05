import java.util.Scanner;
class ArithmaticOperation{
	public static void main(String [] args){
	
	   // Addition operation
	    /* int a = 50;
                int b = 40;
		System.out.println(a+b); */


        // subtraction
              /*  int a , b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		b = sc.nextInt();
		System.out.println("Subtraction is : " +(a-b)); */

	/*// multiplication
         	 int x = 90, y = 3;
          	 System.out.println("Multipliction is : " +(x*y));

		//division
      		 int p ,q;
                 p = 890;
		 q = 5;
		System.out.println("Division is : " +(q/p));

             // convert celsius to fahrenheit
		double celsius = 25;
		System.out.println("converted value is : " +(celsius * 9/5) + 32);*/
		


		// multiply three num
		System.out.println("You have to enter three Digits for Multiplication !! ");
                 int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first digit : ");
                a = sc.nextInt();
		

		System.out.println("Enter the second digit : ");
                b = sc.nextInt();
		//System.out.println("b = " +b);

     		System.out.println("Enter the third digit : ");
                c = sc.nextInt();
		//System.out.println("c = " +c);
		System.out.println("a = " +a+"," + " b = " +b+ "," +" c = " +c);

               System.out.println("Your three digit multiplication is : " +(a*b*c));

	
	}
}