package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("많이 빨리 달림");
	}

	@Override
	public void jump() {
		System.out.println("많이 높이 점프 함");
	}

	@Override
	public void turn() {
		System.out.println("회전 함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("== 고급자  ==");
	}
}
