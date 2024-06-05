package ch02.sec03;

// char 문자타입 : '' 작은 따옴표로 감싼것 문자리터럴  
// 문자리터럴 -> 유니코드로 변환디어 저장됨 (유티코드는 문자를 숫자로 매핑한 국제표준규약)


// 유니코드 정수 -> char 타입도 정수 타입 이기에 '문자'가 아닌 유니코드 숫자 직접대입이 가능

public class CharEx {

	public static void main(String[] args) {
		char c1 = 'A'; // '문자' 대입  -> 유니코드로 변환되어 저장되고 있는것
		char c2 = 65; // 유니코드 직접 대입 
		
		System.out.println(c1); //A
		System.out.println(c2); //A
//		-> 매핑된 문자로 변환되어 정상적으로 출력
		
		// 문자 타입변수 초기화 방법 : ''사이에 '공백'이 있어야 된다.
		
//		char c3 = ''; 에러
		char c3 = ' '; // 문자 타입 변수 초기화 '공백'
	
	}

}
