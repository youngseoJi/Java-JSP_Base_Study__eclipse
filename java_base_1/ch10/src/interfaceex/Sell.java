package interfaceex;

public interface Sell {
  
	void sell();
	
	default void order() {
		System.out.println("∆«∏≈ ¡÷π»");
	}
}
