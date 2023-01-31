package innerclass;

// 외부클래스
class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// 내부클래스 : 외부클래스의 변수와 메소드르 모두 참조, 사용할 수 있다. 
	class InClass {
		int inNum = 200;
		// static 클래스 와 메소드 사용 불가능, 인스턴스생성과 상관없이 쓸수있어야하는데 내부클래스는 불가능
//		static sInNum = 100;
		
		// InClass 내부클래스 내 함수
		void inTest() {
			System.out.println(sNum);
			System.out.println(num);
		}
	}
	
	
}

public class InnerTest {

	public static void main(String[] args) {

		// OutClass 외부클래스 타입의 인스턴스 생성 
		OutClass outClass = new OutClass();
		// 내부클래스의 함수 호출
		outClass.inClass.inTest();
		
		// 외부클래스의 내부에 있는 내부클래스 타입의 인스턴스 생성
		OutClass.InClass inClass = outClass.new InClass(); 
	}

}
