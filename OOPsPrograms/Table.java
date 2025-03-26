import java.util.Scanner;

public class Table {
	public void showTable(int no) {
		for(int i=1;i<=10;i++) {
			System.out.println(no*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int no = sc.nextInt();
		
		Table t1 = new Table();
		t1.showTable(no);
	}

}
