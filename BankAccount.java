
import java.util.Random;

public class BankAccount {
	
	public String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccount = 0;
	private static double totalBalance= 0;
	
	public BankAccount() {
		this.accountNumber = createAccountNumber();
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		numberOfAccount++;
	}
	
	private static String createAccountNumber() {
		String accountNum = "";
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			accountNum = accountNum + Integer.toString(rand.nextInt(9));			
		}
		return accountNum;	
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void depositMoney(String AccountType, double amount) {
		if(AccountType == "checking") {
			checkingBalance += amount;
		}
		else if(AccountType == "savings") {
			savingsBalance += amount;
		}
		totalBalance += amount;
	}
	
	public void withdrawMoney(String AccountType, double amount) {
		if(AccountType == "checking") {
			if(checkingBalance >= amount) {
				checkingBalance -= amount;
				}
			else {
				System.out.println("Insufficient fund!");
			}
		}
		else if(AccountType == "savings") {
			if(savingsBalance >= amount) {
				savingsBalance -= amount;
			}
			else {
				System.out.println("Insufficient fund!");
			}
		}
		totalBalance -= amount;
	}
	
	public void showTotalBalance() {
		System.out.println("Total Balance: " + totalBalance);
		System.out.println("Checking: " + checkingBalance);
		System.out.println("Savings: " + savingsBalance);
	}
	
	public static int AccountsCount() {
		return numberOfAccount;
	}
	
	public static double AmountCount() {
		return totalBalance;
	}
	
	

}
