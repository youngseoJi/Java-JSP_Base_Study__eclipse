

// 변수

// 자바느 변수의 타입을 왜 미리 지정해줘야하는가? 
// - 불편한점 :변수에 타입에 따라서 넣을 수 없는 데이터가 있어서 불편
// - 장점 : 변수에는 반드시 어떤 타입이 온다 정의해놓으면, 그것이 아닌 정보가 들어갈때 컴파일이 안된다.
// 변수안에 값이 있다면? 
// 변수안의 값은 반드시 어떤 타입임을 확신할 수 있음, 꺼낼때마다 다른 타입일지 생각할 필요없다.
public class Variable {

	public static void main(String[] args) {

		// 변수에 담길 데이터 타입 지정 + 변수 = 데이터 
		
		// integer 정수
		int a=1; 
		System.out.println(a);
		
		// double 실수
		double b = 1.1;
		System.out.println(b);
        
		// int b = 1.1;  -- 에러 정수타입인 b에 실수 담기지 못함
		
		// String 문자열
		String c = "hello";
		System.out.println(c);
		
	}

}
