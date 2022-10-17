package interfaceex;
// , 사용하여 여러개의 인터페이스 상속;
public class Customer implements Buy, Sell{

	// 인터페이스에서 정의한 메서드 구현하기
	@Override
	public void sell() {

		System.out.println("판매");
	}

	@Override
	public void buy() {
			
		System.out.println("구매");
	}

	
//	인터페이스 활용 : 두 인터페이스의 디폴트 메서드가 중복되는 겨우, 구현한 클래스애서 중복된 디폴트 메서드를 재정의한다.
	@Override
	public void order() {
		System.out.println("고객 판매 / 주문");
	}

	
	
}
