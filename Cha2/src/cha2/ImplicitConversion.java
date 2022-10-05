package cha2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		/* 자동 형변환 
		 * 1. 작은 수에서 큰수로 대입/
		 * 2. 덜 정밀한 수에서 더 정밀한 수로 대입*/
	
		byte bNum = 10;
		int num = bNum; // 10 
		
		System.out.println(num);
		
		
		// long 8byte = 10 리터럴 (4byte) 대입
		long lNum = 10; 
		// float 4byte 실수 =  10 리터럴 (4byte) 정수 대입
		// -> 실수 float 가 더 정밀하기에, 정수 10은 실수로 자동 형변환
		float fNum = lNum; // 10.0

		System.out.println(fNum);

		// 1. 더해지는 연산 실수 + 정수 -> float 실수로 자동 형변환
		// 2. 더해진 값이 float 보다 double 더 큰 타입으로 자동 형변환
		
		double dNum = fNum + num;
		
		System.out.println(dNum); // 20.0
	
		
	}

}
