package others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// 한 줄 읽기, 정수읽기 , 쉼표 등 구분자를 두고 읽을 수 있기 등
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int num = scanner.nextInt();
	
		System.out.println(name);
		System.out.println(num);
	}

}
