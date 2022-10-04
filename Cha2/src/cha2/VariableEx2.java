package cha2;

public class VariableEx2 {

	public static void main(String[] args) {

		
		/* 자료형이 필요한 이유
		 * 변수를 선언 할떄 변수가 사용할 메모리 크기와 타입을 구분하기 위해서 필요
		 * 지역 변수 자료형 추론 (local variable type inference):
		 변수에 대입되는 값을 보고 컴파일러가 추론 
		 * 컴파일 언어는 스크립트 언어랑 다르게 한번 선언하면 타입이 변경될 수 없다.
		 */
		
		
		// 변수 = 리터럴
		
		// 정수 자료형
		
		// int 4byte  -> 정수는 모두 int형으로 저장된다., 4byte로 저장된다.
		// 정수는 음수가 없다.
		int num = 10;
		
	    // int num1 = 12345678910; 
		// 오류 4byte 가 저장할수있는 범위를 넘어서서 에러 ->
		
		// Long 8byte =  뒤에 L 식별자필수 (Long형으로 저장한다는 뜻,)
		Long num1 = 12345678910L;
		
		// 문자는 내부적으로 정수형으로 표기된다.  문자당 정해진 수가 있다. 아스키코드
		char ch = 'A';
		
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		
		ch = 66; 
		System.out.println(ch); // B
	
	
		int ch2 = 67;
		
		System.out.println(ch2); // 67
		System.out.println((char)ch2); // C
		
		
		// 실수 자료형
		
		
		// double 8byte -> 실수는 무조건 double로 저장된다. - 기본적으로 double로 사용하는 편
		
		double dNum = 3.14;
		
		// float 4byte  = 갑 뒤 식별자 f 필수! float 형으로 저장한다는 것을 명시해줘야한다.
		float fNum = 3.14f;
		
		// boolean 논리형 : 논리값 true(참), false(거짓)
		
		
	}

}
