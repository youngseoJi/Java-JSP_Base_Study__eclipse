package loopex;

public class ForEx {

	public static void main(String[] args) {
		/* 중첩 반복문
		* 외부 반목문 1회 실행 -> 내부 반목문 처음부터 끝까지 실행
		*/
		
		int dan;
		int times;
		// 외부 반복문 : 1 부터 9단 까지 
		for (dan =1; dan <= 9; dan ++) {
			// 내부 반복문 : 1 부터 9까지 반복해서 출력 및 +1 씩 값을 더한다.
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			// 내부 반복문 종료할때마다 실행할 코드 : 한칸 띄기 
			System.out.println();
		}
	
	
	int dan2 = 2;
	int times2 = 1;
	// 외부 반복문 : 1 부터 9단 까지 
	while (dan2 <= 9) {
		// 초기값으로 초기화 필수 (times2가 9가 되었으니 1부터 다시 곱해줘야한다.)
		times2 = 1;
		// 내부 반복문 : 1 부터 9까지 반복해서 출력 및 +1 씩 값을 더한다.
		while (times2 <= 9) {
			System.out.println(dan2 + "X" + times2 + "=" + dan2*times2);
			times2++; 
		}
		// 내부 반복문이 끝나면 증가
		dan2++;
		// 내부 반복문 종료할때마다 실행할 코드 : 한칸 띄기 
		System.out.println();
		}
	
	}
}
