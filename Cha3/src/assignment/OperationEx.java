package assignment;

public class OperationEx {

	public static void main(String[] args) {
		
		/* 대입 연산자 
		* 우선순위가 가장 낮는 연산자 , 모든 연산 후 마지막에 대입됨
		* 변수의 값을 변경하는 연산자
		*/
		int age = 24;
		System.out.println(age); // 24
		
		age = 40;
		System.out.println(age); // 40
	
		/* 부호 연산자 (단항)
		* 양수 / 음수의 표현, 값의 부호를 변경하는 연산자
		*/
		int num = 10;
		int num2 = -num;
		
		System.out.println(num); // 10
		System.out.println(num2); // -10
	}

}
