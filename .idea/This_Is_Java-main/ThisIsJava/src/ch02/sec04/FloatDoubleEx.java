package ch02.sec04;

// 실수 타입
// float : 4byte 32bit   7자리
// double : 8byte 64bit   15자리 / 더 정밀한 실수저장 (약 2배 유효자릿수와 정밀도)

// 디폴트 double 타입으로 컴파일러 해석 -> float 타입 : 리터럴 뒤 f 또는 F로 타입 표기필수

public class FloatDoubleEx {

	public static void main(String[] args) {
		// 정밀도
		float varF1 = 0.123456789101112f;
		double varD1 = 0.123456789101112;
		System.out.println(varF1); // 0.12345679
		System.out.println(varD1); // 0.123456789101112 
		// double 타입이 약 2배 유효자릿수르 갖음 -> 정밀도 높음 -> 정확한 데이터 저장가능
		
	}

}
