
public class BankAccount {
	int acno;
	String bankname;
	String acholdername;
	float balance;
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAcholdername() {
		return acholdername;
	}
	public void setAcholdername(String acholdername) {
		this.acholdername = acholdername;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public BankAccount(int acno, String bankname, String acholdername, float balance) {
		super();
		this.acno = acno;
		this.bankname = bankname;
		this.acholdername = acholdername;
		this.balance = balance;
	}
	public BankAccount() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", bankname=" + bankname + ", acholdername=" + acholdername + ", balance="
				+ balance + "]";
	}
	
	public void deposit(float amt) {
		balance=balance+amt;
	}
	public void withdraw(float amt) {
		if(amt<balance) {
			balance=balance-amt;	
		}
		else {
			//this will call default constructor
			throw new InvalidBalanceException();
			//throw new InvalidBalanceException("insufficient balance");
		}
	}
	
	public void showDetails() {
		System.out.println("AC No:"+acno);
		System.out.println("Bank Name:"+bankname);
		System.out.println("Ac HolderName:"+acholdername);
		System.out.println("AC Balance:"+balance);
	}
	
}
