package cha5;

// 클래스 생성하기 : 학생
// class(예약어) class명 {}
// class 명 : 맨 앞글자 대문자 , 메소드명 : 소문자
public class Student {
	
	// 변수 생성
	int studentID; 		// 학생 식별자
	String studentName; // 학생이름
	int grade; 			// 학년
	String address; 	// 주소
	
	// 자바 컴파일러는 생성자가 하나도 없을경우, 디폴트 생성자를 자동 제공함 (매개변수가 X)
	// -> public Student(){}
	// 직접 디폴트 생성자를 생성해도된다.
	public Student() {}
	
	// 매개변수가 필요한 경우는 생성자를 직접 만들어준다.
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
	}
	
	// 메서드 셍성 - 반환값이 없는 경우 void를 적음
	public void showStudentInfor() {
		System.out.println(studentName  + " , " + address); 
	}
	
	// 반환값이 있는 경우 값의 타입을 적음
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
