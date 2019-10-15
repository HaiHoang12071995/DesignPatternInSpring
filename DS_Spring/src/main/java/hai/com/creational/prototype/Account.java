package hai.com.creational.prototype;

public abstract class Account implements Cloneable {
	abstract public void accountType();
	
	
	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	public void setOthers(String others) {
        System.out.println(others);
    }
}
