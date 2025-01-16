/*
Problem Statement: Create a BankAccount class with attributes accountHolderName, accountNumber, and balance. 
Add methods for:
	Depositing money.
	Withdrawing money (only if sufficient balance exists).
	Displaying the current balance.
*/


class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void depositeMoney(double money) {
        this.balance+=money;
		System.out.println("Your updated balance is : "+this.balance);
    }
	
	public void withdrawMoney(double money) {
		if(this.balance>money){
			this.balance-=money;
			System.out.println("After deduction your rest money is: "+this.balance);
		}else{
			System.out.println("You have insufficent balance i.e., "+this.balance);
		}
	}
	
    public void displayMoney() {
        System.out.println("Your current balance is : "+this.balance); 
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Creating objects of the BankAccount class
        BankAccount user1 = new BankAccount("Ankit Kumar","10122551452", 100000.00);

        //Depositing
		user1.depositeMoney(1000.00);
		
		//withdrawMoney
		user1.withdrawMoney(500.00);
		
		//Displaying
		user1.displayMoney();
    }
}
