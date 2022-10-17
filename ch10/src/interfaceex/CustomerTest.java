package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		// Customer 타입
		Customer customer = new Customer();
		// Buy 타입으로 업사이드, 타입으로 대입 (Customer이 하위 )
		Buy buyer = customer;
		
		buyer.buy();
		// Sell 타입으로 업사이드, 타입으로 대입 (Customer이 하위 )
		Sell seller = customer;
		seller.sell();
		
		// 인스턴스 Customer customer의 메서드가 호출됨 ! 오버라이딩된 메서으
		// * 다른 타입에 대입되었어도! *
		customer.order();
		buyer.order();
		seller.order();
	}
}
