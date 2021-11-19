package springs;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	void details()
	{
		System.out.println("Customer Details");
		System.out.println("Customer-Id ="+getCustomerId());
		System.out.println("Customer-Name ="+getCustomerName());
		System.out.println("Customer-contact ="+getCustomerContact());
		System.out.println("Customer-Address :Street = "+getCustomerAddress().getStreet());
		System.out.println("Customer-Address :City = "+ getCustomerAddress().getCity());
		System.out.println("Customer-Address :State = "+ getCustomerAddress().getState());
		System.out.println("Customer-Address :zip = "+ getCustomerAddress().getZip());
		System.out.println("Customer-Address :country = "+ getCustomerAddress().getCountry());
	}
	
}
