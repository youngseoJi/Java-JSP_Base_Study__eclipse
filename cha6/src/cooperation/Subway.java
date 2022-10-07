package cooperation;

// 지하철 클래스
public class Subway {

	int lineNumber; // 지하철 라인 번호
	int passengerCount; // 승객수
	int money; // 지하철 탐승 비용
	
	// 버스 (매개변수 버스번호)
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객을 한 명 태웠을 때 받는 돈, 승객 수 증가 메소드 (매개변수 돈)
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	// 정보보는 메소드
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "호선 승객은 " + passengerCount + "명 이고, " + "수입은 " + money + "원 입니다.");
	}

}
