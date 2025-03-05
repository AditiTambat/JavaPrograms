import java.util.Scanner;
class Fibonacci{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you have to print it's fab series : ");
		int terms = sc.nextInt();
		int a = 0;
		int b = 1, c;
		System.out.print(a+ " " +b);
		for(int i=3; i<=terms; i++){
			 c = a + b;
			System.out.print(" "+c );
			a = b;
			b = c;
		}
	}
}