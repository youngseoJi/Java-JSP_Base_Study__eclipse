package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달림");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프 함");
	}

	@Override
	public void turn() {
		System.out.println("회전 못함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("== 중급자 ==");
	}


	
}
