package ch02.sec01;

public class VariableIntEx {
   // 클래스명은 대문자로시작 카멜
	public static void main(String[] args) {
		
		// 변수는 소문자로 시작 카멜
		// int value;  초기화 되지않은 변수 연산식에 사용 불가 -> 컴파일 에러발생
		int value = 0; //  변수를 초기화해야한다.
		
		int add = value + 30; 
		
		System.out.println(add); // 30
		
		int hour = 1;
		int minute = 30;
		// 변수를 + "문자열"과 함께 출력 
		System.out.println(hour + "시" + minute + "분"); //1시30분
		
		// 연산식 과 결합
		int totalMinute = (hour*60) + minute;
		
		System.out.println("분으로 변경하면 " + totalMinute + "분"); // 분으로 변경하면 90분

	}

}
