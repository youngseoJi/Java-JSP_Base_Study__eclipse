package classex;

public class classTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Person 클래스 타입 인스턴스 생성
		Person person = new Person();
		
		// Class 를 갖고 올 수 있는 방법 3가지
		
		// 1. 정적로딩 - object 클래스 이용 
		
		// getClass()는 object 메소드 -> 클래스를 반환해주는 메소드로 불러올 수 있음
		// 이미 인스턴스를 생성 했을경우, Person  클래스가 컴파일 되었어야 사용할 수 있다.
		Class pClass = person.getClass();
		System.out.println(pClass.getName()); //classex.Person 풀네임 : 패키지명.해당클래스명

	    // 2.정적로딩 - 컴파일 : 컴파일 시 person 클래스가 생성됨
		
		// 이미 Person  클래스가 컴파일 되었어야 사용할 수 있다.
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName()); // classex.Person
		
		// 3. 동적로딩 - .forName("") : 클래스 이름으로 갖고오기
		// forName이 실행이 되는 중에 문자열을 사용하여 이 이름의 클래스가 있으면 읽어오는것
		
		Class pClass3 = Class.forName("classex.Person"); // classex.Person
		Class pClass4 = Class.forName("java.lang.String"); //java.lang.String
		
		System.out.println(pClass3.getName());
		System.out.println(pClass4.getName());
	}
}
