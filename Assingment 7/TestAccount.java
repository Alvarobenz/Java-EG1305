
public class TestAccount {

	public static void main(String[] args){
		Account newAccount = new Account();
		
		newAccount.setId(1122);
		newAccount.setBalance(20000);
		newAccount.setAnnualInterestRate(4.5);
		
		newAccount.withdraw(2500);
		newAccount.deposit(3000);
		
		System.out.println("Balance: $" + newAccount.getBalance());
		System.out.println("Monthly Interest: " + newAccount.getMonthlyInterestRate());
		System.out.println("Created on: " + newAccount.dateCreated());
		
	}
	
}
