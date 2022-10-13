package inheritance;

// 고객 클래스
public class Customer {
	// protected : private이지만 상속관계에서만 public 으로 사용가능하게함
	protected int customerID; // 식별자
	protected String customerName; // 이름
	protected String customerGrade; // 등급
	int bonuspoint; // 포인트
	protected double bonusRatio; // 포인트 쌓이는 비율
	/* 디폴트 새성자
	public Customer ()
	{
	  customerGrade = "SILVER";
	  bonusRatio = 0.01;
	}
	*/
	// 고객 생성자 : 필수 매개변수
	public Customer (int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer");
	}
	
	// 고객 등급에 따라 보너스 & 할인률
	public int calcPrice(int price) {
		if(customerGrade == "SILVER") {
			bonuspoint += price * bonusRatio;
		}
		
		return price;
	
	}
	
	public String showCustomerInfo() {
		return customerName + "등급 : " + customerGrade + ", 보너스 포인트 :" + bonuspoint;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonuspoint() {
		return bonuspoint;
	}

	public void setBonuspoint(int bonuspoint) {
		this.bonuspoint = bonuspoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}