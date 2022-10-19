package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		String str1 = new String("mh");
		
		System.out.println(System.identityHashCode(str1)); // 1763847188
		
		//StringBuilder로 변겅
		StringBuilder buffer = new StringBuilder(str1);
	
		System.out.println(System.identityHashCode(buffer)); // 1617791695
		
		// 연결
		buffer.append(" and ");
		buffer.append("ys");
		// 연결해도 새로운 메모리 생성 X 가비지 메모리 없음
		System.out.println(System.identityHashCode(buffer)); // 1617791695
		
		// toString()으로 문자열로 변환하여 사용함. 
		String str2 = buffer.toString();
		System.out.println(str2); // mh and ys
	}

}
