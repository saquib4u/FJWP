package june24;

public class Demo24 {
	    public static void main(String[] args) {
	        SavingsAccount savings = new SavingsAccount(1000);
	        System.out.println("Savings interest: " + savings.calculateInterest());

	        CheckingAccount checking = new CheckingAccount(500);
	        System.out.println("Checking interest: " + checking.calculateInterest());

	        checking = new CheckingAccount(1500);
	        System.out.println("Checking interest: " + checking.calculateInterest());
	    }
}
