package hai.com.creational.abstractfactory.accountfactory;

public class SavingAccount implements Account {
	@Override
	public void accountType() {
		System.out.println("Saving Account");
	}
}
