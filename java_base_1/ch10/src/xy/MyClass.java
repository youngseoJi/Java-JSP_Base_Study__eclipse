package xy;

// MyClass 일반 클래스 <- 인터페이스 myInterface 상속 <- X,Y 인터페이스 상속
public class MyClass implements myInterface{

	@Override
	public void y() {
		System.out.println("x()");
	}

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		// MyClass 인터페이스 타입으로 생성되었어도 ! 
		// -> X타입에 대입이되었기에 X타입의 메서드만 사용가능하다.
		X  xClass = myClass;
		xClass.x();
	}
}
