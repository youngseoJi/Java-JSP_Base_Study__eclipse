package interfaceex;

// 일반클래스 : 이유? 추상클래스의 추상메서드를 모두 사용해서
// extends : 구현상속
public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// 나누는 수가 0이 아니면 나누기
		if(num2 != 0) {
			return num1 / num2;
		}
		// 0일경우 에러 출력
		return ERROR;
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스 구현");
	}
	
}
