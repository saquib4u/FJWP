package june12.overloading;
//Create a BankAccount class with a method deposit() that takes different parameters to deposit money into an account in different ways.
//Deposit a fixed amount of money into the account.
//Deposit a variable amount of money into the account, with an optional description of the transaction.
//Deposit money into the account from another account, with the account number and amount to transfer.
//Expected Output:
//BankAccount account = new BankAccount(); account.deposit(100); should set the balance to 100.0
//BankAccount account = new BankAccount(); account.deposit(50, "Salary"); should set the balance to 50.0 and print "Deposited 50.0 (Salary)"
//BankAccount account1 = new BankAccount(); BankAccount account2 = new BankAccount(); account1.deposit(100); account2.deposit(account1, 50); should set the balance of account2 to 50.0 and print "Transferred 50.0 from account 1"

public class BankAccount {
	public double deposit(int money) {
		double balance = (int) money;
		return balance;
	}
	public void deposit(int money, String s) {
		double balance = (int) money;
		System.out.println("Deposited "+ balance + " (" + s + ")");
	}
	public void deposit(BankAccount ob, int money) {
		double balance = (int) money;
		System.out.println("Transferred "+ balance + " from " + ob);
	}
//	BankAccount(String objN){
//	    this.objName = objN;
//	}
//	public String getObjName() {
//	    return objName;
//	}
	
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
