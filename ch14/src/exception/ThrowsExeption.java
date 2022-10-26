package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {

	// throws : 이셉션/에러 미루기, 헨들링 미룸
	public Class loadClass(String fileName,String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsExeption ex = new ThrowsExeption();
	
		// throws 로 미룬 에러헨들링 하는것 - 사용하는 곳에서 헨들링
		try {
			ex.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} 
		
		// 예외가 다양한 경우, Exception 최상위 클래스로 그외 예외처리 -> 마지막 블록에 위치해야함
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end"); 
	}

}
