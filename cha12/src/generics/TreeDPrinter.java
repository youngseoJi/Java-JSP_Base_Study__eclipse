package generics;

//3d 프린트 제작  : 코드는 갖고 변수만 다를 경우

// 제네릭 클래스 : <T>에는 매개변수 무엇이든 받아서 사용가능
public class TreeDPrinter<T extends Material> {

	//Object : 최상위 타입, 모든 타입을 Object로 형변환 할 수 있다.
	//private Object material;
	
	private T material; // 재료
	

	// 재료 조회
	public T getMaterial() {
		return material; 
	}

	// 재료 사용, 생성
	public void setMaterial(T material) {
		this.material = material;
	}

	// 문자
	@Override
	public String toString() {
		return  material.toString();
	}


	public void printing() {
	  material.doPrinting();
	}
}


