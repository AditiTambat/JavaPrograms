
public class TestBank {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setAcno(20010);
		b1.setAcholdername("Aditi");
		b1.setBankname("ICICI Bank");
		b1.setBalance(5000);
		
		b1.getAcno();
		b1.getAcholdername();
		b1.getBankname();
		b1.getBalance();
		
		b1.deposit(6000);
		b1.showDetails();
		try {
		b1.withdraw(15000);
		}
		catch(InvalidBalanceException e) {
			System.err.println(e);
		}
		b1.showDetails();
		
	
	}
}
