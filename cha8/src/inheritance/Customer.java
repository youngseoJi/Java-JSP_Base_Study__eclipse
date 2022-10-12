package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonuspoint;
	double bonusRatio;
	
	public Customer ()
	{
	  customerGrade = "SILVER";
	  bonusRatio = 0.01;
	}
	
	public Customer (int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
	bonuspoint += price * bonusRatio;
	return price;

	}
}