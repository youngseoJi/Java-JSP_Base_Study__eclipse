package ifex;

public class SwitchCase2 {

	public static void main(String[] args) {

		int month = 10; 
		int day;
		
		switch (month) {
		// case의 조건이 같을 경우 합해서 쓸 수 있다.
		case 1: case 3: case 5:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: 
			day = 30;
			break;
		default:
			day = 0;
//			break; 생략가능 
		}
		System.out.println(month + "월은 " + day + "일 까지 있습니다. ");
	}

}
