package lab6;

public class BankAccount {
	private BankAccount accountName;
	public double deposit(int money) {
		double balance = (int) money;
		return balance;
	}
	public void deposit(int money, String s) {
		double balance = (int) money;
		System.out.println("Deposited "+ balance + " (" + s + ")");
	}
	public void deposit(BankAccount accountName, int money) {
		double balance = (int) money;
		this.accountName=accountName;
		
		System.out.println("Transferred "+ balance + " from " + this.accountName);
	}
	
	public static void main(String args[]) {
		BankAccount account = new BankAccount();
		account.deposit(100);
		account.deposit(50, "Salary");
		
		BankAccount account1 = new BankAccount();
		account1.deposit(100); 
		
		BankAccount account2=new BankAccount();
		account2.deposit(account1, 50);
	}
}
