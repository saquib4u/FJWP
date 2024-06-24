package june24;

public class SavingsAccount extends BankAccount{
	 private static final double INTEREST_RATE = 0.05;

	    public SavingsAccount(double balance) {
	        super(balance);
	    }

	    @Override
	    public double calculateInterest() {
	        return balance * INTEREST_RATE;
	    }
	
	
}
