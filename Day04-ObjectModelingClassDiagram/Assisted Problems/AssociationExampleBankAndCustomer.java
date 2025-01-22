import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName() + ", Account Balance: $" + customer.viewBalance());
        }
    }
}

class Customer {
    private String name;
    private double accountBalance;

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.accountBalance = initialDeposit;
    }

    public String getName() {
        return name;
    }

    public double viewBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }
}

public class AssociationExampleBankAndCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer customer1 = new Customer("Ankit", 500.0);
        Customer customer2 = new Customer("Aakrati", 1000.0);

        bank.openAccount(customer1);
        bank.openAccount(customer2);

        bank.displayCustomers();
    }
}
