package abstractex;

//추상클래스 abstract : 상속을 하기위해 생성하는 클래스 , 혼자 돌지 못하며 인스턴스화 되지 못함
public abstract class Computer {
	
	// abstract 추상 메서드  : 선언만,메서드명,매개변수 만 알수 있고 {} 구현 코드가 없다.
	public abstract void display();
	public abstract void typing();
	
	// 추상 메서드들의 구현은 해당 추상 메서드를 상속받는 하위 클래스가 해야한다.
	
//	public abstract int add(int x, int Y);
	
	// 구현메스드 : 공통으로 사용하는 메서드
	public void turnOn() {
		System.out.println("전원 ON");
	}
	

	public void turnOff() {
		System.out.println("전원 OFF");
	}
	
}
