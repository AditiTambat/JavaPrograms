
public class Transaction extends Thread {
	BankAccount bankaccount;
	
	String transactiontype;
	float amount;

	public Transaction(BankAccount bankaccount, String transactiontype, float amount) {
		this.bankaccount = bankaccount;
		this.transactiontype = transactiontype;
		this.amount = amount;
	}

	public void run() {
		if(transactiontype.equals("deposit")) {
			bankaccount.deposit(amount);
		}
		else if(transactiontype.equals("withdraw")) {
			bankaccount.withdraw(amount);
		}
		else if(transactiontype.equals("checkbalance")) {
			System.out.println("Your Balance: " +bankaccount.getBalance());
		}
	}
	
	
	
}
