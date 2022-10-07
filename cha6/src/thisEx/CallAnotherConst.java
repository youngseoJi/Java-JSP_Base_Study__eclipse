package thisEx;

// 생성자에서 다른 생성자를 호출하는 this

class Person{
	String name;
	int age;
	
	// 디폴트 생성자, 매개변수 X, 생성자가 하나도 없을경우 자동생성(안적어도됨)
	public Person() {
		// 매개변수의 개수와 타입이 맞는 생성자 호출
		this("이름없음",1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 데이터 타입은 해당 클래스명 + 함수명
	public Person returnSelf() {
		return this; // 현재 인스턴스의  주소값 출력
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// 디폴트 생성자 호출시 초기화되게 함.
		Person p1 = new Person();
		System.out.println(p1.name); // 이름없음 
		System.out.println(p1.age); // 1
		
		System.out.println(p1.returnSelf()); 
	
	}

}
