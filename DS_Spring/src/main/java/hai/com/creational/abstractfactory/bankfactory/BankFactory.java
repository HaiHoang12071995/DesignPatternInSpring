package hai.com.creational.abstractfactory.bankfactory;

public class BankFactory {
	public static final Bank getBank(BankName bankName) {
		switch (bankName) {

		case VIB:
			return new VibBank();

		case ACB:
			return new AcbBank();

		default:
			throw new IllegalArgumentException("This bank name is unsupported");

		}
	}
}
