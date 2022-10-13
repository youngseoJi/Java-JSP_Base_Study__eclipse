package gamelevel;

// 추상 클래스
public abstract class PlayerLevel {

	// 추상 메서드 선언
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// 템플릿 메서드 : 재정의 되면 안되는 것
	// 게임 실행 시나리오 
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
