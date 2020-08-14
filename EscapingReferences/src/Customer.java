
public class Customer implements CustomerReadOnly {
	private String name;

	@Override
	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}

	public Customer(Customer oldCustomer) {
		this.name = oldCustomer.name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	
}
