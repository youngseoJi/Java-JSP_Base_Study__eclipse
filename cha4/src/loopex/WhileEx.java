package loopex;

public class WhileEx {

	public static void main(String[] args) {

		// 반복문 while 문
		int num = 1;
		int sum = 0;
		
		// while(반복 조건식) :  참인경우 무한반복
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		// false 거짓인 겨우 while문 탈출, {} 밖의 코드 출력
		System.out.println("1~10까지 합은 " + sum + "입니다 .");	
	
		

		
		
		// 반복문 do .. while문
		int num2 = 1;
		int sum2 = 0;
	
		// do : 꼭 한번 실행 한다.
		do {
			sum2 += num2;
			num2++;
		}
		// while(반복 조건식) :   참인경우 무한반복
		while(num2 < 1 );
		// false 거짓인 겨우 while문 탈출, {} 밖의 코드 출력
		System.out.println(sum2 + "입니다 .");	 // 1입니다 .

	

		int num3 = 1;
		int sum3 = 0;
		while(num3 < 1) {
			sum3 += num3;
			num3++;
		}
		// false 거짓인 겨우 while문 탈출, {} 밖의 코드 출력
		System.out.println( sum3 + "입니다 ."); // 0입니다 .


	}
}