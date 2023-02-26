import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;



// 기능 추가한 클래스 : 입력한 텍스트 값으로 대입되게 
public class OKJavaGoInHomeInput {
	
	public static void main(String[] args) {

		// showInputDialog() : 팝업창 뜸 -> 입력값 작성 -> id : 항상 고정된 값이 아닌 사용자가 입력한 값으로 변환되게 함.
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright");
		
		
		
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
		hallLamp.on(); // 거실 등 키기 
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on(); // 스탠드 키기 
		
		DimmingLights moodLamp = new DimmingLights(id + " / moodLamp");
		// 무드등 키기 - setBright 기능 : ~% 밝기로 조절하도록 
		// String 형 -> Double 형 변형  Double.parseDouble(bright)
		moodLamp.setBright(Double.parseDouble(bright)); 
		// "10" 입력시  -> 10 숫자형변형   (10% 무드등이 켜지는 기능 실행되는 것 )
		moodLamp.on(); 
	}

}
