package cooperation;

// 멤버 변수(member variable)는 메소드 밖에서 선언된 변수

// 학생 클래스
public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		// 멤버 변수                      // 지역변수
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 버스를 탈 때 호출 메소드 (반환값 없는 함수) - 매개변수 (생성된 버스 인스턴스)
	public void takeBus(Bus bus) {
		// bus클래스의 .take 함수 : 비용 1000원 + 되고, 승객수 +1 되는 함수 
		bus.take(1000);
		// 탑승비 1000원을 지출한다. 
		money -= 1000;
	}
	
	// 학생이 지하철 탈 때 호출 메소드 (반환값 없는 함수) - 매개변수 (생성된 버스 인스턴스)
		public void takeSubway(Subway subway) {
			// subway클래스의 .take 함수 : 비용 1500원 + 되고, 승객수 +1 되는 함수 
			subway.take(1500);
			// 탑승비 1500원을 - 지출한다. 
			money -= 1500;
			
		}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다");
	}
}
