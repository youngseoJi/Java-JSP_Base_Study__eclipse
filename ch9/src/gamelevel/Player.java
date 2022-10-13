package gamelevel;

// 유저
public class Player {
	
	// PlayerLevel 클래스 사용
	private PlayerLevel level;
	
	// 디폴트 생성자
	// 유저 처음 레벨 설정
	public Player() {
		level = new BeginLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	// 유저 레벨 증가
	public void upgradelevel(PlayerLevel level) {
		// Player.level
		this.level = level;
		level.showLevelMessage();
	}
	
	// 게임 실행 
	public void play(int count) {
		// PlayerLevel 클래스의 템플릿 클래스 호출 -> 실행 
		level.go(count);
	}
	
}
