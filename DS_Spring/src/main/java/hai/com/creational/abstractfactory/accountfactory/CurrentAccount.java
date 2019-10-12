package hai.com.creational.abstractfactory.accountfactory;

public class CurrentAccount implements Account {
	@Override
	public void accountType() {
		System.out.println("Current Account");
	}
}
