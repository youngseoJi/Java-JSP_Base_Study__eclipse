package string;

public class StringTest {

public static void main(String[] args) {

	// new 생성자로 생성한,인스턴스는 다른 메모리를 가리킨다.
	String str1 = new String("abc");
	String str2 = new String("abc");
	
	System.out.println(str1 == str2); //false -> 두개 인스턴스의 주소가 다름
	
	// 상수를 직접 가리키면, 동일한 메모리를 가리킨다.
	String str3 = "abc";
	String str4 = "def";
	System.out.println(str3 == str4); //true -> 같은 메모리를 가리킨다.

	String str5 = new String("abc");
	String str6 = new String("def");
	
	str5 = str5.concat(str6);
	
	// new 로 생성한, String 클래스 문자열을 연결할때마다 매번 새로운 메모리를 생성한다. 가비지, 사용안하는 메모리가 너무 많아진다.
    // -> 해결방안 StringBuilder, StringBuffer 사용하기 
	System.out.println(str5); //abcdef
	
}
	
}
