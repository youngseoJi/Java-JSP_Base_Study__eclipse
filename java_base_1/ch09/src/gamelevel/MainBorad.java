package gamelevel;

public class MainBorad {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradelevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradelevel(sLevel);
		player.play(3);
	}

}
