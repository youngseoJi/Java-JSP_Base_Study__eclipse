
// 문자열 타입

public class StringApp {

	public static void main(String[] args) {
		// 큰 따옴표 "" : String 문자열 (Character이 모여있는 것) 
		System.out.println("hello");
		
		// 작은 따옴표 '' : Character 자바에서는 1글자를 표현하는 데이터 타입 / 다른 언어에서는 문자열로 인정
		System.out.println('h'); // 문자
		System.out.println("h"); // 문자열
//        System.out.println('hhh'); -- 에러 1글자 이상을 문자열 ""
		
		// \ escape : 문자의 임무를 일시적으로 없애는 것 
		
		// 줄바꿈을 하고 싶다면?
	
		// \n : 줄바꿈해주는 문자 (new line 약자)
		System.out.println("hello \nWorld"); 
		
	    // "" 따옴표를 출력하고 싶을경우? \"\"   
		// : "" 문자열의 시작과 끝을 알리는 의미를 없앤것
		System.out.println("hello \"World\"");  // hello "World"

	}

}
