
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.depositMoney("savings", 1000);
		System.out.println(myAccount.getSavingsBalance());
		
		myAccount.depositMoney("checking", 500);
		myAccount.showTotalBalance();
		
		myAccount.withdrawMoney("checking", 400);
		myAccount.showTotalBalance();
		
		myAccount.withdrawMoney("checking", 400);
		myAccount.showTotalBalance();
		
		String mynum = myAccount.accountNumber;
		System.out.println(mynum);	
	}
}
