package withArraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		// 배열 타입 : 최상위 클래스 Customer -> gold, vip 모두 해당
		// 하나의 타입으로 ! 
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// 인스턴스 5개 생성
		Customer customer1 = new Customer(01, "영서");
		Customer customer2 = new Customer(02, "길동");
		GoldCustomer customer3 = new GoldCustomer(03, "명희");
		GoldCustomer customer4 = new GoldCustomer(04, "봉봉");
		VIPCustomer customer5 = new VIPCustomer(05, "유하", 105);
	
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("======고객 정보 출력 ======");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
	/* 		영서등급 : SILVER, 보너스 포인트 :0
			길동등급 : SILVER, 보너스 포인트 :0
			명희등급 : Gold, 보너스 포인트 :0
			봉봉등급 : Gold, 보너스 포인트 :0
			유하등급 : VIP, 보너스 포인트 :0 */
		}
		System.out.println("======할인률과 보너스 포인트결과 ======");
		
		int price = 10000;
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불, ");
			System.out.println(customer.showCustomerInfo());
			// 다형성 활용하기
			/* 영서님이 10000를 지불, 
			영서등급 : SILVER, 보너스 포인트 :100
			길동님이 10000를 지불, 
			길동등급 : SILVER, 보너스 포인트 :100
			명희님이 9000를 지불, 
			명희등급 : Gold, 보너스 포인트 :2000
			봉봉님이 9000를 지불, 
			봉봉등급 : Gold, 보너스 포인트 :2000
			유하님이 9000를 지불, 
			유하등급 : VIP, 보너스 포인트 :500담당 상담원 ID : 105 */
		}
	}

}
