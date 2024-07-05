package lab2;

public class BankAccount {
    private double balance;
    private String accountName;

    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public void deposit(int money) {
        balance += money;
        System.out.println("Deposited " + money);
    }

    public void deposit(int money, String s) {
        balance += money;
        System.out.println("Deposited " + money + " (" + s + ")");
    }

    public void transfer(BankAccount ob, int money) {
        if (balance >= money) {
            balance -= money;
            ob.balance += money;
            System.out.println("Transferred " + money + " from " + this.accountName);
        } else {
            System.out.println("Insufficient balance in " + this.accountName);
        }
    }

    public static void main(String args[]) {
        BankAccount account = new BankAccount("Account");
        account.deposit(100);
        account.deposit(50, "Salary");

        BankAccount account1 = new BankAccount("Account1");
        account1.deposit(100);

        BankAccount account2 = new BankAccount("Account2");
        account1.transfer(account2, 50);
    }
}