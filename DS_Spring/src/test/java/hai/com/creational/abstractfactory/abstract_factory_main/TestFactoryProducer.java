package hai.com.creational.abstractfactory.abstract_factory_main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hai.com.creational.abstractfactory.accountfactory.AccountFactory;
import hai.com.creational.abstractfactory.bankfactory.BankFactory;

public class TestFactoryProducer {
	@Test
	public void getFactoryTest() {
		AbstractFactory bankFactory = FactoryProducer.getFactory(FactoryType.BANK);
		assertTrue(bankFactory instanceof BankFactory);
		
		AbstractFactory accountFactory = FactoryProducer.getFactory(FactoryType.ACCOUNT);
		assertTrue(accountFactory instanceof AccountFactory);
	}
}
