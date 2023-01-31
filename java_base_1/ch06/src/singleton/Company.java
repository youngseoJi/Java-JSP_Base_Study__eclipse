package singleton;

public class Company {
	
	
	// static : 한개만 있을 것이여서 static으로 선언, 공유
	// private : 외부에서 private으로 선언된 인스턴스는 사용할 수 없다, 내부에서만 사용할 수 있다.
	private static Company instance = new Company();

	private Company() {}

	// 생성된 인스턴스 객체를 외부에서 사용하기 위한 메서드
	// static으로 선언해서 인스턴스 객체를 생성하지 않고 메서드를 부르르 수 있다.
	static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}