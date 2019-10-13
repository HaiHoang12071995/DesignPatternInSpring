package hai.com.creational.abstractfactory.bankfactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hai.com.creational.abstractfactory.accountfactory.Account;
import hai.com.creational.abstractfactory.accountfactory.BankType;

public class TestBankFactory {
	BankFactory bankFactory = new BankFactory();
	@Test
	public void TestgetBank() {
		Bank vibBank = bankFactory.getBank(BankName.VIB);
		assertTrue(vibBank instanceof VibBank);
		Bank acbBank = bankFactory.getBank(BankName.ACB);
		assertTrue(acbBank instanceof AcbBank);
	}
	@Test
	public void TestgetAccount() {
		Account currentAccount = bankFactory.getAccount(BankType.CURRENTACCOUNT);
		assertEquals(null, currentAccount);
		Account savingAccount = bankFactory.getAccount(BankType.SAVINGACCOUNT);
		assertEquals(null, savingAccount);	
	}
	
}
