package hai.com.creational.prototype;

public class CurrentAccount extends Account {
	public CurrentAccount() {
		System.out.println("current Account");
	}
	@Override
	public void accountType() {
		System.out.println("CURRENT ACCOUNT");
	}
}
