import java.util.Scanner;
class Prime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		int no = sc.nextInt();
		int i;
		boolean flag = false;
 		for(i=2; i<no; i++){
			if(no%i == 0){
				flag = true;
				break;	
			}
		}
		if(i == no){
			System.out.println(no+" is prime");
		}
		sc.close();
		
	}
}