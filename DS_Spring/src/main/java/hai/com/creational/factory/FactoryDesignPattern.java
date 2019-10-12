package hai.com.creational.factory;

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		Account savingAccount = AccountFactory.getAccount(BankType.SAVINGACCOUNT);
		savingAccount.accountType();
		
		Account currentAccount = AccountFactory.getAccount(BankType.CURRENTACCOUNT);
		currentAccount.accountType();	
		
	}
}
