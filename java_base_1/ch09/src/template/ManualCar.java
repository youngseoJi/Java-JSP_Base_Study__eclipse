package template;

// 사람이 운전하는 차
// 일반클래스 <- Car 추상클래스 상속
public class ManualCar extends Car{

	// 추상메서드 상속 -> 구현메서드
	@Override
	public void drive() {
	System.out.println("사람이 운전");
	System.out.println("사람이 핸들 조작");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크");
	}
	
}
