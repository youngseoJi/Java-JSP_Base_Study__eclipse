package interfaceex;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		
		System.out.println("전화 상담 배분방식 선택- A,B,C");
		// ASCII 코드 값 호출 -> 받은 문자를 그대로 표시하고 싶다면 자료형 char로 형변환
		int ch = System.in.read(); // IOException
		Scheduler scheduler = null;// 초기화
		
		// 배분방식이 무엇이냐에 따라서(문자 타입이 무엇이냐에 따라서), 다른 인스턴스 생성 - 다른 구현 객체 생성
		if(ch == 'A' || ch == 'a') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'B' || ch == 'b') {
			scheduler = new LeastJob();
		}
		else if(ch == 'C' || ch == 'c') {
			scheduler = new PriorityAllocation();
		}
		// 정의 되지 않은 방식, 타입이 지정되면 출력
		else {
			System.out.println("지원하지 않는 기능");
			return;
		}
		
		// 다형성 - 같은 메서드를 불렀지만 각 인스턴스에 따라서 구현되는 코드가 달라짐!!
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
