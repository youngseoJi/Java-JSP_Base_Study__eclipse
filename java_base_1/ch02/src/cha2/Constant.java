package cha2;

public class Constant {

	public static void main(String[] args) {

		// 상수 (변하지 않는 값)
		/*상수 선언 : final 키워드 사용
		 *재선언 불가능
		 *상수를 재활용할 수 있다. 값을 변경하면 해당 상수의 값이 모두 변경되니*/
		
		
		// 리터럴(literal)
		/* 리터럴 : 프로그램에서 사용하는 모든 숫자, 값, 논리 값 -> 예) 10, 3.14, ‘A’, true
		 * 리터럴에 해당되는 값은 특정 메모리 공간인 상수 풀(constant pool)에 있음 -> 필요한 경우 상수 풀에서 가져와서 사용
		 * 상수 풀에 저장 할 때 정수는 int로 실수는 double로 저장
		 * 따라서 long 이나 float 값으로 저장해야 하는 경우 식별자 (L, I, F, f)
		*/
		final int MAX_MUM = 100;
		final float PI = 3.14f;
		
		final int STUDENT_MUM = 30;
		int num = 0;
		if (num == STUDENT_MUM) {
			
		}
		System.out.println(STUDENT_MUM);
	}

}
