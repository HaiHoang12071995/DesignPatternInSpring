package hai.com.creational.abstractfactory.accountfactory;

import hai.com.creational.abstractfactory.abstract_factory_main.AbstractFactory;
import hai.com.creational.abstractfactory.bankfactory.Bank;
import hai.com.creational.abstractfactory.bankfactory.BankName;

public class AccountFactory extends AbstractFactory {
	@Override
	public Bank getBank(BankName bankName) {
		return null;
	}
	@Override
	public Account getAccount(BankType bankType) {
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
