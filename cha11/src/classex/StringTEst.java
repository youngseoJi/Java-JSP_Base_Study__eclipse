package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class StringTEst {

	public static void main(String[] args) throws ClassNotFoundException {

		// Class 동적로딩
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		// Constructor 값 모두 조회 ->cons 값 모두 갖고와서 c에 넣기
		for(Constructor c: cons) {
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		// fields 값 모두 조회
		for( Field f : fields) {
			System.out.println(f);
		}
		
	}

}
