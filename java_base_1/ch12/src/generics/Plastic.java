package generics;

// 플라스틱 재료
public class Plastic extends Material{
	
	// toString() 메서드 재정의
	public String toString() {
		return "3D 프린터 재료 Plastic";
	}

	@Override
	public void doPrinting() {

		System.out.println("Prastic 재료로 프린팅");
	}
	
	
}
