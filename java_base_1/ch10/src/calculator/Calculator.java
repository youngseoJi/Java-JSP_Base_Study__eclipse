package calculator;

// implements : 타입상속 , 인터페이스 상속 
// 추상 클래스 : 이유 ? 상속받은 메서드 중 일부 메서드만 구현해서
// 인테페이스는 구현코드가 없어서 여러개를 상속받을 수 있다.
public abstract class Calculator implements Calc{

	
	// 더하기
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
    // 빼기
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}


}
