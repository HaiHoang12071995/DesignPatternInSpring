package hai.com.creational.abstractfactory.abstract_factory_main;

import hai.com.creational.abstractfactory.accountfactory.Account;
import hai.com.creational.abstractfactory.accountfactory.BankType;
import hai.com.creational.abstractfactory.bankfactory.Bank;
import hai.com.creational.abstractfactory.bankfactory.BankName;

public class AbstractFactoryPatternMain {
	public static void main(String[] args) {
		
		AbstractFactory factoryBank = FactoryProducer.getFactory(FactoryType.BANK);
		Bank bank = factoryBank.getBank(BankName.ACB);
		bank.getBankName();
		AbstractFactory factoryAccount = FactoryProducer.getFactory(FactoryType.ACCOUNT);
		Account account = factoryAccount.getAccount(BankType.SAVINGACCOUNT);
		account.accountType();
	}
	
}
