package loopex;

public class WhileEx {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		// 반목문 조건 - 참인경우 무한반복
		while(num <= 10) {
			sum += num;
			num++;
		}
		// false 거짓인 겨우 while문 탈출, {} 밖의 코드 출력
		System.out.println("1~10까지 합은 " + sum + "입니다 .");	
	}

}
