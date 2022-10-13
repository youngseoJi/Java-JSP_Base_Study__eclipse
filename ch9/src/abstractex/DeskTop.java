package abstractex;

// 추상클래스의 추상메서드를 모두 상속받지 받는 경우, 일반클래스 사용 가능
public class DeskTop extends Computer{
	
	// 추상클래스의 추상 메서드를 상속받은경우 -> 하위 클래스가 책임지고  추상 메서드 구현해야함

	@Override
	public void display() {
		System.out.println("DeskTop diplay()");		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");				
	}
	
	

}
