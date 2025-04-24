
public class BankAccount {
	int acno;
	String name1;
	String name2;
	float balance;
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public BankAccount(int acno, String name1, String name2, float balance) {
		super();
		this.acno = acno;
		this.name1 = name1;
		this.name2 = name2;
		this.balance = balance;
	}
	
	public BankAccount() {
		super();
	}
	
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", name1=" + name1 + ", name2=" + name2 + ", balance=" + balance + "]";
	}
	
	public synchronized void deposit(float amt) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Before depositing, balance: "+ getBalance());
		balance = balance + amt;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After depositing, balance: "+ getBalance());
	}
	
	public synchronized void withdraw(float amt) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Before withdrawal, balance: "+ getBalance());
		if(balance >amt) {
			balance = balance - amt;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("After withdrawal, balance: "+ getBalance());
		}
	}

}

//thread 
// thread lifecycle
//thread methods
//thread priorities, constants
//thread communication
//race condition
//data inconsistency

