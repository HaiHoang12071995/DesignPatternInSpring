package hai.com.creational.prototype;

public class SavingAccount extends Account {
	public SavingAccount() {
		System.out.println("saving account");
	}
	@Override
	public void accountType() {
		System.out.println("SAVING ACCOUNT");
	}

}
