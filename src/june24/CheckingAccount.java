package june24;

public class CheckingAccount extends BankAccount{
	private static final double INTEREST_RATE = 0.02;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        if (balance > 1000) {
            return balance * INTEREST_RATE;
        } else {
            return 0;
        }
    }
}
