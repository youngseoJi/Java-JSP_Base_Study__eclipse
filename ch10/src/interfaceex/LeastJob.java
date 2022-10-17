package interfaceex;

// Scheduler 인터페이스 상속 -> 설정해놓은 기능 구현할것
public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		 System.out.println("상담 전화를 걸려온 순서대로 대기열에서 갖고옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 상담원에서 상담전화를 할당함");
	}

	

}
