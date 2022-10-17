package interfaceex;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급 높은 순으로 전화를 먼저 연결함");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("경력이 높은 상담원 순으로 업무를 우선적 배분함");
	}

		
}
