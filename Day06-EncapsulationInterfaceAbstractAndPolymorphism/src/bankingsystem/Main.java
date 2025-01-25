package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        // Adding Accounts
        SavingsAccount savings = new SavingsAccount("SAV123", "Ankit kumar", 10000);
        CurrentAccount current = new CurrentAccount("CUR456", "Aakrati Barsaiyan", 50000);

        accounts.add(savings);
        accounts.add(current);

        // Processing Accounts
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Calculated Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(100000);
            }

            System.out.println("-----------------------------------------");
        }
    }
}
