package generics;

public class Powder extends Material{

	// toString() 메서드 재정의
	public String toString() {
		return "3D 프린터 재료 Powder";
	}
	
	@Override
	public void doPrinting() {

		System.out.println("Powder 재료로 프린팅");
	}
}
