package template;

// 추상클래스
public abstract class Car {

	// 추상메서드 선언
	public abstract void drive(); // 운전
	public abstract void stop(); // 정지
	
	
	// 구현 메서드 : 공통 메서드 
	public void turnOn() {
		System.out.println("시동 걸기");
	}
	
	public void turnOff() {
		System.out.println("시동 끄끼");
	}
	
	// 차동차 운행과정 메서드
	// final 키워드 : 하위 클래스에서 재정의 X
	// 템플릿 메서드 : 프로그램의 일련의 과정을 시나리오로 만들어 놓은 (순서를 정해놓은) 메서드, 변경되면 안된다.
	// 프래임워크에서 많이 사용된다.
	public final void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
