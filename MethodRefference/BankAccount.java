package MethodRefference;

public class BankAccount {
	
	private static double balance = 5000.0;
	
	public static void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: "+amount);
	}
	public static  void checkBalance(double b) {
		System.out.println("Balance : "+balance);
	}
	
	
	public static void main(String[] args) {
		Transaction d = BankAccount::deposit;
		Transaction check = BankAccount::checkBalance;
		d.process(10000.0);
		check.process(0.0);
	}
}


@FunctionalInterface
interface Transaction{
	void process(double amount);
}
