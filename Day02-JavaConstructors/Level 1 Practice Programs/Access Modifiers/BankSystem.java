class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "%");
    }
}

public class BankSystem {
    public static void main(String[] args) {
		//Creating object of SavingsAccount class
        SavingsAccount sa = new SavingsAccount("9876543210", "John Doe", 10000.0, 4.5);
        sa.displayAccountDetails();
        sa.deposit(2000);
        sa.withdraw(5000);
        sa.displayAccountDetails();
    }
}
