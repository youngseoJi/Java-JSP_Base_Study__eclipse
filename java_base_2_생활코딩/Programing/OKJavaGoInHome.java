import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
// ex) Elevator.java 클래스 이용하여 Elevator 프로그램 생성하기
import org.opentutorials.iot.Security;



// import 특정 클래스 갖고오기 - Elevator

// 이미 있는 것을 활용하여 프로그램 만들어보기 - 이해하기 

// 프로그램을 통해서 많은 일을 자동화할 수 있음을 알아라
public class OKJavaGoInHome {
	 
	public static void main(String[] args) {
//.
		// 중복제거 / 동일한 부분 동시 변경가능
		String id = "JAVA APT 102";

		
		// 1. Elevator call : 엘리베이터 대기 기능

		// myElevator 변수는 Elevator 데이터 타입에 해당되는 데이터만 담을 수 있다.
		Elevator myElevator = new Elevator(id);
		
		// 1층으로 엘리베이터 보내는 명령 / 기능
		myElevator.callForUp(1);
		
		
		// 2. Security off  : 보안 꺼지는 기능
		
		Security mySecutity = new Security(id);
		mySecutity.off();
		
		
		// 3. Light on : 자동 불켜지는 기능
		
		Lighting hallLamp = new Lighting(id + " / HallLamp");
		hallLamp.on(); // 거실 등 끄기
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on(); // 스탠드 끄기
	}

}
