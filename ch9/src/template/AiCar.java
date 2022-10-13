package template;

// 일반클래스 <- 추상클래스 상속
public class AiCar extends Car{
	
	// 추상 메서드상속 -> 구현 메서드 구현
	@Override
	public void drive() {
		System.out.println("자율 주행");
		System.out.println("자동차가 스스로 방향제어");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 브레이크");
		
	}

	
}
