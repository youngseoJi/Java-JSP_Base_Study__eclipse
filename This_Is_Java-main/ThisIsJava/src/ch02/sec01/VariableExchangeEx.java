package ch02.sec01;

public class VariableExchangeEx {

	public static void main(String[] args) {

		// 변수 할당 값 교환하기
		
		int oldAge = 30;
		int youngAge = 20;
		
		System.out.println("oldAge: " + oldAge + " youngAge: " + youngAge );
		
		// 두 변수의 값을 변경하기 위한 변수 선언  -> 변경할 변수 1개 값 복사해두기
		int temp = oldAge;
		
		oldAge = youngAge; // oldAge 값을 youngAge 값으로 변경
		youngAge = temp; // temp 에 복사해둔 oldAge 값을 youngAge 에 할당하여 교환 
		
		System.out.println("oldAge: " + oldAge + " youngAge: " + youngAge );
	}

}
