package binary;

public class VariableEx2 {

	public static void main(String[] args) {

		// 변수 = 리터럴
		
		// int 4byte  -> 정수는 모두 int형, 4byte로 저장된다.
		// 정수는 음수가 없다.
		int num = 10;
		
	    // int num1 = 12345678910; 
		// 오류 4byte 가 저장할수있는 범위를 넘어서서 에러 ->
		
		// Long 8byte =  뒤에 L 식별자필수 (Long형으로 저장한다는 뜻,)
		Long num1 = 12345678910L;
		
		// 문자
		// 문자는 내부적으로 정수형으로 표기된다.  문자당 정해진 수가 있다. 아스키코드
		char ch = 'A';
		
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		
		ch = 66; 
		System.out.println(ch); // B
	
	
		int ch2 = 67;
		
		System.out.println(ch2); // A
		System.out.println((char)ch2); // 65
	}

}
