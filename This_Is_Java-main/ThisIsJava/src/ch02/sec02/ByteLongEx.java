package ch02.sec02;

// Byte 타입 변수 : byte -128~127  허용 법위 
// Long 타입 변수 : 수치가 큰 데이터를 다루는데 사용됨. 
// int 타입 변수의 범위를 초과할경우 -> Long 타입은 리터럴 뒤에 l 또는 L을 붙여줘서 타입을 알려줘야함. 안붙이면 int 타입으로 여김
public class ByteLongEx {

	public static void main(String[] args) {

		byte var1 = -128;
		byte var2 = 127;
	//	byte var3 = 128;// 허용범위를 넘어 컴파일 에러발생
		
		//System.out.println(var3);
		
		long var3 = 10;
		long var4 = 20L;
//		long var5 = 10000000000;  // L 이 없어서 int로 인식 -> 컴파일 에러 발생
		long var6 = 10000000000L;  // L Long타입으로 인식 
		
		
	}

}
