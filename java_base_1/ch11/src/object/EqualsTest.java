package object;

// 학생 클래스
class Student {
	int stID; // 식별자
	String stName; // 이름
	
	Student(int stID, String stName) { // 필수 매개변수
		this.stID = stID;
		this.stName = stName;
	}

	// equals 메서드 재정의하기 -> 인스턴스 주소비교가 아닌, 값이 같은지 비교하는 메서드로 재정의
	@Override
	public boolean equals(Object obj) {
		// Student가 객체, 인스턴스인 경우
		if( obj instanceof Student) {
			// obj를 Student 타입으로 변경하여 st 대입
			Student st = (Student)obj;
			
			// 학생 식별자와 st의 식별자가 같다면 true -> 즉 같은 사람이라면, 인스턴스 주소 비교가 아닌 값비교
			if(stID == st.stID) {
				return true;
			} // 값이 다르다면 false
			else { 
				return false;
			}
		}// 객체가 아니라면  false
		return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("T");
		String str2 = new String("T");
		System.out.println(str1 == str2); // 인스턴스(주소)가 동일한지 -> false
		System.out.println(str1.equals(str2)); // 문자가 같은지 -> true
		

		Student st1 = new Student(01, "영서");
		Student st2 = new Student(01, "영서");
		
		// equals 메서드 재정의한 결과
		System.out.println(st1 == st2);  // 인스턴스(주소)가 동일한지 -> false
		System.out.println(st1.equals(st2));   // 값이 같은지 -> true
		/*
		System.out.println(st1 == st2);  // 인스턴스(주소)가 동일한지 -> false
		System.out.println(st1.equals(st2));  // 인스턴스(주소)가 동일한지 -> false
		// 원래 equals 클래스가 == 랑 동일한 기능 */

	}

}
