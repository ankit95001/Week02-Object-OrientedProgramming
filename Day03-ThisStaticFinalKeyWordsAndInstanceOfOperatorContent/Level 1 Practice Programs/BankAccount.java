/*
Sample Program 1: Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
*/


public class BankAccount{
	static String bankName = "SBI bank";
	final String accountNumber;
	String accountHolderName;
	static int totalAccounts = 0;
	
	BankAccount(String accountHolderName, String accountNumber){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		totalAccounts++;
	}
	
	static int getTotalAccounts(){
		return totalAccounts;
	}
	
	public void display(){
		System.out.printf("Your account number %s, with name %s, is in %s.",accountNumber,accountHolderName,bankName);
	}
	public static void main(String[] args){
		BankAccount account1 = new BankAccount("Ankit","1011001");
		BankAccount account2 = new BankAccount("Aakrati","1011551");
		BankAccount account3 = new BankAccount("Anand","1011661");
		
		System.out.printf("This bank have total %s accounts%n",BankAccount.totalAccounts);
		
		if(account3 instanceOf BankAccount){
			account3.display();
		}else{
			System.out.println("This account is not belongs to this bank");
		}
	}
}

	
	
	