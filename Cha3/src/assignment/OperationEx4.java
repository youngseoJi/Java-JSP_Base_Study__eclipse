package assignment;

public class OperationEx4 {

	public static void main(String[] args) {
		
		/* 복합대입연산자
		 * 대입연산자와 다른연산자를 함께 사용함 단축*/
		int num1 = 10;
		// 1을 더한 후 num1에 대입
		System.out.println(num1 += 1); // 11
		// 10으로 나눈 후 나머지값 num1에 대입
		System.out.println(num1 %= 10); // 1
		
		num1 -= 1; // num1 = num1 - 1 
		System.out.println(num1); // 0
		
		/* 조건연산자 - 삼항연산자
		 * 조건식의 결과자 참인 경우 ? : 앞의 값을 출력, 거짓인 경우 : 뒤에 값 출력 */
		
		int num = (5 < 3) ? 10 : 20;
		System.out.println(num); // 20	
		
		
		}

}
