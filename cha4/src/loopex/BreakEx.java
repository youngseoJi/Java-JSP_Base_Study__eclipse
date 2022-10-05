package loopex;

public class BreakEx {

	public static void main(String[] args) {

		/* break 문
		 * 반복문에서 break문을 만나면, 더이상 반복을 수행하지ㅡ ㅇ낳고 반복문 탈출
		 * 자기를 감싸고 있는(가장 가까운) 반복문만 탈출한다.
		 */
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			
			// 100 보다 sum이 커지면, 자기를 감싸고 있는 반복문만 탈출한다.
			if (sum > 100)
				break;
			num++;
			
			}
			
			System.out.println(sum); // 105
			System.out.println(num); // 14
	}
	
}
