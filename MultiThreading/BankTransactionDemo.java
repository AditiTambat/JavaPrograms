
public class BankTransactionDemo {
	public static void main(String[] args) {
		BankAccount banckaccount = new BankAccount(10001,"Aditi", "Arayan",20000);
		Transaction t1 = new Transaction(banckaccount,"deposit",100000);
		Transaction t2 = new Transaction(banckaccount,"withdraw",5000);
		
		t1.start();
		t2.start();
		
	}
}
