package bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest
    private static final double LOAN_MULTIPLIER = 5; // Loan eligibility is 5x balance

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan approved for amount: " + amount);
        } else {
            System.out.println("Loan amount exceeds eligibility.");
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_MULTIPLIER;
    }
}
