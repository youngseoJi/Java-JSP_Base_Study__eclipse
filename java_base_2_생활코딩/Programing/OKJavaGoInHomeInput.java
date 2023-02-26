import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
// ex) Elevator.java 클래스 이용하여 Elevator 프로그램 생성하기
import org.opentutorials.iot.Security;



// 기능 추가한 클래스 : 입력한 텍스트 값으로 대입되게 
public class OKJavaGoInHomeInput {
	
	public static void main(String[] args) {

		// id : 고정된 값이 아닌 입력한 값으로 변환되게 함.
		String id = JOptionPane.showInputDialog("Enter a ID");
		
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
