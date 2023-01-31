package cha5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		// 정의한 함수 사용, 함수 호출하기
		int sum = addNum(num1, num2);
		System.out.println(sum); // 40
	}
	// 함수 정의 addNum
	// 반환하는 값이 없으면 int X -> void를 적으면된다. 
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
