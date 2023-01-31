package loopex;

public class ContinueEx {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			
			// 홀수인 경우 continue문 실행
			// continue문 : 나머지 반복문을 실행하지 않고 탈출한다.
			if((num % 2) == 1) {
				continue;
			}
			total += num;
		}
		System.out.println(total); //2550 
	}

}
