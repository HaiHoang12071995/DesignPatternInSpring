package hai.com.creational.abstractfactory.abstract_factory_main;

import hai.com.creational.abstractfactory.accountfactory.Account;
import hai.com.creational.abstractfactory.accountfactory.BankType;
import hai.com.creational.abstractfactory.bankfactory.Bank;
import hai.com.creational.abstractfactory.bankfactory.BankName;

//BankFactory,AccountFactory is AbstractFactory implements Bank,Account 
public abstract class AbstractFactory {
	
	public abstract Bank getBank(BankName bankName);
	public abstract Account getAccount(BankType bankType);

}
