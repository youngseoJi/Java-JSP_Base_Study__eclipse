package template;

// 추상클래스
public abstract class Car {

	// 추상메서드 선언
	public abstract void drive(); // 운전
	public abstract void stop(); // 정지
	
	
	// 구현 메서드 : 공통 메서드 

	// Hook 메서드 : 구현코드 작성안할경우! 하위클래스에서 필요에 의해 재정의를 하면 구현이 추가되는 것
	public void washCar() {} // 세차는 할떄도 안할떄도 있다
	
	public void turnOn() {
		System.out.println("시동 걸기");
	}
	
	public void turnOff() {
		System.out.println("시동 끄끼");
	}
	
	// 차동차 운행과정 메서드
	
	/* final 키워드 : 하위 클래스에서 재정의 X
	 * 템플릿 메서드 : 프로그램의 일련의 과정을 시나리오로 만들어 놓은 (순서를 정해놓은) 메서드, 변경되면 안된다.
	 * 프래임워크에서 많이 사용된다. */
	public final void run() {
		turnOn();
		drive();
		stop();
		turnOff(); 
		washCar();// Hook 메서드 
	}
}
