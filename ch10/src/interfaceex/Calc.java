package interfaceex;

// interface 에서 선언한 메서드와 변수 : 모두 추상화 메서드 & 상수

public interface Calc {
	// puvlic statuc final 생략된것

	double PI = 3.14;
	int ERROR = -99999999;

	// public abstact 생략된 것
	
	// 설계 : 이 메서드는 어떤 것이다 선언
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 디폴트 메세드
	default void description() {
		System.out.println("정수 계산기 구현");
	}
	
	// static 메서드 : 인스턴스의 생성과 상관없이 사용가능, 생성 전 사용가능
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		return total;
	}
	

}
