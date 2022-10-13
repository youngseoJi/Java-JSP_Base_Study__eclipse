package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
	
		Customer customerBee = new Customer(3, "Bee");
		int price = customerBee.calcPrice(10000);
		System.out.println("지불금액은 " + price +"원 " + customerBee.showCustomerInfo()); // Bee등급 : SILVER, 보너스 포인트 :100
		
		VIPCustomer customerpark = new VIPCustomer(4, "park", 02);
		price = customerpark.calcPrice(100000);
		System.out.println("지불금액은 " + price +"원 " + customerpark.showCustomerInfo()); // park등급 : VIP, 보너스 포인트 :500

		Customer customerMe = new VIPCustomer(03, "Me", 03);
		price = customerMe.calcPrice(20000);
		System.out.println("지불금액은" + price + "원 " + customerMe.showCustomerInfo() );
		
		
	}

}
