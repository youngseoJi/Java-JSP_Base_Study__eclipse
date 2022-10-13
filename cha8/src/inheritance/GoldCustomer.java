package inheritance;

public class GoldCustomer extends Customer {
	
	
	
	public GoldCustomer() {
		bonusRatio = 0.5;
	}

	@Override // 컴파일러에게 무슨일을 하는지 알려준다. / 재정의 될것이다.
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}	

	
	
}
