package assignment;

public class OperationEx2 {

	public static void main(String[] args) {

		/* 산술연산자 
		* 사칙연산에 사용됨 : / * - + %
		* % 는 나머지 구하는 연산자 : 숫자 n의 나머지는 0 ~ n-1 범위의수*/
		
		/* 증가 감소 연산자 (단항) ++ -- 
		* 1만큼 더하거나 뺄때 사용함 
		* 항의 앞/뒤 위치에 따라 연산 결과가 달라짐*/
		
		// 항의 앞에 ++(--) 있는 경우
		int num1 = 10;
		//-> 출력이 되기전에 +1 일을 더해라
		System.out.println(++num1); // 11
		
		// 항의 뒤에 ++(--)있는 경우 
		int num2 = 10;
		//-> 출력이 된 후에  
		System.out.println(num2++); // 10
		// +1 일을 더해라
		System.out.println(num2); // 11
		
		/* 관계연산자 (이항)
		 * 연산의 결과가 true / false로 변환됨 */
		
		System.out.println(4 > 3); // true 
		
		
		int num3 = 3;
		int num4 = 4; 
		boolean flag = (num4 < num3); // 4 < 3 ?
		System.out.println(flag); // false
		
		/* 논라연산자  && , ||
		 * 연산의 결과가 true / false로 변환됨 
		 * && : 둘다 true 여야함
		 * || : 둘 중 하나만  true여도 됨*/
		int num10 = 10;
		int i = 2;
		// 20 < 10 ? false 뒤에 식은 실행되지 않고, false 값이 value에 대입된다.
		boolean value = (((num10 = num10 + 10) < 10) && ((i-11+2) > 10 ) );
		System.out.println(value); // false
		System.out.println(num10); // 20
		System.out.println(i); // 2

		
	}

}
