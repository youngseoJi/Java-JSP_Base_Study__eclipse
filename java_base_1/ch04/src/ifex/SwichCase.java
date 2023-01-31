package ifex;

public class SwichCase {

	public static void main(String[] args) {

		int rank = 1;
		char medal;

		switch(rank) {
		// 경우 1이 true인 경우 ( 메달이 'G' 일 경우 )
		case 1: medal = 'G';
		// break문 만나면 해당 값 출력 (G 출력)
				break;
		case 2: medal = 'S';
				break;
		case 3: medal = 'B';
				break;
		// default 문 -> 모든 case 경우에 false일 경우 출력
		default: medal = 'A';
//		break; 생략가능  
		}
		System.out.println(rank +"등 메달의 색깔은 " + medal + "입니다. ");
	}

}
