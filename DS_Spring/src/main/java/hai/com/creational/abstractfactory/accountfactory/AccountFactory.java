package hai.com.creational.abstractfactory.accountfactory;

public class AccountFactory {
	
	public static final Account getAccount(BankType bankType) {
		switch (bankType) {

		case SAVINGACCOUNT:
			return new SavingAccount();

		case CURRENTACCOUNT:
			return new CurrentAccount();

		default:
			throw new IllegalArgumentException("This bank type is unsupported");
		}
	}

}
