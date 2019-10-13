package hai.com.creational.abstractfactory.accountfactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hai.com.creational.abstractfactory.bankfactory.Bank;
import hai.com.creational.abstractfactory.bankfactory.BankName;

public class TestAccountFactory {
	AccountFactory accountFactory = new AccountFactory();
	
	@Test
	public void getBankTest() {
		Bank bank = null;
		
		assertEquals(bank, accountFactory.getBank(BankName.ACB));
		assertEquals(bank, accountFactory.getBank(BankName.VIB));
		
	}
	@Test public void getAccountTest() {
		
		Account savingAccount = accountFactory.getAccount(BankType.SAVINGACCOUNT);
		assertTrue(savingAccount instanceof SavingAccount );
	}
}
