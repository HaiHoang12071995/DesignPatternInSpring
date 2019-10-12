package hai.com.creational.abstractfactory.bankfactory;

public class AcbBank implements Bank {
	@Override
	public void getBankName() {
		System.out.println("ACB BANK");
	}
}
