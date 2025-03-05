import java.util.Scanner;
class Reverse{
	public static void main(String [] args){
		int no;
		System.out.println("Enter the number : " );
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
                   
		int reversed = 0;
		while(no != 0){    //(no > 0 )
			int digit = no % 10; 
			reversed =  reversed * 10 + digit ;
			no /= 10;  //no = no/10
		}
		System.out.println("Reversed number : " +reversed);
	}

}