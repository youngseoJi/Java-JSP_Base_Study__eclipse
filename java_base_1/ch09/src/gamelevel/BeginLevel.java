package gamelevel;

// 일반클래스 <- 추상클래스 상속
public class BeginLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("느리게 달림");
	}

	@Override
	public void jump() {
		System.out.println("점프 못함");
	}

	@Override
	public void turn() {
		System.out.println("회전 못함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("== 초보자 ==");
	}

}
