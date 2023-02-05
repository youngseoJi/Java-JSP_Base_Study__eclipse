
// 데이터 타입의 변환
public class Casting {

	public static void main(String[] args) {

		// 실수
		double a = 1.1;
		// 값의 손실이 없기에 자동형변환이 된다.
		// int 정수 1이 double 실수형으로 자동 변환됨
		double b = 1;
		// double b = (double)1;
		System.out.println(b); // 1.0
	
//		int c = 1.1;  -- 에러 발생   실수 1.1을 정수 1로 변환한다면 0.1 손실이 생성되기에
		
		double d = 1.1;  
		
		
		int e = (int) 1.1;  
		System.out.println(e); // 1
		
		
	     
		
		// 숫자를 문자로 형변환
		int i = 1;
		String strInt = Integer.toString(i);
		System.out.println(strInt); // 1 
		System.out.println(strInt.getClass()); // class java.lang.String 문자형 
	}

}
