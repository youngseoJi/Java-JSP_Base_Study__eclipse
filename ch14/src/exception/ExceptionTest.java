package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// finally 구문이 없어도 close()가 자동실행된다.
		
		// 파일을 읽어들이는 클래스
		try (FileInputStream fis = new FileInputStream("a.txt")){
			// 생성 - 파일열기
		} catch (IOException e) {
			System.out.println("e");
		}
		System.out.println("end");
	}
		/*
		try {
			// 생성 - 파일열기
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			// 마무리 파일 닫아주기
			try {
				// 파일이 있으면 닫아주고
				fis.close();
				// 파일이 없는경우 인셉션
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}
	*/

}
