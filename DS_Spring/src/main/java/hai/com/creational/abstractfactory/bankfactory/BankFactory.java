package hai.com.creational.abstractfactory.bankfactory;

import hai.com.creational.abstractfactory.abstract_factory_main.AbstractFactory;
import hai.com.creational.abstractfactory.accountfactory.Account;
import hai.com.creational.abstractfactory.accountfactory.BankType;

public class BankFactory extends AbstractFactory {
	@Override
	public Bank getBank(BankName bankName) {
		switch (bankName) {

		case VIB:
			return new VibBank();

		case ACB:
			return new AcbBank();

		default:
			throw new IllegalArgumentException("This bank name is unsupported");

		}
	}
	@Override
	public Account getAccount(BankType bankType) {
		return null;
	}
}
