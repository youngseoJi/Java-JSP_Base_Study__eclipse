package cooperation;

// 버스 클래스
public class Bus {

	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 버스비
	
	// 버스 (매개변수 버스번호)
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 승객을 한 명 태웠을 때 호출되는 메소드 (매개변수 돈)
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	// 정보
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명 이고, " + "수입은 " + money + "원 입니다.");
	}

}
