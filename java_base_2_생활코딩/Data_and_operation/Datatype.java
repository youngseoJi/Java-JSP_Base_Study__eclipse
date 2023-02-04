// 데이터 타입 다시 익히기

// 데이터 타입별로 가능한 연산방벙이 있기에 엄격히 구분해야한다. 

public class Datatype {

	public static void main(String[] args) {
		System.out.println(6); // number
		System.out.println("six"); // string
		
		System.out.println("6"); // string
		
		System.out.println(6 + 6); // 사칙연산 12
		System.out.println("6" + "6"); // 결합연산자 66 
		
		System.out.println(6*6); // 36
		
		// 문자열은 곱하기 연산 불가
//		System.out.println("6"*"6"); -- 에러 발생
		
		System.out.println("1111".length()); // 문자열 길이구하는 연산 4
//		System.out.println(1111.length()); -- 에러발생
		

		// ctrl + space 자동완성


	}

}
