package june24;
//Create an abstract class called BankAccount with an abstract method calculateInterest(). Then, create two concrete classes SavingsAccount and CheckingAccount that extend the BankAccount class and implement the calculateInterest() method.
public abstract class BankAccount {
	protected double balance;
	public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }
	
}
