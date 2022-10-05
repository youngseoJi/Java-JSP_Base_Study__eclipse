package cha2;

public class ExplicitConversion {

	public static void main(String[] args) {

		
		/* 묵시적 형변환 
		 * 변환되는 자료형을 명시해야 함 
		 * 자료의 손실이 발생할 수 있음*/
		
		// 1byte의 데이터는 -128~127 = iNum의 값 1000 
		int iNum = 1000;
		
		// int -> byte 로 변환
		// 큰수에서 작은 수로 대입할 수 없어서, 값이 손실됨
		byte bNum = (byte)iNum; 
		
		System.out.println(iNum); // 1000
		System.out.println(bNum); // -24
		
		
		
		// double 실수  
		double dNum = 3.14;
		// int 정수로 형변환 -> 소수 점 이하 유실, 정수로 변환 
		iNum = (int)dNum; 
		
		System.out.println(dNum); // 3.14
		System.out.println(iNum); // 3

		
		// float 실수
		float fNum = 0.9F;
		
		// 각각 형변환 한 후 연산을 한 경우 : int로 각각 형변환 후 - > 값을 합한 후 -> int num1 정수형에 대입
		// 3 + 0 = 3 
		int num1 = (int) dNum + (int) fNum;
		// 연산의  결과를 형변환 한 경우 : 값을 합한 후  -> int로 형변환 후 -> int num2 정수형에 대입
		// 3.14 + 0.9 = 4.23 -> 4    
		int num2 = (int) (dNum + fNum);
		
		System.out.println(num1); // 3
		System.out.println(num2); // 4
	}

}
