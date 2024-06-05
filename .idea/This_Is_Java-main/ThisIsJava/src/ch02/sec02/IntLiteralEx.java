package ch02.sec02;

// 정수 리터럴을 int 타입 변수에 대입  -> 10w진수로 출력
public class IntLiteralEx {

	public static void main(String[] args) {
//		코드에서 프로그래머가 직접 입력한갑 -> 리터럴
		// 변수에 대입할 정수 리터럴 작성하는 방법
		
		// 2진수 : 0b 또는 0B 시작 -> 0과 1로 작성 
		int var2 = 0b1011000; 
		
		// 8진수 : 0 시작 -> 0~7 로 작성
		int var8 = 02345; 
		
		// 10진수 : 소수점 없는 0~9 작성
		int var10 = 100009;
		
		// 16진수 : 0x 또는 0X 시작 -> 0~9 또는 ABCDEF 로 작성 (소문자도)
		int var16 = 0XABCD;
	
		System.out.println("var2 : " + var2);
		System.out.println("var8 : " + var8);
		System.out.println("var10 : " + var10);
		System.out.println("var16 : " + var16);
		
		/* var2 : 88
		 * var8 : 1253
		 * var10 : 100009
		 * var16 : 43981
		 * */
	}

}
