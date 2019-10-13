package hai.com.creational.abstractfactory.abstract_factory_main;

import hai.com.creational.abstractfactory.accountfactory.AccountFactory;
import hai.com.creational.abstractfactory.bankfactory.BankFactory;

public class FactoryProducer {
	public final static AbstractFactory getFactory(FactoryType factoryType) {
		switch(factoryType) {
		
		case BANK:
			return new BankFactory();
			
		case ACCOUNT:
			return new AccountFactory();
			
		default:
			throw new IllegalArgumentException("Factory don't support");
		}
	}
}
