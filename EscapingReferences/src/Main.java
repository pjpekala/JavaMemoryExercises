public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

//		records.getCustomers().clear();

		for (Customer next : records.getCustomers().values()) {
					System.out.println(next);
		}

		CustomerReadOnly john = records.getCustomerByName("John");
		System.out.println(john.getName());
		System.out.println(john.getName());

		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}

	}
	
}
