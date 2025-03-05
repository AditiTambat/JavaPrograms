import java.util.Scanner;
class Factorial{                         // prd of 1 to that no       // prd of all no to 1
	public static void main(String [] args){
               Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int no = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=no; i++){
			fact = fact * i;
		}
		System.out.println("Factorial of " + no + " is " +(fact));

		// using printf
		System.out.printf("Factorial of %d is %d" , no , fact);
		
	}
}