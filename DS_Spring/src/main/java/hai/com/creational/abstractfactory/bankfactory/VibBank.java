package hai.com.creational.abstractfactory.bankfactory;

public class VibBank implements Bank {
	@Override
	public void getBankName() {
		System.out.println("VIB BANK");
	}
}
